
import java.util.Arrays;

public class LWJ {
    public static void main(String[] args) {

        int arr[][] = {{1,2},{2,3},{3,4},{2,4}};

        Arrays.sort(arr, (a, b)->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }else return a[0] - b[0];
        });

        for(int i[]: arr){
            for(int j: i) System.out.print(j+" ");
            System.out.println();
        }
    }
}
