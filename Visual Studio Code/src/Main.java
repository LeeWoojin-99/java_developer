import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
        sc.close();

    }
    static int factorial(int num){
        if(num > 1) return num*factorial(num-1);
        return 1;
    }
}