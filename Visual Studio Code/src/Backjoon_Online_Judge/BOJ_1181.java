package Backjoon_Online_Judge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

/* 
BOJ 1181
 */

/* 
입력 예제
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
 */

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // String arr[] = new String[n];
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<n; i++){
            set.add(br.readLine());
            // arr[i] = br.readLine();
        }

        String arr[] = set.toArray(new String[0]);
        

        Arrays.sort(arr, (a, b)->{
            if(a.length() == b.length()){
                return a.compareTo(b);
            }else return a.length()-b.length();
        });

        // System.out.println("- - - -result");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]+"\n");
        }
        System.out.println(sb);
    }
}
