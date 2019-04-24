package com.Y0424;

public class IfEx {
	public void IfEx1(int score) {
		
		if(score >= 60) {
			 System.out.println("합격을 축하합니다.");
		}
	}
	
	public void IfEx2(int score) {
		if(score >= 60) {
			System.out.println("합격을 축하 합니다.");
		}else {
			System.out.println("다음에 다시 오세요.");
		}
	}
}
