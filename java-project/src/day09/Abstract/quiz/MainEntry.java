package day09.Abstract.quiz;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출근 시간은 몇시인가요 7시부터 3시 사이 말씀주세요.");
		
		int time = sc.nextInt(); 
		String ask = sc.next();
		
		switch (time) {
		case 9: case 10: case 11:
			System.out.println("지하철를 타세요");
			
			Trans t = new Subway();
			t.start();
			
			System.out.println("내릴건가요? y/n");
			if( ask.equals("y") ) {
				t.stop();
			}
			else {
				t.start();
			}
			
			break;
		case 12: case 1: case 7:
			System.out.println("버스를 타세요");
//			t = new Bus();
//			t.start();
//			t.stop();
			break;
		case 2: case 3: case 8: 
			System.out.println("자전거를 타세요");
		
			break;
		default:
			System.out.println("비행기 타고 놀러가요.");
			break;
		}
		

		
		
//		Trans t = new Subway();
//		t.start();
//		t.stop();
	}
}
