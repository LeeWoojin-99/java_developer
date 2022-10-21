package Backjoon_Online_Judge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/* 
5
AAA
ABBA
ABABA
ABCA
PALINDROME

 */
public class BOJ_25501{
    public static int[] recursion(String s, int l, int r, int count){
        if(l >= r) return new int[]{1, count};
        else if(s.charAt(l) != s.charAt(r)) return new int[]{0, count};
        else return recursion(s, l+1, r-1, count+1);
    }
    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 1);
    }
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s[] = new String[t];
        for(int i=0; i<t; i++){
            s[i] = br.readLine();
            int result[] = isPalindrome(s[i]);
            System.out.println(result[0]+" "+result[1]);
        }
        
        
    }
}