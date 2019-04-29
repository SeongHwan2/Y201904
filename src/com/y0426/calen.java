package com.y0426;

import java.util.Scanner;

public class calen {

	public static void main(String[] args) {
		String[][] 요일 = new String[7][5];
		
		Scanner scan = new Scanner(System.in);
		
		String[] day = new String[7];
		day[0] = "월"; day[1] = "화"; day[2] = "수"; day[3] = "목"; day[4] = "금";
		day[5] = "토"; day[6] = "일";
		int a = scan.nextInt();
		for(int y = 0; y < 요일.length; y++) {
			
			for(int x = 0; x < 요일[y].length; x++) {
				int z = (x*7)+y;
				if(z >= 30) {break;}
				요일[y][x] = day[y];
				
				System.out.print(요일[y][x]);
					
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Today : " + day[a%7]);
	}

}
