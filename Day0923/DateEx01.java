package Day0923;

import java.util.Calendar;
import java.util.Date;

public class DateEx01 {
	public static void main(String[] args) {
//		Date d = new Date(); // depercated 비권장되는
		
		/*
		Calendar 클래스는 추상 클래스이기 때문에 직접 객서
		getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어올 수 있다.
		*/
		Calendar c = Calendar.getInstance();
//		int year = c.get(Calendar.YEAR);
		
		// 시:분:초
		// 년도-월-일(요일)
		
		
		int time[] = new int[4];
		time[0] = c.get(Calendar.HOUR);
		time[1] = c.get(Calendar.MINUTE);
		time[2] = c.get(Calendar.SECOND);
		time[3] = c.get(Calendar.AM_PM);
		System.out.printf("%s %d:%d:%d\n", (time[3]==0)?"AM":"PM",time[0], time[1], time[2]);
		
		int day[] = new int[4];
		day[0] = c.get(Calendar.YEAR);
		day[1] = c.get(Calendar.MONTH)+1;
		day[2] = c.get(Calendar.DATE);
		day[3] = c.get(Calendar.DAY_OF_WEEK);
		String dayOfWeek = null;
		switch(day[3]) {
		case 1:
			dayOfWeek = "일";
			break;
		case 2:
			dayOfWeek = "월";
			break;
		case 3:
			dayOfWeek = "화";
			break;
		case 4:
			dayOfWeek = "수";
			break;
		case 5:
			dayOfWeek = "목";
			break;
		case 6:
			dayOfWeek = "금";
			break;
		case 7:
			dayOfWeek = "토";
			break;
		default:
			break;
		}
		System.out.printf("%d-%d-%d(%s)\n", day[0], day[1], day[2], dayOfWeek);
	}
}