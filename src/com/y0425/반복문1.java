package com.y0425;

public class 반복문1 {
	/******************************************
	 * for문 : for(1, 2, 3){실행문}
	 * 1) 초기화식: for문에서 사용할 변수 선언 및 초기값 정의
	 * 2) 조건식: if문과 동일하게 거짓을 찾기 위한 조건
	 * 3) 증감식: for문에서 사용할 변수를 변화를 주기 위한 식
	 *******************************************/
	
	public void t1() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}//단순 반복
	}
	
	public void t2(int s) {
		System.out.println("반복문 시작");
		for(int i = 0; i < s; i++) {
			System.out.println(i);
		}
		System.out.println("반복문 종료");
	}
	
	public void t3(int a, int b) {
		System.out.println("t3 반복문 시작");
		for(;a < b;a++) {
			System.out.println(a);
		}
		System.out.println("t3 반복문 종료");
	}
	
	public void t4() {// 0 ~ 4
		for(int i = 0; i < 5; i++) {
			if(i % 2 == 0) {
				System.out.println("★");
			}else {
				System.out.println("☆");
			}
			System.out.println("");
		}
	}
	
	
}
