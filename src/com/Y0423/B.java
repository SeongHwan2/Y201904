package com.Y0423;

public class B {
	//기본생성자
	public B(String msg) {
		System.out.println("A class : " + msg); // 3)
		new A("하이!");
	}
	// 기본생성자 외의 생성자를 정의할경우 기본생성자는 새로 만들어 주지 않으면 사용할수 없다!
}
