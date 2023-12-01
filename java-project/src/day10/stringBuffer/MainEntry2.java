package day10.stringBuffer;

public class MainEntry2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		//문자열 추가 append 이용
		System.out.println(sb);
		sb.append(" flower");
		System.out.println(sb);
		
		//문자열 삽입 insert
		sb.insert(4, " my");
		System.out.println(sb);
		
		//문자여려 변경 replace
		sb.replace(5, sb.length(), "cookie");
		System.out.println(sb);
		
//		System.out.println( sb.reverse() );
		System.out.println( sb.length() );
		
		sb.setLength(4);
		System.out.println(sb);
		
		//용량확인 - 그대로 
		System.out.println( sb.capacity() );
	
	}
}
