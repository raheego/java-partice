package day10.Api.object.string;

public class StringMain {
	public static void main(String[] args) {
		String s1 = "hello java";
		String s2 = "HELLO JAVA";
		System.out.println("s1" + s1 + ", s2" + s2);
		
		//문자열 결합
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2);
		
		System.out.println(" ================================================= ");
		
		// replace
		System.out.println( s2.replace("JA","korea")); //HELLO koreaVA
		System.out.println("s1" + s1 + ", s2" + s2); // replace로 했다고 수정이 안됨 원본 그대로
		//s2 = s2.replace("JA","korea"); // 진짜로 변경됨
		
		System.out.println(" ================================================= ");
		
		// length
		String s3 = new String("     a bb cd ");
		System.out.println(s3);
		System.out.println( s3.length() );
		
		// trim 
		// 글자 중간의 공백제외하고 공백제고
		s3 = s3.trim();
		System.out.println( s3 );
		System.out.println( s3.length() );
		
		System.out.println(" ================================================= ");
		
		
		//split
//		String s4 = new String("abc dsfkjow2  345 wuo#fs");
		String s4 = new String("https://www.naver.com/");
//		String[] s5 = s4.split(" "); //공백기준
		String[] s5 = s4.split("/"); 
		for(int i = 0; i < s5.length; i ++ ) {
			System.out.println("분리된 " + i + "번째 문자열" + s5[i]);
		}
		
		System.out.println(" ================================================= ");
		
		String s6 = "123-3435-56567";
		s5 = s6.split("-");
		for(int i = 0; i < s5.length; i ++ ) {
			System.out.println( s5[i]);
		}
		
		System.out.println(" ================================================= ");
			
		String s7 = "1234567890asdfgh dihfs oi2   201";
		char ch = s7.charAt(0);
		System.out.println(ch); //1
		System.out.println(s7.indexOf("1")); //0
		System.out.println(s7.lastIndexOf("1")); // 넣은 숫자의 마지막 번째
		System.out.println(s7.substring(3)); // 3번째 위치부터 끝까지 출력
		System.out.println(s7.substring(1,3)); //23
		
		// 대소문자
		System.out.println(s7.toLowerCase());
		System.out.println(s7.toUpperCase());
		
		
		System.out.println(" ================================================= ");
			
	}
}
