package day10.Api.utilPkg.ex01;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
	public static void main(String[] args) {
//		StringTokenizer st = new StringTokenizer("this is a test");
		StringTokenizer st = new StringTokenizer("김연아/박태환/강감찬/이순신/","/");
	
		while(st.hasMoreTokens()) { //다음 요수가 있느냐
			System.out.println( st.nextToken() );
		}
		
		System.out.println(" ============================= ");
		
		String[] result = "this is a test".split(" ");
		for ( int i = 0; i < result.length; i++ ) {
			System.out.println(result[i]);
		}
		
	}
}
