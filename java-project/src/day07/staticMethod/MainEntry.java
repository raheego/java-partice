package day07.staticMethod;

/*
	static method : 객체 생성 없이 바로 사용 가능함
	objectName.methodName();
	ClassName.methodName();
*/

class A {
	int x,y;
	
	//static method
	public static void setData(int xx, int yy) {
		System.out.println(xx + " " + yy);
	}
}// A class end 

public class MainEntry {

	public static void main(String[] args) {
		A.setData(3, 5);
		A obj = new A(); // 객체생성, 메모리 할당, 생성자함수 자동호출
		
		obj.x = 9; // class A int x 에다가 9를 넣음
		System.out.println(obj.x);
		obj.setData(1, 2); // objectName.methodName();
		A.setData(50, 70); //ClassName.methodName();
 	}
}
