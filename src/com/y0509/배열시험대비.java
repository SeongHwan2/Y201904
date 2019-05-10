package com.y0509;

import java.util.Scanner;

public class 배열시험대비 {
	
	
	
	public boolean e1_(int aY, int aX, int bY,int bX){ // 출력부분
		boolean result = true;
		int[][] map = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,2,0,0},
				{0,2,2,2,0},
				{0,0,2,0,0},
				{0,0,0,0,0},
				
		};
		
		for(int y = 0; y < map.length; y++) {
			for(int x = 0; x < map[y].length; x++) {
				
				
				
				if(y==aY && x==aX) {
					System.out.print(" ■ ");
				}else if(map[y][x] == 2) {
					System.out.print(" ♥ ");
				}else {
					System.out.print(" □ ");
				}
			}
			System.out.println();
			
		}
		return result;
	}
	
	public void e1() {
		Scanner scan = new Scanner(System.in);
		int aX = 0, aY = 0, bX = 0, bY = 0;
		e1_(aX, aY, bX, bY);
		 
		
		while(true) {
			String input = scan.next();
			switch(input.toUpperCase()) {
			case "W":
				aY--;
				break;
			case "S":
				aY++;
				break;
			case "A":
				aX--;
				break;
			case "D":
				aX++;
				break;
			default:
				break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			
			if (aY == 3 && aX == 2) {
				System.out.println("1 ~ 10까지의 수중 하나를 입력하세요");
				int input1 = scan.nextInt();
				if(input1 == 3) {
					System.out.println("명중");
					break;
				}
					System.out.println("값을 다시 입력하세요");
				}	
			
			
			
			if(e1_(aY, aX, bY, bX)) {
				bY = aY;
				bX = aX;
			}
			
		}
		scan.close();
	}
	
	public boolean e2_(int aY, int aX, int bY, int bX) {
		boolean result = false;
		int [][] map = {
				{0,0,0,0,0,0},
				{1,1,1,2,0,1},
				{1,0,0,1,0,1},
				{1,1,0,1,0,1},
				{0,3,1,1,1,1},
				{0,0,0,0,0,0},
		};
		if(aX < 0 || aX > 5 || map[aY][aX] == 0) {
			aY = bY;
			aX = bX;
			result = true;
		}else if(aY == 4 && aX == 1) {
			aY = 3;
			aX = 0;
		}else if(aY == 1 && aX == 3) {
			aY = 3;
			aX = 3;
		}
		for(int y = 0; y < map.length; y++) {
			for(int x = 0; x < map[y].length; x++) {
			
				if(map[y][x] == 0) {
					System.out.print(" ■ ");
				}else if(y==aY && x==aX) {
					System.out.print(" ㉿  ");
				}else if(map [y][x] == 1) {
					System.out.print(" □ ");
				}else if(map[y][x] == 2) {
					System.out.print(" ♥ ");
				}else {
					System.out.print(" ♣ ");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void e2() {
		Scanner scan = new Scanner(System.in);
		
		int aY = 3, aX = 0, bY = 0, bX = 0;
		e2_(aY, aX, bY, bX);
		
		while(true) {
			String input = scan.next();
			switch(input.toUpperCase()) {
			case"W":
				aY--;
				break;
			case"S":
				aY++;
				break;
			case"A":
				aX--;
				break;
			case"D":
				aX++;
				break;
			default:
				break;
			}
			System.out.println(aY + ", " + aX + ", " + bY + ", " + bX);
			
			if(e2_(aY, aX, bY, bX)) {
				aY = bY;
				aX = bX;
			}else {
				bY = aY;
				bX = aX;
			}
			
			if(aY == 4 && aX == 1) {
				aY = 3;
				aX = 0;
				bY = 3;
				bX = 0;
			}else if(aY == 1 && aX == 3) {
				aY = 3;
				aX = 3;
				bY = 3;
				bX = 3;
			}else if(aY == 1 && aX == 5) {
				break;
			}
		}
		scan.close();
	}
	
	public boolean 김은채p(int y, int x, int bY, int bX) {
		
		int map[][] = {
				{0,0,0,0,0,0,0,0},
				{0,1,2,1,1,1,0,0},
				{1,1,1,1,1,1,1,0},
				{0,1,0,3,1,0,1,1},
				{0,0,0,0,0,0,0,0},
		};
		
		boolean result = false;
		
		if(map[y][x]==0) {
			y = bY;
			x = bX;
			result = true;
		}
		
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				
				
				
				
				if(map[i][j] == 0) {
					System.out.print("■"+"\t");
				}else if(i == y && j == x) {
					System.out.print("㉿"+"\t");
				}else if(map[i][j] == 1) {
					System.out.print("□"+"\t");
				}else if(map[i][j] == 2) {
					System.out.print("▼"+"\t");
				}else if(map[i][j] == 3) {
					System.out.print("▲"+"\t");
				}
			}
			System.out.println();
		}
		return result;
	}
	
	public void 김은채s() {
		Scanner scan = new Scanner(System.in);
		
		int y = 2, x = 0, bY = 2, bX = 0;
		
		김은채p(y, x, bY, bX);
		
		while(true) {
			String input = scan.next();
			switch(input.toUpperCase()) {
			case"W":
				y--;
				break;
			case"S":
				y++;
				break;
			case"A":
				x--;
				break;
			case"D":
				x++;
				break;
			default:
				break;
			}
			System.out.println(y + ", " + x + ", " + bY + ", " + bX);
			
			
			
			if(김은채p(y, x, bY, bX)) {
				y = bY;
				x = bX;
			}else {
				bY = y;
				bX = x;
			}
			if(y == 2 && x == 2) {
				System.out.println("머리조심을 입력하세요\n");
				System.out.println();
				String input1 = scan.next();
				if("머리조심".equals(input1)) {
					System.out.println("통과");
				}//else {
	//				System.out.println("다시 입력하세요!!");
//				}
			}
			
		}
			
	}
}


