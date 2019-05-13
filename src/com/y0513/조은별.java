package com.y0513;


import java.util.Random;
import java.util.Scanner;

public class 조은별 {

	public static void main() {
		조은별 은별 = new 조은별();
		은별.control();
	}

	String input = "";
	int[][] map = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
			{ 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

	public 조은별() {
		System.out.println("은☆ Tetris\n");
	}

	public int[][] init() {
		int[][] result = { { 1, 1 }, { 1, 2 }, { 2, 1 }, { 2, 2 } }; // ㅁ
		return result;
	}

	public int[][] init1() {
		int[][] result = { { 1, 1 }, { 2, 1 }, { 2, 2 }, { 2, 3 } }; // ㄴ
		return result;
	}

	public int[][] init2() {
		int[][] result = { { 1, 1 }, { 1, 2 }, { 1, 3 }, { 2, 1 } }; // ㄱ
		return result;
	}

	public void control() {
		Random random = new Random();
		int typeNumb = (random.nextInt(3));
		int[][] tetList = null;
		switch (typeNumb) {
		case 0:
			tetList = init();
			break;
		case 1:
			tetList = init1();
			break;
		case 2:
			tetList = init2();
			break;
		}

		print(tetList);
		System.out.println("ㄴ - ㅁ - ㄱ 순으로 플레이");
		Scanner scan = new Scanner(System.in);
		while (true) {
			input = scan.next();
			switch (input.toUpperCase()) {
			case "W":
				System.out.println("아직 미구현");
				break;
			case "S":
				tetList[0][0]++;
				tetList[1][0]++;
				tetList[2][0]++;
				tetList[3][0]++;
				break;
			case "A":
				tetList[0][1]--;
				tetList[1][1]--;
				tetList[2][1]--;
				tetList[3][1]--;
				break;
			case "D":
				tetList[0][1]++;
				tetList[1][1]++;
				tetList[2][1]++;
				tetList[3][1]++;
				break;
			default:
				System.out.println("잘못된 값이 들어왔습니다.");
				break;
			}

			tetList = checkValue(tetList, typeNumb, random.nextInt(3));
			tetList = checkLine(tetList);

			print(tetList);
		}
	}

	public int[][] checkLine(int[][] tetList) {
		boolean flag;
		boolean flag2;
		int index = 4;
		for (int i = 10; i > 1; i--) {
			flag = true;
			for (int j = 1; j <= 10; j++) {
				if (map[i][j] != 1) {
					flag = false;
				}
			}

			if (flag) {
				for (int j = 1; j <= 10; j++) {
					map[i][j] = 0;
				}
				flag2 = true;
				index = i;
			}
		}

		for (int i = index; i > 1; i--) {
			for (int j = 1; j <= 10; j++) {
				map[i][j] = map[i - 1][j];
			}
		}
		return tetList;
	}

	public int[][] checkValue(int[][] tetList, int typeNumb, int random) {
		if (typeNumb == 0) {
			if (map[tetList[0][0]][tetList[0][1]] == 1 && map[tetList[2][0]][tetList[2][1]] == 1) {
				tetList[0][1]++;
				tetList[1][1]++;
				tetList[2][1]++;
				tetList[3][1]++;
			} else if (map[tetList[1][0]][tetList[1][1]] == 1 && map[tetList[3][0]][tetList[3][1]] == 1) {
				tetList[0][1]--;
				tetList[1][1]--;
				tetList[2][1]--;
				tetList[3][1]--;
			} else if (map[tetList[2][0] + 1][tetList[2][1]] == 1
					|| map[tetList[3][0] + 1][tetList[3][1]] == 1 && tetList[3][1] != 11) {
				map[tetList[0][0]][tetList[0][1]] = 1;
				map[tetList[1][0]][tetList[1][1]] = 1;
				map[tetList[2][0]][tetList[2][1]] = 1;
				map[tetList[3][0]][tetList[3][1]] = 1;

				switch (random) {
				case 0:
					tetList = init();
					break;
				case 1:
					tetList = init1();
					break;
				case 2:
					tetList = init2();
					break;
				}
				print(tetList);
			}
		} else if (typeNumb == 1) {
			if (map[tetList[0][0]][tetList[0][1]] == 1 && map[tetList[1][0]][tetList[1][1]] == 1) { // 왼쪽
				tetList[0][1]++;
				tetList[1][1]++;
				tetList[2][1]++;
				tetList[3][1]++;
			} else if (map[tetList[3][0]][tetList[3][1]] == 1) {// 오른쪽
				tetList[0][1]--;
				tetList[1][1]--;
				tetList[2][1]--;
				tetList[3][1]--;
			} else if (map[tetList[1][0] + 1][tetList[1][1]] == 1 || map[tetList[2][0] + 1][tetList[2][1]] == 1
					|| map[tetList[3][0] + 1][tetList[3][1]] == 1 && tetList[3][1] != 11) {// 아래
				map[tetList[0][0]][tetList[0][1]] = 1;
				map[tetList[1][0]][tetList[1][1]] = 1;
				map[tetList[2][0]][tetList[2][1]] = 1;
				map[tetList[3][0]][tetList[3][1]] = 1;

				switch (random) {
				case 0:
					tetList = init();
					break;
				case 1:
					tetList = init1();
					break;
				case 2:
					tetList = init2();
					break;
				}
				print(tetList);
			}
		} else if (typeNumb == 2) { // 여기가 문제임
			if (map[tetList[0][0]][tetList[0][1]] == 1) {
				tetList[0][1]++;
				tetList[1][1]++;
				tetList[2][1]++;
				tetList[3][1]++;
			} else if (map[tetList[2][0]][tetList[2][1]] == 1) {
				tetList[0][1]--;
				tetList[1][1]--;
				tetList[2][1]--;
				tetList[3][1]--;
			} else if (map[tetList[0][0] + 1][tetList[0][1]] == 1 || map[tetList[1][0] + 1][tetList[1][1]] == 1
					|| map[tetList[2][0] + 1][tetList[2][1]] == 1 || map[tetList[3][0] + 1][tetList[3][1]] == 1) {
				map[tetList[0][0]][tetList[0][1]] = 1;
				map[tetList[1][0]][tetList[1][1]] = 1;
				map[tetList[2][0]][tetList[2][1]] = 1;
				map[tetList[3][0]][tetList[3][1]] = 1;
				switch (random) {
				case 0:
					tetList = init();
					break;
				case 1:
					tetList = init1();
					break;
				case 2:
					tetList = init2();
					break;
				}
				print(tetList);
			}
		}

		return tetList;
	}

	public void print(int[][] tetList) {

		System.out.println("======================================");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					if (i == tetList[k][0] && j == tetList[k][1]) {
						System.out.print(" ● ");
						flag = false;
					}
				}

				if (flag) {
					if (map[i][j] == 1) {
						System.out.print(" ■ ");
						flag = true;
					} else if (map[i][j] == 0) {
						System.out.print(" □ ");
						flag = true;
					}
				}

			}
			System.out.println("");
		}
	}
}
