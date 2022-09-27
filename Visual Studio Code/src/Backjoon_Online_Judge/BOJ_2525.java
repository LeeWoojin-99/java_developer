package Backjoon_Online_Judge;

import java.util.Scanner;

/* 
14 30
20

14 50

17 40
80

19 0

23 48
25

0 13
 */
public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time[] = new int[2]; // index0:시, index1:분
        int cook = 0;

        for(int i=0; i<time.length; i++){
            time[i] = sc.nextInt();
        }
        cook = sc.nextInt();

        // test code
        // for(int i: time) System.out.print(i+" ");
        // System.out.println();
        // System.out.println(cook);

        int cookArr[] = new int[2];
        cookArr[0] = cook/60; // 시
        cookArr[1] = cook%60; // 분

        time[1] += cookArr[1];
        time[0] += time[1]/60;
        time[1] %= 60;
        time[0] = (time[0]+cookArr[0])%24;

        for(int i: time){
            System.out.print(i+" ");
        }

        sc.close();
        
    }
}
