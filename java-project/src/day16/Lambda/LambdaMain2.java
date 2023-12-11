package day16.Lambda;
/*
interface Message {  
	int something(int x); // 리턴타입o 매개변수o
}

class Person { 
	public void greeting(Message msg) {
		int su = msg.something(80);
		System.out.println("Number is  : " + su);
	}
}


public class LambdaMain2 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.greeting(new Message() { // 리턴 타입, 파라미터 
			
			@Override
			public int something(int x) { // 정의부
				System.out.println("parameter value : " + x);
				return 200; // 가데이터 
			}
		});
		
		
		System.out.println(" --------------------------------- ");
		//p.greeting((x) -> {  // 변수명 상관없음. 그냥 매개변수만 넣으면 됨
		p.greeting( x -> { // 매개변수 1개일 경우 괄호 생략 간능	, 타입 명시 생략 가능
			System.out.println("parameter value : " + x);
			return x;
		});
		
		p.greeting(x -> x); //리턴만 있는경우는 이렇게도 가능
		p.greeting(x -> 999); 
	}
}
*/