/* 
3 3 6
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 0;
        int count = 0;
        int noon = 0;

        int input[] = new int[3];
        for(int i=0; i<input.length; i++){
            input[i] = sc.nextInt();
        }

        loop:
        for(int i=0; i<input.length; i++){
            for(int j=i+1; j<input.length; j++){
                if(input[i] == input[j]){
                    noon = input[i];
                    count ++;
                    if(count == 2) break loop;
                }
            }
        }
        
/* 
같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. 
*/
        if(count == 2){
            result = 10000+noon*1000;
        }else if(count == 1){
            result = 1000+noon*100;
        }else{
            Arrays.sort(input);
            result = input[2]*100;
        }
        
        System.out.println(result);

        sc.close();
    }
}
