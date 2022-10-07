package Backjoon_Online_Judge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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

public class BOJ_11650 {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[][] = new int[n][2];
        // for(int i=0; i<arr.length; i++){
        //     arr[i][0] = sc.nextInt();
        //     arr[i][1] = sc.nextInt();
        // }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];
        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (a, b)->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }else return a[0] - b[0];
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        System.out.println(sb);
        // for(int i=0; i<arr.length; i++) System.out.println(arr[i][0]+" "+arr[i][1]);
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[i].length; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // br.close();
    }
}
