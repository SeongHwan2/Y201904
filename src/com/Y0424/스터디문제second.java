package com.Y0424;

import java.util.Scanner;

public class 스터디문제second {

	public void main(String[] args) {
		System.out.print("시험 점수를 입력하세요 : ");
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		String grade = "";
		if(i >= 90) {
			grade = "A";
		}else if(i >= 80) {
			grade = "B";
		}else if(i >= 70) {
			grade = "C";
		}else if(i >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		scan.close();
		
		System.out.println("시험 결과는 : " + grade + " 입니다.");
	}

}
