package day10.Api.utilPkg.StringTokenizer;

import java.util.StringTokenizer;

public class ex02 {
	public static void main(String[] args) {
		// 두세가지 구분자가 들어갈 수 있다.
		StringTokenizer token = new StringTokenizer("사과 = 5| 초코 = 3 | 샴페인 = 1","=|", true);
	
		
		while(token.hasMoreTokens()) { //다음 요소가 있냐 
//			System.out.println(token.nextToken());
			
			String str = token.nextToken();
			if( str.equals("=") ) System.out.println("\t");
			else if(str.equals("|") ) System.out.println("\n");
			else System.out.println(str);
		}
	}
}
