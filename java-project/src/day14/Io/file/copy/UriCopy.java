package day14.Io.file.copy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.MalformedInputException;

// 웹에서 받아오기 이미지
public class UriCopy {
	public static void main(String[] args) 
										throws MalformedInputException, IOException { //예외처리 위임
		URL url = new URL("https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
		
		// 읽기 객체 fileInputStream
		InputStream is = url.openStream(); //게이트 생성
		
		//쓰기 객체
		OutputStream os = new FileOutputStream("google.jpg"); //상대경로
		
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			int inputData = is.read(buffer);
			if( inputData == -1 ) break;
			os.write(buffer, 0 , inputData);
		}
		is.close();
		os.close();
		
		System.out.println("웹에서 파일 복사 성공했습니다.");
	}
}
