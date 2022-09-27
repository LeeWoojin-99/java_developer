package Backjoon_Online_Judge;

import java.util.Scanner;

/* 
입력 예제
260000
4
20000 5
30000 2
10000 6
5000 8
 */

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total, category;
        total = scan.nextInt();
        category = scan.nextInt();
        for(int i=0; i<category; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            total -= a*b;
        }
        if(total == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        scan.close();
    }
}
