package com.Y0424;

public class Main2 {

	public static void main(String[] args) {
		조건문 t = new 조건문();
		t.t1(11);
		boolean r = t.t2(10); //해당 클래스에서 바로 출력하지 않고
		System.out.println(r); //main에서 출력
		
		int i = t.t3(1, 5);
		System.out.println(i);
		
		int ii = t.t4(1, 5);
		System.out.println(ii);
		
		String msg = t.t5(1, 5);
		System.out.println(msg);
		
		String msg2 = t.t6(1, 5);
		System.out.println(msg2);
		
		String msg3 = t.t7(1, 5);
		System.out.println(msg3);
	}

}
