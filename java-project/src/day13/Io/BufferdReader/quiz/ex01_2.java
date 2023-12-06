package day13.Io.BufferdReader.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2개 정수 입력 받고, 1개의 연산자 입력 받아서 사칙연산 프로그램 작성하기

public class ex01_2 {
	public static void main(String[] args) throws IOException {

		int x = getInputNum("첫번째 숫자를 입력하세요");
		int y = getInputNum("두 숫자를 입력하세요");
		String oper = operation();

		int result = calc(x, y, oper);
		System.out.println("결과값 : " + result);
	}

	// 숫자입력
	private static int getInputNum(String message) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(message);

		return Integer.parseInt(br.readLine());
	}

	// 연산자입력
	private static String operation() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("+ - * / 을 선택하세요");
		return br.readLine();
	}

	// 연산자 계산
	private static int calc(int x, int y, String oper) {
		switch (oper) {
		case "+":
			return x + y;
		case "-":
			return x - y;
		case "*":
			return x * y;
		case "%":
			if (y != 0) {
				return x / y;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
				return 0;
			}
		default:
			System.out.println("연산자를 입력하세요");
			return 0;
		}
	}
}
