package day09.Interface.ex01;

import day09.Abstract.ex02.Shape;

/*
 * - 클래스가 아님 - 객체 생성 안됨
	- inplements
	- 추상메소드, 상수만 가질 수 있다. (abstract,final 생략 가능)
	- 다중 상속 구현
 * */

interface A {
	int x = 9; // abstract method, final method 만 가질 수 있다. statice final 생략

	public void show(); // abstract 생략된 것

	public abstract void disp();

	public int plus(int x, int y);

}

interface B {
	void bView();
}

interface C {
	String name = "happy"; // final 값 변경 안됨 초기값 설정을 꼭 해줘야 함.

	public void draw();

	// name = "judy"; // 값 변경 안됨
	// 10 =5;
}

interface D extends B { // 인터페이스 간의 상속
	void dview();
}

class Rect implements C {

	@Override
	public void draw() {
		System.out.println(name + "님 반값습니다.");
	}

}

//다중상속
class Multi extends Shape implements B, C, A {

	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void disp() {
		System.out.println("disp");
	}

	@Override
	public int plus(int x, int y) {
		System.out.println("plus");
		return 0;
	}

	@Override
	public void draw() { // C interface
		System.out.println("draw");
	}

	@Override
	public void bView() { // B interface
		System.out.println("bView");
	}

	@Override
	public double calc(double x) {
		System.out.println("calc");
		return 0;
	}

	@Override
	public void show(String name) {
		System.out.println("show");
	}

} // multi end

public class MainEntry {
	public static void main(String[] args) {
		Multi m = new Multi();
		m.bView();
		m.disp();
		
		Shape m2 = new Multi();	//부모 클래스를 이용해서 객체 생성
		m2.calc(3);
		m2.view();
		
		B m3 = new Multi(); // 부모 인터페이스를 이용해서 자손클래스 객체 생성 가능
		m3.bView();
		
		A m4 = new Multi();
		m4.plus(1, 2);
		m4.show();
		
		
		System.out.println("-- -- -- - -- -- -- - - --");
		// A a = new A(); 객체 생성 할 수 없다. 클래스가 아니기에
//		MainEntry me = new MainEntry();
//		System.out.println(me.name);
//		System.out.println(me.x);
//		int x = 9; 
//		x = 88;
		Rect r = new Rect(); // 자기자신으로 객체 생성
		r.draw();
		C rr = new Rect(); // 부모 C 인터페이스로 객체 생성
		rr.draw();
		System.out.println(rr.name);

	}
}
