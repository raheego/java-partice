package day14.Io.file.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		// 읽기 객체 fileInputStream
		InputStream is = new FileInputStream("memo.txt");
		
		//쓰기 객체
		OutputStream os = new FileOutputStream("C:\\Users\\Playdata\\Desktop\\@java\\input/input_copy.txt");
		
		byte[] buffer = new byte[1024*8];
		
		long start = System.currentTimeMillis();
		
		//처리중
		while(true) {
			int inputData = is.read(buffer); // buffer 크기만큼 읽어들임
			if ( inputData == -1 ) break;
			os.write(buffer, 0 , inputData);
		}// while end
		
		long end = System.currentTimeMillis();
		
		//소여시간 계산
		System.out.println( end - start );
		
		is.close();
		os.close();
		System.out.println("복사성공");
		
	}
}
