package com.Y0423;

public class C {
	
	
	int count = 0;
	
	public C() {
		System.out.println(count);
		count++;
		new C();// 생성자 생성수는 제한이 있음..(무한루프 빠져버림).
	}
}
