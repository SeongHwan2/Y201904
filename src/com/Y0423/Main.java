package com.Y0423;

public class Main {

	public static void main(String[] args) {
		//형변환
		System.out.println("변수 연습");
		/****************************************
		 * 0. 객체(object > class)
		 * 1. 변수
		 * 2. 메소드(method)
		 * 3. 출력
		 * 4. 연산(사칙연산) :  + - *  / % ++ --  
		 * 5. 접근제한자 (public > protected > default > private)
		 * 6. 정적(static)
		 * 7. 리턴타입(void)
		 * 8. 자료형
		 * 9. 매계변수 (메소드 호출시 같이 보낼 값 (인스턴스))
		 *****************************************/
		// 한줄 삭제 할때 ctrl + d

	// 객체(class) 객체변수  대입    생성키워드     객체 생성자
	//	Var         v     =     new       Var();
		
		Var v = new Var(); // 객체 생성
		v.var(); // 메소드 호출
		
		//Var.var(); //정적 메소드..!!
		
	//	new Var(); // 기본생성자 안에 메소드를 넣어서 기본생성자가 생성되면서 메소드를 불러오게 명령하였을때 사용...!!
		
		int i = v.state1;
		
		v.var2(5, 6);
		
		
				
	}

}
