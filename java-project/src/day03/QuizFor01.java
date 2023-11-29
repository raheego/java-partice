/*
package day03_control.quiz;

import java.util.Scanner;

public class QuizFor01 {
	public static void main(String[] args) {
		//1. 원하는 숫자 넣어서 구구단 출력하기 
		System.out.println("입력하세요");
		int num = new Scanner(System.in).nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num + "*"+ i + "=" + (num*i));
		}
		
		//2. 1~100중에 3의 배수의 합과 갯수를 구해라
		int sum = 0;
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i % 3 == 0) {
				sum += i; // sum = sum + i
				count++; // count = count +1; count += 1; 
			}
		}
		System.out.println("\nsum " + sum + ", count "+ count);
	}
}
*/

package day03;

public class QuizFor01 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++ ) {
			sum += i;
		}
		System.out.println("1~100까지의 합 :" + sum);
	}
}