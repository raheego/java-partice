package devQuiz;

import java.util.Scanner;

public class step4_Socre_Arr {
	public static void main(String[] args) {
		int person = 3; 
		Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자함수자동호출

		int[] kor = new int[person];
		int[] eng = new int[person];
		int[] com = new int[person];
		int[] total = new int[person];
		double[] avg = new double[person];
		String[] name = new String[person];
//		String[][] name = new String[person][20];
		char[] grade = new char[person];
		
		// input area
		for(int i=0; i < person; i ++) {
			System.out.print((i+1)+"번째 이름 입니다.");
			name[i] = sc.next();
			
			System.out.println("국어 점수를 입력하세요");
			kor[i] = sc.nextInt();

			System.out.println("영어 점수를 입력하세요");
			eng[i] = sc.nextInt();
			
			System.out.println("전산 점수를 입력하세요");
			com[i] = sc.nextInt();
			
			total[i] = kor[i] + eng[i] + com[i];
			avg[i] = total[i] / 3;
			
			// grade area
		    switch (grade[i]) {
		        case 90:
		        	grade[i] = 'A';
		            break;
		        case 80:
		        	grade[i] = 'B';
		            break;
		        case 70:
		        	grade[i] = 'C';
		        default:
		        	grade[i] = 'F';
	    	}
		    
			System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", total[i], avg[i], grade[i] );
			System.out.println();
		}
	
	
	}
}
