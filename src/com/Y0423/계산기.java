package com.Y0423;

public class 계산기 {
	
	public  void main(String[] args) {
		/****************************
		 * 문제) 변수와 메소드를 이용하여 계산기를 만든다.
		 * - 계산기 : 두개의 숫자를 이용하여 연산
		 * 덧셈: int a, int b > a + b; > 결과리턴
		 ****************************/
		System.out.println(덧셈(5, 6));
		System.out.println(뺄셈(5, 6));
		System.out.println((double)나누기(10, 3));
		System.out.println(나머지(25, 6));
		
		int a = 0;
		System.out.println(++a);
		System.out.println(a);
		System.out.println(++a);
	}
	
		
		
	static int 덧셈(int a, int b) {
		return a + b;
	}
	
	static int 뺄셈(int a, int b) {
		return a - b;
	}
	
	static int 나누기(int a, int b) {
		return a / b;
	}
	
	static int 나머지(int a, int b) {
		return a % b;
	}
}
