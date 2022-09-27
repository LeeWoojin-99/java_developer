package Backjoon_Online_Judge;

/* 
0 1 2 2 2 7
2 1 2 1 2 1
 */

import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int chess[] = new int[] {1, 1, 2, 2, 2, 8};

        String inputStrArr[] = sc.nextLine().split(" ");
        int inputInt[] = new int[6];
        for(int i=0; i<6; i++){
            inputInt[i] = Integer.parseInt(inputStrArr[i]);
        }
        
        for(int i=0; i<6; i++){
            System.out.print((chess[i]-inputInt[i])+" ");
        }
    
        sc.close();
    }
    
}
