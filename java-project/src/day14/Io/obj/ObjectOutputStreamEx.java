package day14.Io.obj;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

//객체 타입으로 읽고 쓰기
//readObj, writeObj

public class ObjectOutputStreamEx {
	public static void main(String[] args) 
											throws Exception {
										//throws FileNotFoundException,IOException {
		
		Grade vo = new Grade();
		vo.setSubject("미술");
		vo.setScore(80);
		
		vo.setSubject("전산");
		vo.setScore(90);
		
		System.out.println(vo);	//화면출력
		OutputStream os = new FileOutputStream("grade.dat"); //상대경로
		ObjectOutputStream oos = new ObjectOutputStream(os);

		oos.writeObject(vo);	// 지정한 파일 파일 grade.dat안에 쓴다.
		oos.close();
		
	}
}
