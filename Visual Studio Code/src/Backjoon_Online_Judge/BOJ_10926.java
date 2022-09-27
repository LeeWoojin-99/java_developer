package Backjoon_Online_Judge;

import java.util.Scanner;

public class BOJ_10926 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        if(1000 <= input && input <= 3000){
            System.out.println(input-543);
        }

        scan.close();
    }
}
