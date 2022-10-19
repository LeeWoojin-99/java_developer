package Backjoon_Online_Judge;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
/* 
5
2 4 -10 4 -9

6
1000 999 1000 999 1000 999
 */
public class BOJ_18870 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // n 입력

        // 좌표 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력된 좌표를 리스트에 담기
        ArrayList<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));

        Object[] sortedArr = list.stream().distinct().sorted().toArray();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<sortedArr.length; i++) map.put((int)sortedArr[i], i);

        StringBuilder sb = new StringBuilder();
        for(int i: list) sb.append(map.get(i)+" ");

        // 출력부
        System.out.print(sb);
    }
}