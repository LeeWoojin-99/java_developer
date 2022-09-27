package Day0923;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalEx {
	public static void main(String[] args) {
		
		/*
		BigDecimal
		값을 초기화하기 위해서는 문자열로 값을 넘겨준다.
		정수 실수 전체를 다룸
		*/
		BigDecimal bd1 = new BigDecimal("200000.1234");
		BigDecimal bd2 = new BigDecimal("100");
		
		// 문자열이라 사칙연산을 이용하여 연산이 불가능
		// add subtract multiply divide remainder
		System.out.println("+ > "+bd1.add(bd2));
		System.out.println("+ > "+bd1.subtract(bd2));
		System.out.println("* > "+bd1.multiply(bd2));
		System.out.println("/ > "+bd1.divide(bd2));
		System.out.println("% > "+bd1.remainder(bd2));
		System.out.println("compareTo > "+bd1.compareTo(bd2));
		// 1크다 0같다 -1작다
		
		BigInteger bi1 = new BigInteger("1234");
		// BigInteger 정수만을 다룬다
		
		// BigInteger 형변환
		// int -> bigInteger
		BigInteger bi2 = BigInteger.valueOf(100000); // 값을 넣을 때 valueOf를 이용하여 넣어야 한다.
		System.out.println(bi2);
		int int_bigNum = bi2.intValue();
		System.out.println(int_bigNum);
		
		// int와 BigInteger의 차이점은 무엇일까 ?
		
		String string_bigstr = bi2.toString();
		System.out.println(string_bigstr);
	}
}
