package day10.Api.object.equals;

class Circle { 
	int x, y;
}


public class MainEntry {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		if ( c1 == c2 ) System.out.println("same");
		else System.out.println("not same"); // not same
		
		System.out.println(c1.hashCode() + " , " + c2.hashCode() );
		
		System.out.println(" ================================================= ");
		
		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if ( x == y ) System.out.println("same"); 
		else System.out.println("not same"); 
		// same
		//실제 데이터가 들어 있는 곳을 비교하니깐 같다. 기본자료형
		
		System.out.println(" ================================================= ");

		String s1 = new String("korea");
		String s2 = new String("korea");
		System.out.println("참조형 자료형"); 
		if ( s1 == s2 ) System.out.println("same");
		else System.out.println("not same"); 
		//not same
		// 힙에 들어간 데이터가 static 영역에 있는 주소를 다르게 찾으니깐

		System.out.println("equals method");
		if ( s1.equals(s2) ) System.out.println("same");
		else System.out.println("not same"); 
		//same
		
		System.out.println(" ================================================= ");

		System.out.println("equalsIgnoreCase method");
		if ( s1.equalsIgnoreCase(s2) ) System.out.println("same");
		else System.out.println("not same"); 
		//same
		// 대소문자 구분 안하고 비교함
	}
}
