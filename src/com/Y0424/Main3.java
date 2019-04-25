package com.Y0424;
import java.util.Scanner;

public class Main3 {

	public void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계산기 시작");
		System.out.print("첫번째 값을 입력하세요 > ");
		int a = scan.nextInt();
		
		System.out.print("연산자를 입력하세요 > ");
		String b = scan.next();
		
		System.out.print("두번째 값을 입력하세요 > ");
		int c = scan.nextInt();
		
		계산기 calc = new 계산기();
		String msg = "";
		switch(b) {
		case "+":
			msg = a + " + " + c + " = " + calc.덧셈(a, c);
			break;
		case "-":
			msg = a + " - " + c + " = " + calc.뺄셈(a, c);
			break;
		case "*":
			msg = a + " * " + c + " = " + calc.곱셈(a, c);
			break;
		case "/":
			msg = a + " / " + c + " = " + calc.나눗셈(a, c);
			break;
		default:
			msg = "계산 할수 없습니다.";
			break;
		}
		
		
		scan.close();
		System.out.println(msg);
		
		
	}
}


