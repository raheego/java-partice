package day05.array;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		//11월 한달간의(30일기준) 강수량을 입력받아서, 평균을 구해주라 
		System.out.println("일일 강수량을 입력하세요");
		Scanner sc = new Scanner(System.in);
	
		int su = new Scanner(System.in).nextInt(), sum = 0;
		double[] arr = new double[su];
		double avg = 0;
	
		for( int i = 0; i < arr.length; i ++ ) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		avg = (double)sum / su;
		System.out.printf("평균 강수량 %.1f",avg);
	}
}
