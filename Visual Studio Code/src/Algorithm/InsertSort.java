package Algorithm;
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

public class InsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[sc.nextInt()];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
            for(int j=i; j>0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else break;
            }
        }

        for(int i: arr) System.out.println(i+" ");

        sc.close();
    }
}
