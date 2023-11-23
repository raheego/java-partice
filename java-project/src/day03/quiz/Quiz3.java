package day03_control.quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		System.out.println("kor = "); int kor = new Scanner(System.in).nextInt();
		System.out.println("eng = "); int eng = new Scanner(System.in).nextInt();
		System.out.println("com = "); int com = new Scanner(System.in).nextInt();

		double avg =(kor + eng + com)/ 3.0;
		
		if( avg >= 60 ) {
			if ( kor >= 40 && eng >= 40 && com >= 40 ) {
				System.out.printf("모든 과목이 40점 이상이며, 평균이 %.2f로 [합격]입니다.\n", avg);
			} else {
				System.out.printf("평균은 %.2f 이지만", avg);
				
				if ( kor < 40 ) System.out.println("국어" + kor + "점"); 
				if ( eng < 40 ) System.out.println("영어" + eng + "점"); 
				if ( com < 40 ) System.out.println("전산" + com + "점"); 
				System.out.printf("으로 [과락]입니다.\n");
			} // if end
			
		} else {
			System.out.printf("평균 %.2f로 [평균미달탈락]입니다.", avg);
		}
	}
}
