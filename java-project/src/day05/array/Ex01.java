package day05.array;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		/*
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		for( int i=0; i<arr.length; i++) {
			sum += arr[i]; // sum = sum + arr[i]
		}
		System.out.println(sum);
		*/
		
		//임의적 데이터를 입력 받아서 출력하기
		int[] arr = new int[5];
		System.out.println("5개 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for(int i=0; i<arr.length; i++) {
			int x = sc.nextInt();
			arr[i] = x;
			sum += arr[i];
			//System.out.println("arr[" + i +"] = " + arr[i]);
		}
		System.out.println("sum :" + sum);
	}
}
