package day07.oop.quiz;

public class MainEntry {
	public static void main(String[] args) {
		//Tv v = new Tv(); default;
		// Tv.java 생성자함수가 하나라도 정의 되어 있으면
		// 위 코드 디폴트가 사용될 수 없다.
		
		Tv v = new Tv("red");
		v.display();
		v.setColor("red");
		v.setChannel(43);
		v.display();
	}
}
