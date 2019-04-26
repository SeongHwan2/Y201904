package com.y0425;

import java.util.Scanner;

public class Test {
	
	public Test() {
		평가(); //평가 첫번째 실행 
	}
	
	int num = 1;
	int input = 0;
	String score = "";
	
	public void 평가() {
		if(num > 10) {return;}
		
		Scanner scan = new Scanner(System.in);
		System.out.print(num + "번학생의 시험 점수를 입력하세요 : ");
		input = scan.nextInt();
		if(input == 100 || input >= 90) {
			score = "A";
		}else if(input == 89 || input >= 80) {
			score = "B";
		}else if(input == 79 || input >= 79) {
			score = "C";
		}else if(input == 69 || input >= 69) {
			score = "D";
		}else {
			score = "F";
		}
		
		System.out.println(num + "번학생의 시험 결과는" + score + "입니다.");
		num++;
		scan.close();
		평가(); //재귀
	}
}
