package devQuiz;

import java.util.Scanner;

public class step2_Socre_While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체 생성, 메모리에 할당, 생성자 함수 자동 호출

		System.out.print("이름을 입력하세요");
		String name = sc.next();
		int kor, eng, com = 0;

//        do{
//            System.out.println("점수를 0~100점 중에 입력하세요.");
//            kor = sc.nextInt();
//            eng = sc.nextInt();
//            com = sc.nextInt();
//        } while ((kor <0 || kor >100) ||  (eng <0 || eng >100) || (com <0 || com >100));
		
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
	}
}
