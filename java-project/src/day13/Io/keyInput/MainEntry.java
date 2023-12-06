package day13.Io.keyInput;

import java.io.IOException;

public class MainEntry {
	public static void main(String[] args) 
										throws IOException{ //예외처리 위임 jvm
		int su1 = 0;
		
		System.out.println("데이터 입력 끝은 ctrl + z 누르세요");
		
		while( (su1 = System.in.read()) != -1 ) {
			System.out.println(su1 + "\t");
			System.out.println( (char)su1 + "\t");
		}
		System.out.println();
	}
}
