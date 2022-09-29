package Backjoon_Online_Judge;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
5 2
100 76 85 93 98
 */

public class BOJ_25305 {
    public static void main(String[] args) throws Exception {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int N, k;
        N = sc.nextInt(); // 응시자의 수
        k = sc.nextInt(); // 상을 받을 사람의 수

        // int x[] = new int[N]; // 각 학생의 점수
        ArrayList<Integer> x = new ArrayList<>();
        for(int i=0; i<N; i++) x.add(sc.nextInt());

        Collections.sort(x);
        int y[] = new int[k];
        for(int i=0; i<k; i++){
            y[i] = x.get(x.size()-1-i);
        }

        System.out.println(y[y.length-1]);

        sc.close();
    }
}
