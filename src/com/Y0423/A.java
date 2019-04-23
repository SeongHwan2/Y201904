package com.Y0423;

public class A {
	//기본생성자
	public A() { // 2)
		new B("안녕!"); //B클래스 생성자 생성
	}
	
	public A(String msg) { // 4)
		System.out.println("B class : " + msg);
	}
}
