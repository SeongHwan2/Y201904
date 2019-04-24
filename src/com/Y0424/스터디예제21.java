package com.Y0424;

import java.util.Scanner;

public class 스터디예제21 {

	static int num = 1;
	static Scanner scan = null;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		학생();
		
		
		
//		스터디예제21m m = new 스터디예제21m();
		
//		System.out.print("1번학생의 시험 점수를 입력하세요 : ");
//		int score = scan.nextInt();
//		System.out.println("1번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("2번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("2번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("3번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("3번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("4번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("4번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("5번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("5번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("6번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("6번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("7번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("7번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("8번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("8번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("9번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("9번학생의 시험 결과는 " + m.grade(score) + "입니다.");
//		System.out.print("10번학생의 시험 점수를 입력하세요 : ");
//		score = scan.nextInt();
//		System.out.println("10번학생의 시험 결과는 " + m.grade(score) + "입니다.");

	}

	
	public static void 학생() {
		if(num > 10) {
			return;
		}
		스터디예제21m m = new 스터디예제21m();
		System.out.println(num + "번학생의 시험 결과는 " + m.grade(scan.nextInt()) + "입니다.");
		num++;
		학생();
		
	}
}
