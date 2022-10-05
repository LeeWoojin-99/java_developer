
import java.util.Arrays;

public class LWJ {
    public static void main(String[] args) {

        int arr[][] = {{1,2},{2,3},{3,4},{2,4}};

        Arrays.sort(arr, (a, b)->{
            if(a[0] == b[0]){ // x좌표의 값이 같다면
                return a[1] - b[1]; // y좌표를 오름차순 정렬
            }else return a[0] - b[0];
            // x좌표의 값이 다르다면 x좌표를 오름차순 정렬
        });

        for(int i[]: arr){
            for(int j: i) System.out.print(j+" ");
            System.out.println();
        }
    }
}
