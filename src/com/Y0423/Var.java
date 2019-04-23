package com.Y0423;

public class Var {

	public Var() {
		var();
	} //기본 생성자

//리턴유형  함수명(매계변수) 로직 구현
// void   var()       {}	
	
	public int state1;
	protected int state2;
	int state3;
	private int state4;
	
	public void var() {
		
		/*******************************************
		 *변수 사용법
		 *1. 변수 선언
		 *2. 변수에 데이터 대입(값담기)
		 *3. 변수 사용 
		 *******************************************/
		int a;  //1
		a = 1;   //2
		System.out.println(a);  //3
		
		int b = 2;  // 1,2 동시 적용
		System.out.println(b); //3
		
		int c, d, e; // 한번에 여러개 선언 가능 1
		c = a;  //2  변수의 값으로 변수를 담을때  = c가 a의 주소값을 공유함
		d = b;  //2 
		e = c + d;  //2
		System.out.println(e); //3
		
		int f;
		f = a;
		System.out.println(f);
		
		a = 10; // 일반 자료형의 변수는 주소값 대신 담았을때의 값만 받기 때문에 a의 값을 변경해도 f의 값은 변경되지 않음. 
		System.out.println(a);
		System.out.println(f);
		// 증감연산자 = 값을 1씩 증가!!
		a--; // 후항 연산자 
		--a; // 전항 연산자 
		++a;
		a++;
		
	}

	void var2(int a, int b) {
		System.out.println(a + b);
	}
}
