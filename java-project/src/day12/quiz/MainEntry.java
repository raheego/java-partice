package day12.quiz;

import java.util.Scanner;


public class MainEntry {
	static String title;
	static String category;
	static String lend; //대여여부
	static String lendName;
	static String lendDate;
	
	public static void menu() {
		System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
		System.out.println("1. 입력");
		System.out.println("2. 삭제");
		System.out.println("3. 수정");
		System.out.println("4. 보기");
		System.out.println("5. 종료");
		System.out.println("----------------------");
		System.out.print(" >> ");
	}
	
	public static void main(String[] args) {
		VideoManager vm = new VideoManager();
		
		Scanner sc = new Scanner(System.in);
		int calc = 0;
		while(calc < 3) {
			vm.VideoAdd();
			vm.print();
			
			calc++;
			
		}
			
			
	}
}
