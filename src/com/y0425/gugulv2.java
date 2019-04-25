package com.y0425;

public class gugulv2 {
	public void lv2() {
		for(int i = 1; i <= 3; i++) {
			System.out.print(i + "단\t");
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(j + "*" + i + "=" + i*j +"\t");
			}
			System.out.println();
		}
//		for(int i = 1; i < 10; i+=3)
//		{
//			System.out.println("test\ttest\ttest");
//			for(int j = 1; j < 10; j++)
//			{
//				for(int k = i; k <= i+2; k++)
//				{
//					System.out.print(k + " * " + j + " = " + k*j + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
	
	}	
}

