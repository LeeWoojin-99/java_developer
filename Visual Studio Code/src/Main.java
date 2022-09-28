import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
10
5
2
3
1
4
2
3
5
1
7
 */

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10000+1];
        int num = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<num; i++){
            arr[Integer.parseInt(bf.readLine())]++;
        }
        
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<arr.length; i++){
            while(arr[i] > 0){
                sb.append(i).append("\n");
                arr[i] --;
            }
        }

        System.out.println(sb);

        sc.close();
    }
}
