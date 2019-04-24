package com.Y0424;

import java.util.Scanner;


public class Main4 {
	public void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		IfEx ifex = new IfEx();
		
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		ifex.IfEx1(score);
		score = scan.nextInt();
		ifex.IfEx2(score);
		scan.close();
		
	}
}
