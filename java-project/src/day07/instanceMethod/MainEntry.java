package day07.instanceMethod;

/*
	instance method : 객체 생성하고 사용해야함 (메모리상에 할당이 되어야.. )
*/
class B {
	int x, y; 
	
	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + " " + yy);
	}
	
} // class B end 

public class MainEntry {
	public static void main(String[] args) {
		B b = new B(); // 객체 생성해야함. 객체 생성, 메모리에 할당, 생성자함수 자동호출
		b.setData(100, 200); //객체를 생성한 다음 객체를 통해 들어감
	}
}
