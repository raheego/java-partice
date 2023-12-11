package day16.Lambda;
/*
interface Message {  
	int something(int x, int y); // 리턴타입o 매개변수o 여러개
}

class Person { 
	public void greeting(Message msg) {
		int su = msg.something(1,2);
		System.out.println("Number is  : " + su);
	}
}


public class LambdaMain3 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() { // 리턴 타입, 파라미터 
			
			@Override
			public int something(int x, int y ) { // 정의부
				System.out.println("parameter value : " + x + " , " + y);
				return 33; // 가데이터 
			}
		});
		
		
		System.out.println(" ------------------ 람다 --------------- ");
		p.greeting( (x,y) -> {
			System.out.println("parameter value : " + x + " , " + y);
			return x;
		});
		
		p.greeting((x,y) -> x+y ); //리턴만 있는 경우 {} 생략 가능 return x + y
		p.greeting((x,y) -> 24); 
	}
}*/
