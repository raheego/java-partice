package day09.Interface.quiz;

public class MainEntry {
	public static void main(String[] args) {
		//Trans t = new Trans(); //인터페이스는 객체가 아니라 못불러온다.
		Trans t = new Subway();
		t.start();
		t.stop();
		
		t = new Bus();
		t.start();
		t.stop();
	}
}
	