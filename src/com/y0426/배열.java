package com.y0426;

import java.util.Scanner;

public class 배열 {
	public void t1() {
		int a;    //변수 선언 
		int[] aa; //배열 선언
		
		a = 1;
		aa = new int[5]; // 배열 생성 및 크기 설정
		aa[0] = 1;       // 배열 특정 위치에 값 담기
		
		int[] bb = new int[2];
		bb[0] = 0;
		bb[1] = 1;
		
		System.out.println(a);
		System.out.println(aa);
		System.out.println(bb);
		
		System.out.println(aa[0]); // 배열 특정 위치 값 사용
		System.out.println(bb[0]); 
		System.out.println(bb[1]);
	}
	
	public void t2() {
		int[] one단 = new int[9];
		one단[0] = (1*1);
		one단[1] = (1*2);
		one단[2] = (1*3);
		one단[3] = (1*4);
		one단[4] = (1*5);
		one단[5] = (1*6);
		one단[6] = (1*7);
		one단[7] = (1*8);
		one단[8] = (1*9);
		//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		// 0  1  2  3  4  5  6  7  8   << 위치값(인덱스)
		
		System.out.println("1 * 5 = " + one단[4]);
	}
	
	public void t3() {
		int[] 단 = new int[9];
		for(int i = 1; i <= 9; i++) { // 정수 배열에 값 담기 반복문 실행
			int 값 =(1 * i);
			int index = (i - 1); // 0, 1, 2, 3, 4, 5, 6, 7, 8
			단[index] = 값;
		}
		
		for(int i = 0; i < 단.length; i++) {
			int 수 = i + 1;
			System.out.println("1 * " + 수 + " = " + 단[i]);
		}
	}
	
	public void t4() {
		String[] day = new String[7];
		day[0] = "일";
		day[1] = "월";
		day[2] = "화";
		day[3] = "수";
		day[4] = "목";
		day[5] = "금";
		day[6] = "토";
		
		//일 > 화 > 목 > 토
		//0 > 2 > 4 > 6 <<짝
//		for(int i = 0; i < day.length; i++) {// 7번 반복
//			if(i % 2 == 0) {
//				System.out.println(day[i]);
//			}
//		}
		
		for(int i = 0; i < day.length; i += 2) { //4번 반복
			System.out.println(day[i]);
		}
	}
	
	public void t5() {
		int[][] bingo = new int[7][5]; //참고로 빙고는 5*5가 최고다 ㅋㅋㅋ
		
		bingo[0][0] = 5;
		bingo[0][1] = 3;
		bingo[1][2] = 1;
		
		for(int i = 0; i < bingo.length; i++) {
			for(int j = 0; j < bingo[i].length; j++) {
				System.out.print(bingo[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void t6() {
		String[][] 요일 = new String[7][5];
		// 현재 달의 달력 데이터를 요일 배열에 데이터를 담아 보세요.
		// 출력 오늘 요일을 표현할것.
		Scanner scan = new Scanner(System.in);
		
		String k = "";
		for(int i = 0; i < 요일.length; i++) {
			for(int j = 0; j < 요일[i].length; j++) {
				if(i == 0) {
					k = "월 ";
				}else if(i == 1) {
					k = "화 ";
				}else if(i == 2) {
					k = "수 ";
				}else if(i == 3) {
					k = "목 ";
				}else if(i == 4) {
					k = "금 ";
				}else if(i == 5) {
					k = "토 ";
				}else {
					k = "일 ";
				}
				
				if(i > 1 && j == 4) {
					break;
				}
				
				요일[i][j] = k;
				System.out.print(요일[i][j]);
				
			}
			System.out.println();
		}
	}
}
