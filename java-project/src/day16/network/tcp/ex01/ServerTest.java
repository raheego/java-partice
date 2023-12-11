package day16.network.tcp.ex01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerTest {
	public static void main(String[] args) { //소켓 2개 필요
		ServerSocket ss = null;
		Socket s = null;
		
		System.out.println("server start");
		
		try {
			ss = new ServerSocket(9000); // 0 ~ 1024 포트넘버는 예약되어 있음
			s = ss.accept(); //client socekt, 응답대기
			
			// I/o 
			InputStream is = s.getInputStream(); //read
			OutputStream os = s.getOutputStream(); //write
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println( new String(arr) );
			
			String message = "메롱 ^ㅠ^이지롱"; //내가 상대방에게 보낼 메세지
			os.write(message.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//inner try end s
		} // out try end
	}//main end
}

//친구랑 하면 내가 서버를 열어둔 상태여야 함