package day16.Lambda;
/*
interface Message {  
	void something();
}

class Person { 
	public void greeting(Message msg) {
		msg.something(); // 인터페이스 함수호출은 정의부가 반드시 구현되어야 함
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() {
			
			@Override
			public void something() { // 정의부
				System.out.println(" === default ===");
				System.out.println("thank you for us");
				System.out.println("감사합니다.");
			}
		});
		
		
		System.out.println(" --------------------------------- ");
		p.greeting(() -> { //interface Message 의 something() 안에 매개변수가 아무것도 없으니깐.
			System.out.println(" === Lamdba ===");
			System.out.println("thank you for us");
			System.out.println("감사합니다.");
		});
		
	}
}

*/
