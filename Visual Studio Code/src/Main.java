import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/* 
2차원 평면 위의 점 N개가 주어진다.
좌표를 x좌표가 증가하는 순으로,
x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다.
(-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.
 */

/* 
입력 예제
5
3 4
1 1
1 -1
2 2
3 3

1 -1
1 1
2 2
3 3
3 4
 */

public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int x, y;
            x = sc.nextInt();
            y = sc.nextInt();

            if(map.containsKey(x)){ // 같은 x좌표가 있다면
                ArrayList<Integer> list = map.get(x);
                list.add(y);
                map.put(x, list);
            }else{
                map.put(x, new ArrayList<>(Arrays.asList(y)));
            }
        }

        // System.out.println("- - - - result - - - -");
        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        for(int x: keyList){
            
            ArrayList<Integer> list = map.get(x);
            Collections.sort(list);
            map.put(x, list);

            for(int y: map.get(x)){
                System.out.println(x+" "+y);
            }
        }
        sc.close();
    }
}
