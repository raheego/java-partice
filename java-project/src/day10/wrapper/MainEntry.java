package day10.wrapper;

class Point {
	
}

public class MainEntry {
	public static void main(String[] args) {
		Integer Ia = new Integer(9);
		Integer Ib = new Integer("9");
		
		String su = "30";
		int x = 10;
		Point pt = new Point();
		
		//주소
		System.out.println(pt); 
		System.out.println( pt.toString() );
		System.out.println( pt.hashCode() );
		
		//실제 갖고 있는 데이터가 나온다. //9
		System.out.println(Ia);
		System.out.println(Ia.hashCode());
		System.out.println(Ia.getClass().getName()+'@'+Integer.toHexString(Ia.hashCode()));
		
		// Boxing vs unBoxing
		int y = 5; 
		double d =3.3;
//		d = y; // 묵시적 형변환 큰 수가 작은수에 담김 ????? 
		y = (int)d; // 명시적 형변환 ??
		
		
		int c = Ia.intValue(); // jdk4.x 이전까지는 사용하던 메소드 
		int e = Ib; //jdk 5.x 이후로는 자동으로 형변환 됨 autoboxing, unboxing 가능
		
		int num = Integer.parseInt(su);
		System.out.println(c+num);
		System.out.println(c+e);
		System.out.println(Ia.MAX_VALUE); // 21억 ~~
		System.out.println(Ia.MIN_VALUE); // -21억 ~~
	
		Double dd = new Double(12.34);
		System.out.println("-------------------");
		System.out.println(dd.MAX_VALUE); 
		System.out.println(dd.MIN_VALUE); 
		System.out.println(Float.MIN_VALUE);
		
		c = (int)dd.doubleValue(); // 큰 자료형 > 작은 자료형으로 바꾸려면 명시적 형변환 
		System.out.println("형변환 C 값은 ? " +  c);
		
		int f = Integer.parseInt("123"); // 문자열을 숫자로 
		int g = Integer.parseInt("1111111", 2); //이진수 문자열을 10진수로 바꾸는 것
		System.out.println("f" + f);
		System.out.println("g" + g);
		
		System.out.println(Integer.toOctalString(10)); //12
		System.out.println(Integer.toHexString(10)); //a 10진수> 16진수로
		System.out.println(Integer.toBinaryString(10)); //1010
		
		int h = 3;  // 스택영역에 저장 
		Integer i = new Integer(3); // 힙 영역에 저장
		
	}
}
