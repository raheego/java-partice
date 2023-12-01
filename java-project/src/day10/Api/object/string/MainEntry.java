package day10.Api.object.string;

class Point { 
	
	
}


public class MainEntry {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println("str" + str);

		char ch = str.charAt(0);
		System.out.println(ch);
		System.out.println(str.charAt(2));
		
		char data[] = {'a', 'b', 'c'};
	    str = new String(data);
	    System.out.println("str" + str);
	    System.out.println("kbs");

	    String msg = "slifjaoisjf142";
	    System.out.println("en-core" +  msg);
	    System.out.println(msg);
	    
		System.out.println(" ================================================= ");
		
	    String str2 = "abced".substring(2);
	    System.out.println(str2); //ced
	    
	    str2 = "aslkfjwo334pfl".substring(2,5);
	    System.out.println(str2); //lkf 시작값 포함 , 끝 값 미포함
	    
	    System.out.println(msg + " : " + str2);
	    
		System.out.println(" ================================================= ");
		
	    String s1 = new String("hello");
	    String s2 = new String("hello");
	    System.out.println("s1.hasCode() : " + s1.hashCode());
	    System.out.println("s2.hasCode() : " + s2.hashCode());
	    
	    Point p1 = new Point();
	    Point p2 = new Point();
	    System.out.println("p1.hasCode() : " + p1.hashCode());
	    System.out.println("p2.hasCode() : " + p2.hashCode());
	    
		System.out.println(" ================================================= ");
		
	    String s3 = "seoul";
	    String s4 = "seoul";
		if( s3 == s4 ) System.out.println("same");
		else System.out.println("not same");
		//same
		// 문자가 같기 때문에 
		

//	    String s1 = new String("hello");
//	    String s2 = new String("hello");
		if( s1 == s2 ) System.out.println("same");
		else System.out.println("not same"); 
		// not same
		// 힙 영역의 값을 물어볼 때는 equrals 갖고있는 데이터 
		//그냥 비교는 스택 영역의 주소를 비교하기 때문에 notsame
		
		System.out.println(" ================================================= ");
	}
}
