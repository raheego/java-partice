package day03;

import java.util.Scanner;

public class SwitchQuiz {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요.");
		int num = new Scanner(System.in).nextInt();

		switch (num % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("숫자를 넣어주세요");
			break;
		} // switch enda
	}
}
