package Algorithm;
import java.io.BufferedReader;
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

public class CountingSort {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[10000000];
        int num = Integer.parseInt(bf.readLine());
        
        for(int i=0; i<num; i++){
            arr[Integer.parseInt(bf.readLine())]++;
        }
        
        for(int i=1; i<arr.length;){
            if(arr[i] > 0){
                arr[i] --;
                System.out.println(i);
            }else{
                i++;
            }
        }

        sc.close();
    }
}
