package day16.Lambda;

//타입을 써야하는 경우 
interface Message {  
	void something(int x, int y); // 매개변수o 여러개
//	void good(int x);
}

interface Talk{ 
	void something(String x, String y); //functional interface 인터페이스 안에 하나의 함수를 갖고 있는
}

class Person { 
	public void greeting(Message msg) {
		msg.something(1,2);
	}
	public void greeting(Talk msg) {
		msg.something("hello","world");
	}
}


public class LambdaMain4 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() { 
			
			@Override
			public void something(int x, int y ) { // 정의부
				System.out.println("parameter value : " + x + " , " + y);
			}
		});
		
		
		System.out.println(" ------------------ 람다 --------------- ");
		char ch = 'A';
//		p.greeting( (int x, int y) -> {
		p.greeting((String x, String y) ->{
			System.out.println("parameter value : " + x + " , " + y);
			System.out.println(ch);
			
//			ch = 'B'; //람다에서는 값 변경 안됨
			
			num = 2222;  // static 변수값은 변경 가능
			System.out.println(num);
		});
		
	}
	
	static int num = 30;
}
