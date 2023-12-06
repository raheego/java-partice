package day12.quiz;

import java.util.Scanner;

public class MainEntry {
	static String title;
	static String category;
	static String lend; // 대여여부
	static String lendName;
	static String lendDate;

	public static void main(String[] args) {
		VideoManager vm = new VideoManager();
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			int ask = sc.nextInt();
			
			switch (ask) {
			case 1:
				// 추가
				vm.VideoAdd();
				vm.print();
				break;
			case 2:
				// 삭제
				
				break;
			case 3:
				// 수정
				break;
			case 4:
				// 보기
				break;
			case 5:
				// 종료
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
			}
		}

	}

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

}
