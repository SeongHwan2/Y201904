package com.Y0424;

public class 스터디예제21m {
	
	public String grade(int score) {
		String grade = "";
		
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		return grade;
	}
}
