package com.y0509;

import java.util.Scanner;

public class 배열시험대비 {
	
	int aY, aX, bY, bX;
	
	public boolean e1_(int aY, int aX, int bY,int bX){ // 출력부분
		boolean result = true;
		int[][] map = {
				{0,0,0,0,0,0},
				{0,0,0,0,0,0},
				{0,0,2,0,0,0},
				{0,2,2,2,0,0},
				{0,0,2,0,0,0},
				{0,0,0,0,0,0},
				{0,0,0,0,0,0}
		};
		
		for(int y = 0; y < map.length; y++) {
			for(int x = 0; x < map[y].length-1; x++) {
				
				
				
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
			
			if(e1_(aY, aX, bY, bX)) {
				bY = aY;
				bX = aX;
			}
			
		}
//		scan.close();
	}
	
}
