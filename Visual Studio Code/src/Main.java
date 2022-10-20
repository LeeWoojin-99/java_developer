import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        System.out.println(Fibonacci(list, n));
        sc.close();
    }
    static int Fibonacci(ArrayList<Integer> list, int count){
        // System.out.println(list);
        int sum = list.get(list.size()-1)+list.get(list.size()-2);
        if(count < 1) return list.get(list.size()-1);
        if(sum == 0) {
            list.add(1);
            return Fibonacci(list, --count);
        }
        list.add(sum);
        return Fibonacci(list, --count);
    }
    
}