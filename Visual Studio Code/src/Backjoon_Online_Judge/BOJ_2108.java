package Backjoon_Online_Judge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
산술평균 : N개의 수들의 합을 N으로 나눈 값
중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
최빈값 : N개의 수들 중 가장 많이 나타나는 값
범위 : N개의 수들 중 최댓값과 최솟값의 차이

첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
둘째 줄에는 중앙값을 출력한다.
셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
넷째 줄에는 범위를 출력한다.
 */

/* 
5
1
3
8
-2
2


5
-1
-2
-3
-1
-2
 */

public class BOJ_2108 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[8001];
        // -4000 ~ -1, 0, 1 ~ 4000
        // 3999 1 3999
        // index 0 ~ 7999

        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            list.add(num);
            sum += list.get(i);

            // 최빈값을 위한 작업
            if(num < 0){ // 음수
                // -1은 4001번지에 담긴다.
                arr[4000-num] ++;
            }else arr[num] ++; // 자연수, 0
        }

        ArrayList<Integer> mode = new ArrayList<>();
        mode.add(0);
        int frequency = 0; // 이걸 이용하는 것부터 시작하기
        for(int i=0; i<arr.length; i++){
            if(frequency <= arr[i]){ // mode에 숫자 추가
                if(frequency < arr[i]){
                    mode = new ArrayList<Integer>(); // 새로운 빈도의 수가 등장했으므로 리스트 초기화
                    frequency = arr[i];
                }

                if(i>4000){
                    mode.add(4000-i); // 숫자 추가
                }else{
                    mode.add(i);
                }
            }
        }

        Collections.sort(list);
        Collections.sort(mode);
        
        // System.out.println("mode : \n"+mode);
        // System.out.println("정답");
        System.out.println(Math.round((double)sum/list.size())); // 산술평균
        System.out.println(list.get((list.size()-1)/2)); // 중앙값
        System.out.println(mode.size()>1? mode.get(1): mode.get(0)); // 최빈값
        System.out.println(list.get(list.size()-1)-list.get(0)); // 범위
    }
}
