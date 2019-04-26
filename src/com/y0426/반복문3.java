package com.y0426;

import java.util.Scanner;

public class 반복문3 {
	
	public void t1() {
		while(true) {
			//파라미터가 true =  무한 루프가 된다.
			System.out.println("무한 루프");
		}
	}
	
	public void t2() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("입력하세요 >> ");
			String input = scan.next();
			if("exit".equals(input)) {//비교할때 공백으로 비교할수는 없다 .equals(); = 문자 비교 
				break;
			}
			System.out.println("무한 루프");
		}
		System.out.println("While문 종료");
		scan.close();
	}
	
	public void t3() {
		int count = 0;
		while(count < 100) {
			System.out.println(count);
			count++;
		}
		System.out.println("count :" + count);
	}
}
