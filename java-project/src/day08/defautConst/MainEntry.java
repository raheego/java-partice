package day08.defautConst;

// default Constructor & API

public class MainEntry {
	/*
	 * @param args 메인은 아무 값도 넘겨 받지 않는다.
	 * @authoer rahee
	 * @param x곱을 구하는 것에 첫번째 정수형 변수
	 * @param y곱을 구하는 것에 두번째 정수형 변수
	 * @param gob 변수는 x와 y의 두 정수의 곱을 저장 변수
	 * 
	 * */
	public static void main(String[] args) {
		int x, y, gob = 1; 
		char ch = 'A';
		String msg;
		
		x = 5; y = 5; 
		msg = "Hello Java";
		
		gob = gob(x,y);
		
		System.out.println(ch);
		System.out.println(msg);
		System.out.println(x + " , " + y + " = " + gob);
	}

	public static int gob(int x, int y) {
		return x * y;
	}
	
}
