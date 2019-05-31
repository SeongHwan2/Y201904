package 동물의왕국;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ani a = new behavior();
		
		while(true) {
			System.out.println("동물을 입력하세요 (고양이,강아지,호랑이)");
			String input = scan.nextLine();
			switch(input) {
			case "고양이":
				a.cat();
				break;
			case "강아지":
				a.dog();
				break;
			case "호랑이":
				a.tiger();
				break;
			case "끝":
				System.out.println("끝");
				break;
			default:
				System.out.println("고양이, 강아지, 호랑이 중 하나만 입력하세요");
				break;
			}
			if(input.equals("끝")) {
				break;
			}
		}
	}
}
