package Day0923;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatEx01 {
	public static void main(String[] args) {
		// 날짜를 문자열로 format 설정
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd(E)\nhh:mm:ss");
		String dateString = sf.format(date);
		System.out.println(dateString);
	}
}
