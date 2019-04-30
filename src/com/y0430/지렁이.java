package com.y0430;

import java.util.Scanner;

public class 지렁이 {
	
	int[][] map = {
			{0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,1,1,1,1,1,1,1,1,0},
			{0,0,0,0,0,0,0,0,1,0},
	};
	
	int[] play = {1,1}; //Y, X
	int[][] 꼬리 = new int[6][2];
	int count = 0;
	int[] history = {1,1}; //Y,X
	int[][] eat = {
			{2,2},{2,7},{4,5},{6,2},{6,8},{8,4}
	};
	
	public void start() {
		Scanner scan = new Scanner(System.in);
		view();
		while(true) {
			switch(scan.next().toUpperCase()) {//사용자에게 명령어 받음
			case "W"://위쪽 (-1)
				play[0] = play[0] - 1;
				break;
			case "S"://아래쪽 (+1)
				play[0] = play[0] + 1;
				break;
			case "A"://왼쪽 (-1)
				play[1] = play[1] - 1;
				break;
			case "D"://오른쪽 (+1)
				play[1] = play[1] + 1;
				break;
			default:
				break;
			}
			
			//벽 예외 처리
			if(play[0] == 0) {
				play[0] = 1;
			} else if(play[1] == 0) {
				play[1] = 1;
			} else if(play[1] == 9) {
				play[1] = 8;
			} else if(play[0] == 9 && play[1] == 8) {//if문은 차례대로 동작하기 때문에 이부분에 추가
				view();
				System.out.println("끝!");
				break; //게임종료
			} else if(play[0] == 9) {
				play[0] = 8;
			}
			
			
			
			//eat 예외처리 : 6개이기 때문에 반복문 필요.
			for(int 대상 = 0;대상 < eat.length; 대상++) {
				if(play[0] == eat[대상][0] && play[1] == eat[대상][1]) {
					꼬리[count][0] = 대상 +1;//1,2,3,4,5,6
					꼬리[count][1] = 1;
					count++;
					
					
				}
			}
			if(count > 0) {
				// 먹을꺼의 히스토리 적용
				for(int 대상 = (count - 1); 대상 >= 0; 대상--) {
					int 오리지날대상 = 꼬리[대상][0] - 1;
					if(대상 == 0) {
						if(꼬리[대상][1] == 0) {
							꼬리[대상][1] = 1;
						}else {
							eat[오리지날대상][0] = history[0];
							eat[오리지날대상][1] = history[1];
						}
					} else {
						int 오리지날전대상 = 꼬리[대상-1][0] - 1;
						if(꼬리[대상][1] == 0) {
							꼬리[대상][1] = 1;
						}else {
							eat[오리지날대상][0] = eat[오리지날전대상][0];
							eat[오리지날대상][1] = eat[오리지날전대상][1];
						}
					}
				}
			}
			view();
			
			history[0] = play[0];
			history[1] = play[1];
		}
		
	}
	
	public void view() {
		for(int row = 0; row < map.length; row++) {
			for(int col = 0; col < map[row].length; col++) {
				//System.out.print(map[row][col]);
				boolean check = true;
				if(play[0] == row && play[1] == col) {
					System.out.print(" ㉿ ");
					continue;
				}
				
				for(int 대상 = 0; 대상 < eat.length; 대상++) {
					for(int i = 0; i <= count; i++) {
					
						if(eat[대상][0] == row && eat[대상][1] == col) {
							System.out.print(" ♥ ");
							check = false;
							break;
					}
				/************************************
				 *  0   1   2   3   4   5   6
				 * 1 0 1 1 1 1 1 1 1 1 1 1 1 1
				 * 2 0 2 0 2 2 2 2 2 2 2 2 2 2
				 * 3 0 3 0 3 0 3 3 3 3 3 3 3 3
				 * 4 0 4 0 4 0 4 0 4 4 4 4 4 4
				 * 5 0 5 0 5 0 5 0 5 0 5 5 5 5
				 * 6 0 6 0 6 0 6 0 6 0 6 0 6 6
				 ************************************/		
				
			}
		}
					
				if(check) {
				if(map[row][col] == 1) {
					System.out.print(" □ ");
				}else if(map[row][col] == 0) {
					System.out.print(" ■ ");
				}
				}
			}
			System.out.println();
		}
	}
	
	public void move() {
		
	}
	
	public void sum() {
		
	}
}
