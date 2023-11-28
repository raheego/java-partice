package devQuiz.Class;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Score sco = new Score("judy", 40, 10, 90);
		
//		Score sco = new Score();
//		System.out.println("이름을 입력하세요");
//		sco.setName( sc.next() );
//		System.out.println("국어 점수 : ");
//		sco.setKor( sc.nextInt() );
//		System.out.println("영어 점수 : ");
//		sco.setEng( sc.nextInt() );
//		System.out.println("전산 점수 : ");
//		sco.setCom( sc.nextInt() );
        
		sco.display();
	}
}
