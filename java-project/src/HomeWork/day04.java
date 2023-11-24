package HomeWork;

import java.util.Scanner;

/*
	과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
	과제2] (-1) + 2 + (-3) + 4 + (-5) + ... + (-9) + 10 = ?   5
	과제3] 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 9/10 = ?  7.07
	과제4] 3개 정수 입력 받아서 큰 순으로 출력하기
*/

public class day04 {
	public static void main(String[] args) {
		int sum1 = 0; 
		for( int i=1; i<=6; i++ ) {
			for(int j=1; j<i; j++) {
				sum1 += j;
			}
		}	
		System.out.print(sum);
		
	   int sum2 = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum2 -= i;
            } else {
                sum2 += i;
            }
        }
        System.out.print(sum2);
		

        
		double sum3 = 0; 
		for(int i=1; i<=9; i++ ) { // 분자 분모가 있다. 
			sum3 += (double)i/(i+1); // 형변환 해줘야 함 i는 int 니깐
		}
		System.out.printf("%.2f",sum2); // 소숫점 2번째 자리
		

	
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		  if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println(num1 + " " + num2+ " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
	}
}
