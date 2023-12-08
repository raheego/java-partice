package day04.Input;

public class StringDataInput {
	public static void main(String[] args) {
		int x = 3, y = 5;
		
		// == 는 스택영역(실제 데이터 있는) 비교,
		// String으로 변수를 받으면 힙에는 문자열이(아래스트링기준) 있고 스택에 주소값이 들어감
		// 스택 영역에 각자의 주소값으로 들어가기 때문 주소값이 s1 != s2 다름
		
		String s1 = new String("korea");
		String s2 = new String("korea");
		
		// not same 출력
		if ( s1 == s2 ) System.out.println("same");
		else System.out.println("not same");
		
		if ( s1.equals(s2) ) System.out.println("same"); // 대소문자 구분 o
		else System.out.println("not same");
		
		if( s1.equalsIgnoreCase(s2) ) System.out.println("same"); // 대소문자 구분 x
		else System.out.println("not same");
	}
}
