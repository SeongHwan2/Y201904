package com.Y0422;

public class Main {

	public void main(String[] args) {
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
		
		//특수문자
		char single = '\''; //char는 작은따옴표를 사용해야함
		String quote = "Hello \"홍길동!\"";
		String root = "c:\\";
		System.out.println(single);
		System.out.println(quote);
		System.out.println(root);
		System.out.println("서울\t 대구\t 부산");
		System.out.println("안녕하세요\n 이부분은 다음줄에");
		System.out.println("\uD64D\uAE38\uB3D9");
		
		int x=5, y=5;
		x++;
		y--;
		System.out.println("x=" + x + ",y=" + y);
		x= y = 5;
		++x;
		--y;
		System.out.println("x=" + x + ",y=" + y);
		
		
		
	}
	
}
