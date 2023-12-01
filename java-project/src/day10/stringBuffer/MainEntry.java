package day10.stringBuffer;

public class MainEntry {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 초기 용량 16

		System.out.println(sb.hashCode());

		System.out.println("lenght     /    capacity");
		System.out.println(sb.length() + "         /   " + sb.capacity()); // 길이와 용량 확인

		sb.append("encore");
		System.out.println(sb.length() + "        /   " + sb.capacity()); // 길이와 용량 확인
		System.out.println("-----------------------------");

		sb.append("1234566776554");
		System.out.println(sb.length() + "      /   " + sb.capacity()); // 길이와 용량 확인
		System.out.println("-----------------------------");

		sb.append("1234566776554 34562412457451234123");
		System.out.println(sb.length() + "      /   " + sb.capacity()); // 길이와 용량 확인
		System.out.println("-----------------------------");

		sb.trimToSize(); // 자기가 가진 글자 수만큼 사이즈에 맞게 재조정
		System.out.println(sb.length() + "      /   " + sb.capacity()); // 길이와 용량 확인
		System.out.println("-----------------------------");

		System.out.println(sb.hashCode()); // 같은 공간을 계속 사용하고 있기에 주소는 동일하게 나옴 
	}
}
