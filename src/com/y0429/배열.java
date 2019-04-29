package com.y0429;

public class 배열 {
	
	public void t1() {
		boolean[][] 표 = new boolean[5][5];
		표[0][0] = false; 
		표[0][1] = false;
		표[0][2] = false;
		표[0][3] = false;
		표[0][4] = false;
		
		표[1][0] = true;
		표[1][1] = true;
		표[1][2] = true;
		표[1][3] = true;
		표[1][4] = true;
		
		표[2][0] = false;
		표[2][1] = false;
		표[2][2] = false;
		표[2][3] = false;
		표[2][4] = false;
		
		표[3][0] = true;
		표[3][1] = true;
		표[3][2] = true;
		표[3][3] = true;
		표[3][4] = true;
		
		표[4][0] = false; 
		표[4][1] = false;
		표[4][2] = false;
		표[4][3] = false;
		표[4][4] = false;
		
		for(int y = 0; y < 표.length; y++) {//행
			
			for(int x = 0; x < 표[y].length; x++) { //열
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
	}
	
	public void t2() {
		int[][] 표 = new int[5][5];
		
		for(int y = 0; y < 표.length; y++) {
			for(int x = 0; x < 표[y].length; x++) {
				if(y % 2 == 0) { //짝수 (0, 2, 4)
					표[y][x] = 0;
				}else {// 짝수 (1, 3)
					표[y][x] = 1;
				}
			}
		}
	for(int y = 0; y < 표.length; y++) {//행
				
				for(int x = 0; x < 표[y].length; x++) { //열
					System.out.print(표[y][x] + "\t");
				}
				System.out.println();
			}
	}
	
	public void t3() {
		boolean[][] 표 = new boolean[5][5];
			
		for(int y = 0; y < 표.length; y++) {
			for(int x = 0; x < 표[y].length; x++) {
				if(y == x || y+x == 4) {
					표[y][x] = true;
				}else {
					표[y][x] = false;
				}
			}
		}
		for(int y = 0; y < 표.length; y++) {//행
			
			for(int x = 0; x < 표[y].length; x++) { //열
				System.out.print(표[y][x] + "\t");
			}
			System.out.println();
		}
	}
	
}
