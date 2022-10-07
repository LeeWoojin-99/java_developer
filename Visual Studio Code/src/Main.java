import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        ArrayList<Integer> list = new ArrayList<>();

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            list.add(num);
        }
        HashSet<Integer> set = new HashSet<>(list);

        ArrayList<Integer> result = new ArrayList<>();
        for(int i: list){
            int count = 0;
            for(int j: set){
                if(i>j) count++;
            }
            result.add(count);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i: result){
            sb.append(i+" ");
        }
    }
}