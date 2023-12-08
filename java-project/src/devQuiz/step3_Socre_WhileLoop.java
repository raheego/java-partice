package devQuiz;

import java.util.Scanner;

public class step3_Socre_WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출

		//String name = null;
		String flag = "";
		
		int kor, eng, com = 0;

		while (true) { //무한루프
			System.out.print("이름을 입력하세요");
			String name = sc.next();
			
			do {
				System.out.println("국어 점수를 입력하세요(0~100) = ");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 100);
			do {
				System.out.println("영어 점수를 입력하세요(0~100) = ");
				eng = sc.nextInt();
			} while (eng < 0 || eng > 100);
			do {
				System.out.println("전산 점수를 입력하세요(0~100) = ");
				com = sc.nextInt();
			} while (com < 0 || com > 100);

			int total = kor + eng + com;
			double avg = total / 3.0;
			char result = ' ';

			if (avg <= 100 && avg >= 90) {
				result = 'A';
			} else if (avg >= 80) {
				result = 'B';
			} else if (avg >= 70) {
				result = 'C';
			} else if (avg >= 60) {
				result = 'D';
			} else {
				result = 'F';

			}
			System.out.println(name + "님의 성적표 *****");
			System.out.println("국어 : " + kor + "  영어 : " + eng + "  전산 : " + com);
			System.out.printf("총점 : %d  평균 : %.2f  학점 : %c", total, avg, result);
			System.out.println();
			
			System.out.println("다른 사람 어쩌꾸 y/n");
			char yesno = new Scanner(System.in).next().charAt(0);
			if( yesno == 'n' || yesno == 'N' ) break; //탈출구문 
			
			//flag = sc.next().charAt(0); // String
			
//			if( flag.equrs("n") || flag.equals("N") ) break; 
//			if(flag.equalsIgnoreCase("n")) break;
//			if ( flag.toUpperCase().equals("N") ) break;
//			if ( flag.toLowerCase().equals("N") ) break;
			
		}// 무한루프 end
		
	}
}
