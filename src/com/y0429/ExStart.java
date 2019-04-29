package com.y0429;

import java.util.Scanner;

public class ExStart {
	
	public boolean start1(int aX, int aY, int bX, int bY) {
		
		boolean result = false;
		
		int[][] map = {
				{0,0,0,0,0,0,0,0,0,0,0,0},
				{0,1,1,0,1,1,1,0,1,1,1,0},
				{0,1,0,0,0,1,1,0,1,0,1,0},
				{0,1,1,1,1,0,1,0,1,0,1,0},
				{0,1,1,1,0,1,1,0,1,1,1,0},
				{0,1,0,0,1,1,1,0,1,0,1,0},
				{0,1,1,1,0,1,1,0,1,0,1,0},
				{0,1,1,1,0,1,1,0,1,0,1,0},
				{0,1,1,0,1,1,1,0,1,0,1,0},
				{0,1,0,1,1,0,1,0,1,0,1,0},
				{0,1,1,1,1,1,1,1,1,0,1,0},
				{0,0,0,0,0,0,0,0,0,0,1,0}
		};
		
		for(int y = 0; y < map.length; y++) {
			for(int x = 0; x < map[y].length; x++) {
				
				if(map[aY][aX] == 0) {
					aY = bY; 
					aX = bX;
					result = true;
				}
				
				
				if(y==aY && x==aX) {
					System.out.print(" ㉿ ");
				}else if(map[y][x] == 1) {
					System.out.print(" □ ");
				}else if(map[y][x] == 0) {
					System.out.print(" ■ ");	
				}else if(y == 8 && x == 1) {
					System.out.print(" ★ ");
				}
				
				if(aX == 1 && aY == 8) {
					aX = 1;
					aY = 10;
				}else if(aX == 4 && aY == 10) {
					aX = 9;
					aY = 4;
				}
			}
			System.out.println();
		}
		return result;
		
	}
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		int aX = 1; int aY = 1; int bX = 1; int bY = 1;
		start1(aX, aY, bX, bY); // 시작을 위하여 필요한 호출 부분
		while(true) {//파라미터 true 일때 무한반복
			String input = scan.next();
			switch(input.toUpperCase()) {//toUpperCase() = 입력값을 대문자로 변환!!
				case"W"://위
					aY--;
					break;
				case"S"://아래
					aY++;
					break;
				case"A"://왼
					aX--;
					break;
				case"D"://오
					aX++;
					break;
				default:
					break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			
			if(start1(aX, aY, bX, bY)) {// 이동을 위하여 호출 부분 //false
				aX = bX;
				aY = bY;
			}else { //true
				bX = aX;
				bY = aY;
			}
			if(aX == 1 && aY == 8) {
				aX = 1;
				aY = 10;		
			}else if(aX == 4 && aY == 10) {
				aX = 9;
				aY = 4;
			}else if(aX == 10 && aY == 11) {
				break;
			}
		}
		
	}
}
