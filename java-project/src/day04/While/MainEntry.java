package day04.While;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("for -- ");
		for (int i = 1; i < 4; i++) {
			System.out.print(i + "\t");
		}

		System.out.println("while~~");
		int a = 1; // 변수 초기화
		while (a <= 3) { // while( a++<=3 ){ System.out.println(a+"\t"); }
			System.out.println(a + "\t");
			a++; // 증감식
		}
		System.out.println(a); // 4

		System.out.println("Do ~ while~~");
		a = 1; // 변수초기화
		do {
			System.out.println(a + "\t");
			a++;
		} while (a <= 3);
	}
}
