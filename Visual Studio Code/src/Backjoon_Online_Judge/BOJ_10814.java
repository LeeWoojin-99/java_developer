package Backjoon_Online_Judge;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
회원들을 나이가 증가하는 순으로,
나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬
 */

/* 
3
21 Junkyu
21 Dohyun
20 Sunyoung
 */

public class BOJ_10814 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        Student arr[] = new Student[n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = new Student(Integer.parseInt(st.nextToken()), st.nextToken());
        }

        Arrays.sort(arr, (a, b)->{
            return a.getAge() - b.getAge();
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i].toString()+"\n");
        }
        System.out.println(sb);
    }
}


class Student{
    private int age;
    private String name;

    public Student(){}
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return age+" "+name;
    }

    // getter setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}