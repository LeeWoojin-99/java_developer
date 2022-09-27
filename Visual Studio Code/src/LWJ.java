import java.util.Scanner;

public class LWJ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input[] = scan.nextLine().split(" ");
        for(String i: input){
            System.out.println(i);
        }

        scan.close();
    }
}
