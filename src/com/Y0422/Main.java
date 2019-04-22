package com.Y0422;

public class Main {

	public static void main(String[] args) {
		System.out.println("변수 시작!");
		
		String 문자열 = "Hello World"; // 변수 선언과 대입이 동시에 이루어진것
		
		System.out.println(문자열);// 변수사용
		
		문자열 = "문자열 변경";
		System.out.println(문자열);// 변수값 변경
		
		문자열 = "1234";
		
		System.out.println(문자열);//변수 사용
		
		int 정수 = 1;
		System.out.println(정수);
		
		String 결과값 = 문자열 + (정수 + 정수 + 정수);//사칙연산에서 가장앞에 나오는 자료형에 결과값의 자료형도 따라간다.(변수도 사칙연산 가능!!)
		System.out.println(결과값);
		
		
	}
	
}
