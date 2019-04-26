package com.y0426;

import java.util.Scanner;

public class 반복문 {
	
	public void lv1() {
		/****************************
		 * 1난이도 (한행에 하나씩)
		 * 1단 > 2단 (순차적으로 출력
		 ****************************/
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
	}
	
	public void lv2() {
		/****************************
		 * 2난이도 (한행에 3개씩)
		 * 1단2단3단 > 4단5단6단 > 7단8단9단 (순차적으로 출력
		 ****************************/
		for(int i = 1; i <= 9; i+=3) {
			System.out.print(i + "단\t");
			System.out.print((i+1) + "단\t");
			System.out.print((i+2) + "단\t");
			System.out.println();
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + "*" + j + "=" + i*j +"\t");
				System.out.print((i+1) + "*" + j + "=" + (i+1)*j+"\t");
				System.out.print((i+2) + "*" + j + "=" + (i+2)*j+"\t");
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public void lv3() {
		/****************************
		 * 3난이도 (한행에 3개씩)
		 * 1단4단7단 > 2단5단8단 > 3단6단9단 (순차적으로 출력
		 ****************************/
		for(int i = 1; i <= 3; i++) {//단수
			System.out.print(i + "단\t");
			System.out.print((i+1) + "단\t");
			System.out.print((i+2) + "단\t");
			System.out.println();
			for(int j = 1; j <= 9; j++) {//1 ~ 9
				System.out.print(i + "*" + j + "=" + i*j +"\t");
				System.out.print((i+3) + "*" + j + "=" + (i+3)*j+"\t");
				System.out.print((i+6) + "*" + j + "=" + (i+6)*j+"\t");
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public void lv4() {
		Scanner scan = new Scanner(System.in);
		//x축으로 출력 나올 갯수를 입력 받는다.
		System.out.println("X축으로 출력 나올 갯수를 입력 하세요");
		int x축 = scan.nextInt();
		for(int y = 1; y <= 9; y = y + x축) {//단수
			for(int x = 1; x <= 9; x++) {// 1~ 9
				for(int c = 0; c < x축; c++) {//출력할 갯수 지정
					if((y+c) > 9) {
						break;
					}
					System.out.print((y+c) + "*" + x + "=" + (y+c)*x +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();
	}
	
	public void lv5() {
		Scanner scan = new Scanner(System.in);
		//x축으로 출력 나올 갯수 입력
		System.out.println("X축으로 출력 나올 갯수를 입력 하세요.");
		int x축 = scan.nextInt();
		System.out.println("Y축으로 출력 나올 갯수를 입력 하세요.");
		int y축 = scan.nextInt();
		/*************************************************
		 * x축과 y축의 갑을 입력 받아 출력하기 단, 출력은 9단까지 표현할것.
		 *************************************************/
		for(int y = 1; y <= (y축*x축); y = y + x축) {
			for(int x = 1; x <= 9; x++) {
				
				for(int c = 0; c < x축; c++) {
					if((y+c) > 9) {
						break;
					}
					System.out.print((y+c) + "*" + x + "=" + (y+c)*x +"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		scan.close();		
	}
	
	public void lv6() {
		for(int y = 0; y <= 10; y++) {
			for(int x = 0; x <= 10; x++) {
				if(y % 5 == 0 || x % 5 == 0 || x == y || x + y == 10) {
					System.out.print(" ■ ");
				}else {
					System.out.print(" □ ");
				}
			}
			System.out.println();
		}
	}
}	
	
