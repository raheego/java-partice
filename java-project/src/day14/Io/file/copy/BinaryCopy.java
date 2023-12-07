package day14.Io.file.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {
	public static void main(String[] args) {
		// src에 있는 파일을 dist 에 넣기
		File src = new File("C:\\Users\\Playdata\\Desktop\\@java\\input/input.txt"); // 절대경로
		File dist = new File("C:\\Users\\Playdata\\Desktop\\@java\\test-local/input.txt");

		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
	
		try {
			fis = new FileInputStream(src); // 파일입력 바이트 스트림 연결
            fos = new FileOutputStream(dist); // 파일 출력바이트 스트림 연결
            bis = new BufferedInputStream(fis); // 버퍼 입력스트림 연결
            bos = new BufferedOutputStream(fos); // 버퍼 출력스트림 연결

			while ( ( c = bis.read() ) != -1 ) {
				bos.write((char)c);
			}

			System.out.println("파일복사성공");	
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
