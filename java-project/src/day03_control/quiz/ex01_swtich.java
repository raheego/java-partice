  package day03_control.quiz;

import java.util.Scanner;

public class ex01_swtich {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는 (1~3점) input : ");
		int point = new Scanner(System.in).nextInt();
		
		switch (point) {
			case 1: // 숫자, '문자', "문자열"
				System.out.println("포인트 점수 1점입니다.");
				break;
			case 2:
				System.out.println("포인트 점수 2점입니다.");
				break;
			case 3:
				System.out.println("포인트 점수 3점입니다.");
				break;
	
			default:
				System.out.println("없는 점수입니다. 확인해주세요");
				break;
		} // switch end
	}
}
