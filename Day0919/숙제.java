package Day0919;

import java.util.Scanner;

public class 숙제 {
   public static void main(String[] args) {
      /*
       * 야구게임
       * 자리까지 맞으면 스트라이크
       * 숫자만 맞으면 볼
       * 
       * 컴퓨터가 3자리의 숫자를 생성하고
       * 유저가 3자리의 숫자를 맞추는 게임
       * 자리가 일치하는 숫자는 스트라이크
       * 숫자만 맞으면 볼
       * 아무것도 안맞으면 아웃
       * 숫자 중복은 없도록
       */
      
      Scanner scan = new Scanner(System.in);
      
      int size = 3;
      int computer[] = new int[size];
      int user;

      for(int i=0; i<computer.length; i++) {
         while(true) {
            int random = random(9);
            if(checkArr(computer, random)) {
               computer[i] = random;
               break;
            }
         }
      }

      for(int i:computer) System.out.print(i+" "); // test code
      System.out.println(); // test code
      
      while(true) {
         System.out.println("숫자를 입력해주세요");
         user = scan.nextInt();
         
         int result[] = pitch(computer, user);
         
         if(result[0] == 3){
            System.out.println("win !");
            break;
         }else {
             System.out.printf("%dS %dB\n", result[0], result[1]);
         }
      }
      
      
      scan.close();
      
   }
   
   static boolean checkArr(int arr[], int num) {
      // 중복되는 숫자가 있는지 검사
      for(int i:arr) {
         if(i == num) {
            return false;
         }
      }
      return true;
   }
   
   static int random(int size) {
      // 랜덤한 수를 반환
      return (int)(Math.random()*size)+1;
   }
   
   static int judge(int arr[], int num, int cipher) {
      // 스트라이크, 볼, 아웃을 판별해내는 메서드
      // judge : 심판
      // 배열, 숫자, 자릿수를 매개변수로 받는다.
      // return : strike=>2, ball=>1, out=>0
	   
	  // 입력받은 숫자와 배열의 요소값들을 비교하며 같은 값이 있는지
	  // 있다면 자릿수도 같은지 검사
      for(int i=0; i<arr.length; i++){
         // System.out.printf("num: %d, cipher: %d, arr[%d]: %d\n", num, cipher, i, arr[i]); // test code
         if(arr[i] == num){ // num과 비교하여 같다면
            if(i == cipher) return 2; // 자릿수가 같으면 2를 반환. strike
            return 1; // 자릿수는 다르다면 1을 반환. ball
         }
      }
      return 0; // 같은 값이 없다면 0을 반환. out
   }
   
   static int[] pitch(int arr[], int num) {
      // pitch : 투구하다
	   
      int result[] = new int[3];
      // index 0Strike 1BAll 2Out

      int cipher = (int)Math.log10(num); // 자릿수
      // 1=>0, 10=>1, 100=>2, 1000=>3

      while(cipher>=0){
         int temp = num%10; // 가장 오른쪽 숫자 추출
         num /= 10; // 추출해낸 숫자 제거

         // judge method를 통하여 얻은 값을 토대로 result배열의 요소값 제어
         if(judge(arr, temp, cipher)==2) { // strike
            result[0]++;
         }else if(judge(arr, temp, cipher)==1) { // ball
            result[1]++;
         }else { // out
            result[2]++;
         }

         cipher--; // 추출해낸 숫자가 제거되었으니 자릿수에서 1을 감산
      }
      
      return result;
   }
}

/*
 * 숫자를 받아서 String.split("");를 통하여 분리했으면 더 쉬웠을 것 같다.
 * 그런 후에 2중 for문을 이용하여 computer배열과 user배열을 비교
 */