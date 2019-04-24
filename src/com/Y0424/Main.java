package com.Y0424;

public class Main {

	// 1.생성자 : {}
	// >> 생성자 안에 생성자 생성은 하지 않는다.
	// >> 생성자 안에 메소드 생성은 하지 않는다. 
	// 2.변수, 상수 - 클래스전역
	// 3.메소드 : {} > 변수 - 메소드 전역 - 지역
	// >> 메소드 안에 메소드 생성은 하지 않는다.
	// >> 메소드 안에 생성자 생성은 하지 않는다.
	// 4. static(정적) : 만들지 않는다, 단 main메소드만 static 사용.
	// 5. 기능 구현 할 때 가능하면 클래스를 적극 활용한다.
	
	
	
	//int a; // 클래스 전역
	
	//void aa() {
		//int b = 1; // 메소드 전역 
		
		//for(int i = 0; i < 10; i++) {
		//	System.out.println(i); // for문 안에서 사용 가능한 지역변수
		//	System.out.println(i + b);
	//	}
		
		//System.out.println(i);// 사용 불가 i는 for문 안에서만 쓸수있는 지역변수 이기 때문에
	
	public void main(String[] args) {
		계산기 calc = new 계산기();
		//계산기 기능 메소드 연습
		int a = 2;
		int b = 4;
		int c;
		float d;
		calc.테스트(a, b);
		c = calc.덧셈(a, b); //덧셈 메소드 호출
		c = calc.뺄셈(a, b); //뺄셈 메소드 호출
		d = calc.나눗셈(a, b); //나눗셈 메소드 호출
		d = calc.곱셈(a, b); //곱셈 메소드 호출
		
	}
}

