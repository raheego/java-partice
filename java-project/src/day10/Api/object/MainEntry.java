package day10.Api.object;


class Point { } 


public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass() );
		System.out.println("hash code : " + pt.hashCode() ); //메모리상 10진수형태 1651191114
		System.out.println("Object String : " + pt.toString() ); //
		System.out.println("Object String : " + pt ); //
		System.out.printf("10진수 %d\n", 0x626b2d4a ); //10진수로 표현하기 1651191114 // 숫자, 0숫자,0x숫자(16진수)
		
		System.out.println(" ================================================= ");
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass() );
		System.out.println("hash code : " + pt2.hashCode() ); //
		System.out.println("Object String : " + pt2.toString() ); //
		System.out.println("Object String : " + pt2 ); //
	
		System.out.println("pt.toString() : toString()의 의미 - day10.Api.object.Point@7a79be86");
		System.out.println(pt2.getClass().getName()+'@'+Integer.toHexString(pt2.hashCode()));
		
		System.out.println(" ================================================= ");
		
		Point pt3 = new Point();
		if( pt.hashCode() == pt3.hashCode() ) System.out.println("same");
		else System.out.println("not same");
		//not same
		
		System.out.println(" ================================================= ");
		
		Point pt4;
		pt4 = pt; 
		if ( pt4 == pt ) System.out.println("same");
		else System.out.println("not same");
		// same
		
		System.out.println(pt.hashCode() + " , " + pt4.hashCode() );
		
		System.out.println(" ================================================= ");
		
		
	}
}
