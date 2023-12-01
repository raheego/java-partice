package day09.Interface.ex01;

public class BB implements IDraw {

	@Override
	public void draw() {
		System.out.println(" BB 클래스에서 인터페이스 Idraw의 메소드를 오버라이드 함.");
		System.out.println(su);
	}
	public void show() {
		System.out.println(su);
//		su = 3000;값 변경 금지 final이기 때문에 
	}
	
}
