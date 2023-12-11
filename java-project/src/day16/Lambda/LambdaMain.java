package day16.Lambda;

// int 형태, 리턴o, 매개변수 x
/*
interface Message {  
	int something(); // int 형태, 리턴o
}

class Person { 
	public void greeting(Message msg) {
		int su = msg.something();
		System.out.println("Number is  : " + su);
	}
}


public class LambdaMain {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() { // 리턴 타입
			
			@Override
			public int something() { // 정의부
				System.out.println(" === default ===");
				System.out.println("thank you for us");
				System.out.println("감사합니다.");
				
				return 200; // 가데이터 
			}
		});
		
		
		System.out.println(" --------------------------------- ");
		p.greeting(() -> { 
			System.out.println(" === Lamdba ===");
			System.out.println("thank you for us");
			System.out.println("감사합니다.");
			
			return 50;
		});
		
	}
}
*/