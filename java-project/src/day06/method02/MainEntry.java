package day06.method02;

public class MainEntry {
	//3. 매개변수 x , 리턴타입 o
    //`public returnType methodName() { return value; }`
	public static String show() {
//		return "Hello String!";
		String str = "hello World";
		return str;
	}
	
	public static int iShow() {
		int su = 99; 
		return su; 
	}
	public static void main(String[] args) {
		//리턴하는 것은 함수 호출이 출력부분에 있다.
		String msg = show();
		System.out.println(msg);
		System.out.println( show() );
	
		System.out.println( iShow() );
		int num = iShow();
		System.out.println(num);
		
		int add = plus(1,2);
		System.out.println(add);
		System.out.println( plus(3,5) );
	}
	
	
//	4. 매개변수o, 리턴타입o 
//	`public returnType methodName(parameter val1, parameter val2,..)  {  retrun value; }`
	public static int plus(int x, int y ) {
		int hap = x + y; 
		return hap; // return x+y; 
	}
}
