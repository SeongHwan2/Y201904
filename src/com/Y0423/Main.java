package com.Y0423;

public class Main {

	public static void main(String[] args) {
		//형변환
		System.out.println("변수 연습");
		/****************************************
		 * 1. 변수
		 * 2. 메소드(method)
		 * 3. 출력
		 * 4. 연산(사칙연산)
		 * 5. 접근제한자
		 * 6. 정적(static)
		 * 7. 리턴타입(void)
		 * 8. 자료형
		 * 9. 매계변수 (메소드 호출시 같이 보낼 값 (인스턴스))
		 *****************************************/
		
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
		
	}

}
