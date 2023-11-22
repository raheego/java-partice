/*
package ex01.oprator;

public class QuizScore {
	public static void main(String[] args) {
		int ko=90, en=88, math=100, total = 0;
		double avg = 0; // 초기값 설정해주자 
		
		total = (ko+en+math);
		avg = (double)total/3;
		 
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
		// 소수점 printf , %f
	}
}
*/
/*
 	result :
 	judy 님의 성적표 ****
 	국어: 90, 영어 88 전산 100
 	총점 278 평균 92.67
*/

package ex01.oprator;

import java.util.Scanner;

public class QuizScore {
	public static void main(String[] args) {
		int ko, en, math, total = 0;
		double avg = 0; // 초기값 설정해주자 
		Scanner sc = new Scanner(System.in);
		
//		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);

		System.out.println("name input : ");
		String name = sc.next();
		System.out.println("ko, en, math data input : ");
		ko = sc.nextInt();
		en = sc.nextInt();
		math = sc.nextInt();
		
		total = (ko+en+math);
		avg = (double)total/3;
		 
		 System.out.println("국어 : " + ko + ", 영어 : " + en + ", 전산 : " + math);
        System.out.printf("총점 : %d 평균 : %.2f", total, avg);
	}
}