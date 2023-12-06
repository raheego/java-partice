package day13.Io.BufferdReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) 
								throws IOException{ // 예외처리 jvm
		/*		
		 * InputStream is = System.in; // 표준입력
		Reader reader = new InputStreamReader(is); // 추상메소드니깐 상속받아서 생성
		BufferedReader br = new BufferedReader(reader);
		*/
	
//		System.out.println("charator input = "); 
//		String str = br.readLine(); // 예외발생
//		String str2 = br.readLine();
//		int su1 = Integer.parseInt(str);
//		int su2 = Integer.parseInt(str2);
//		
//		System.out.println(su1 + su2);
//		System.out.println(str + str2);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//위 코드 축약해서 씀
		int str = Integer.parseInt(br.readLine()); 
		int str2 = Integer.parseInt(br.readLine()); 
		
		System.out.println("charator input = ");
		
	}
}
