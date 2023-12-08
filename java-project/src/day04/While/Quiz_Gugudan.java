package day04.While;

import java.util.Scanner;

public class Quiz_Gugudan {
	public static void main(String[] args) {
		// while 문으로 원하는 단 입력 받아서 구구단 출력
		System.out.println("숫자을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int numInput = sc.nextInt();

		int i = 1;
		while (i <= 9) {
			System.out.println(numInput + "*" + i + "=" + (numInput * i));
			i++;
		}

		// do ~ while문으로 원하는 단 입력 받아서 구구단 출력
		// int dan = new Scanner(System.in).nextInt();
		System.out.println("숫자을 입력하세요");
		numInput = sc.nextInt();
		i = 1;
		do {
			System.out.println(numInput + "*" + i + "=" + (numInput * i));
			i++;
		} while (i <= 9);
	}
}
