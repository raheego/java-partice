/*
package ex01.oprator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자 : 증감 => ++, --, ~ ...
		int x = 10, y;
		
		y = x++; // 후위연산 : 대입먼저, 연산 나중 x = 11 , y = 10 
		y = ++x; // 전위연산 : 연산먼저, 대입 나중 x = 11, y = 11
		
		
		System.out.println("x =" + x +", y =" + y);
	}
}
*/


/*
package ex01.oprator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 단항연산자 : 증감 => ++, --, ~ ...
		int x = 10, y;
		
		y = ~x; // 비트부정	-(원래값 + 1) => 결과
		System.out.println("x =" + x +", y =" + y); //x =10, y =-11
		
	
		// x = -7 이면 6출력 
	
	}
}
*/


/*
package ex01.oprator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//산술연산자 : + - * / %
		int x = 10, y = 20; 
		int gob = x * y; 
		
		System.out.println("x * y " + gob); // 200 
		System.out.println("\n\n3+4*5 = " + (3+4*5)); //3+4*5 = 23
		System.out.println("(3+4)*5 = " + ((3+4)*5)); //(3+4)*5 = 35
		
		// 정수 ( + - * / % .. ) 정수 = 정수
		System.out.println("\n 7/3 =" + (7/3)); // 2 몫
		System.out.println("7%3 =" + (7%3)); //1 나머지 
		
		System.out.println("\n 7/3.0 =" + (7/3.)); // 2.3333 실수형태로 바뀐다. 
		System.out.println("7.0%3.0 =" + (7.%3.)); // 1.0  
		
	}
}
*/


/*
package ex01.oprator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//쉬프트 연산자 : << (왼쪽쉬프트) , >> (오른쪽쉬프트), >>>
		// 가지고 있는 10진수를 비트로 쪼갠다음 밀어내라 
		
		int x = 8, result; 
		
		result = x << 2; // left shift : 원래값*2^bit수 ex) 8 * 2^2 = 32
		result = x >> 3; // right shift : 원래값/2^bit수 ex) 8 / 2^3 = 1 
	}
}
*/

/*
package ex01.oprator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 관계연산자 : >, < , >=, <=, ==, !=
		int x = 3, y = 5; 
		
		boolean flag = true;
		
		System.out.println(!flag); // 부정연산자 true > false , false > true
		
		// 0, 0.0 , null 을 제외한 모든 값은 '참'이다.
		
		if ( x > y ) {
			System.out.println("max : " + x);
		} else  {
			System.out.println("max : " + y);
		}
	}
}
*/
/*
package ex01.oprator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 논리연산자 : &(and), || or, ^(xor)
		// 2진논리 => 결과 : 값
		
		int x=4, y =7; 
		System.out.println(x & y); // 4
		System.out.println(x | y); // 7
		System.out.println(x ^ y); // 3
		
	}
}
*/
/*
package ex01.oprator;
//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		int x = 10, y = 20, z = 30;
		boolean result = true;
		
		result = (x>y) && (y>z); // '&&' 연산은 앞에 것이 '거짓'이면 뒤는 수행x
		
		result = (x<y) && (y>z); //false 값이 나옴
	
		result = (x<y) || (y<z); // '||'연산은 앞에 것이 참이면 뒤는 수행x
	}
}
*/

/*
package ex01.oprator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		//삼항(조건) 연산자 : (조건) ? 참 : 거 짓;
		int x = 20, y = 10;
		String msg = null; 
		
		msg = (x != y) ? "not same" : "same";
		System.out.println(msg);
	
		int a = 10, b=20, c=30, result;
		result = (a>b) ? a : 
							 (b>c)? b : c; 
		System.out.println(result);
	}
}
*/

/*
package ex01.oprator;

//최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 대입연산자 : = , += -= *= /= >>=...
		
		int x = 3, y = 5, result;
		result = x + y;
		System.out.println(result);
		
		x = x + y; // x+=y;
		x = x*y // x*=y;
				
		x = x + 1; 
		x += 1; 
		x++; 
	}
}
//*/


