package Day0923;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception06 {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
//		BufferReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String name = br.readLine();
			System.out.println(name);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
