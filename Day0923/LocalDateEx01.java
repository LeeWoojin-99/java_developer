package Day0923;

import java.time.LocalDate;

public class LocalDateEx01 {
	public static void main(String[] args) {
		// 1.8 버전 이후부터 LocalDate, LocalTime, LocalDateTime의 사용을 권장한다.
		// Date는 비권장된다.
		// Calendar는 아직도 많이 쓰인다.
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println(today.getDayOfYear()); // 1월 1일을 기준으로 몇일이 지났는지
		System.out.println(today.getMonthValue());
		LocalDate date = LocalDate.of(2012, 7, 27);
		System.out.println(date);
		
	}
}
