package day04.While;

public class While_Input {
	public static void main(String[] args) {

		int x = 3, y = 3;

		if (x == y)
			System.out.println("same");
		else
			System.err.println("not same");

		/*
		 * String String new 변수라 스택에 쌓이지만 주소만 갖고 내용 스트링은 힙에 쌓임. 스택영역에 각자 주소값을 각각 가지기 때문에
		 * 주소 영역이 s1,s2가 다르기에 not same;
		 * 
		 * 대소문자도 not same
		 *
		 */
		String s1 = new String("korea");
		String s2 = new String("korea");

		// 객체 안에 있는 데이터 비교
		// if (s1 == s2 ) System.out.println("same");

		// 힙 영역 데이터 비교
		if (s1.equals(s2))
			System.out.println("same"); // 대소문자 비교
		if (s1.equalsIgnoreCase(s2))
			System.out.println("same"); // 대소문자 비교 안함
		else
			System.err.println("not same");
	}
}
