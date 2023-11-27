package day06.Method;

public class MainEntry {
	// 1. 매개변수가 x, 리턴 타입x 경우
	// public returnType methodName() { }
	
	public static void line() { // 함수정의부
		System.out.println("===========================================");
	}
	
	
	// 2. 매개변수o, 리턴타입 x
	// `public returnType methodName(parameter va1, parameter va2,…) { }`
	public static void showName(String name, int age) {
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 나이 " + age + "입니다.");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		showName("judy", 30);
		line(); // 함수호출
		display();
		display();
		line();
		System.out.println("Main End");
	}
	
	public static void display() { //함수정의부
		System.out.println("happy~");
	}
}
