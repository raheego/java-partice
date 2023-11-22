/*
package day03_control.quiz;

import java.util.Scanner;

public class ex01_switchTest {
	public static void main(String[] args) {
		System.out.println("input score(k,e,c) = ");
		Scanner sc = new Scanner(System.in); //변수를 scanner
		int total = (sc.nextInt() + sc.nextInt() + sc.nextInt());
		double avg = (double)total/3; 
		char grade; 
		
		switch (total/30) { // (int)avg/10 평균으로 넣어 계산할 수 있음 
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				grade = 'F';
				break;
			}
		System.out.println("총점" + total +", 학점" + grade +"입니다.");
	}
}
*/

package day03_control.quiz;

import java.util.Scanner;

public class SwitchGrade {
	public static void main(String[] args) {
		System.out.println("input score(k,e,c) = ");
		Scanner sc = new Scanner(System.in); //변수를 scanner
		
		int total = (sc.nextInt() + sc.nextInt() + sc.nextInt());
		double avg = (double)total/3; 
		char grade; 

	}
}
