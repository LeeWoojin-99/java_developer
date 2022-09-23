package Day0923;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatEx01 {
	public static void main(String[] args) throws ParseException {
		// 날짜를 문자열로 format 설정
		
		Date date = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd(E)\nhh:mm:ss");
		String dateString = sf.format(date);
		System.out.println(dateString);
		
		// 문자열을 날짜로 바꿔보자
		String dateString2 = "1999-07-27\n00:00:00";
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd\nhh:mm:ss");
		Date date2 = sf2.parse(dateString2);
		System.out.println(date2);
	}
}
