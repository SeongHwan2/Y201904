package com.Y0424;

import java.util.Scanner;

public class 스터디문제s {

	public void main(String[] args) {
		System.out.print("정수를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String msg = "";
		if(a > 0) {
			msg = "Plus";
		}else {
			msg = "Minus";
		}
		scan.close();
		System.out.println("결과는 : " + msg + " 입니다.");
	}
}
