package day05.array02;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		// 2행 3열 배열 생성
		// 스캐너 input
		// FOR문으로
		// 입력 받은 수의 합
		
		System.out.println("아무 숫자나 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		int sum = 0;
		
		for(int i=0; i< arr.length; i ++) {
			for(int j=0; j < arr[i].length; j ++) {
				arr[i][j] = sc.nextInt();
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
