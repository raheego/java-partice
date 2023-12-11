package day16.network.tcp.ex01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest { // 소켓 1개 필요 - 서버측 소켓
	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("192.168.0.80", 9000); // server ip & port number
			// 192.168.0.40
			//들어가고자 하는 친구 ip
			
			InputStream is = s.getInputStream(); //read
			OutputStream os = s.getOutputStream(); //write
			
			String str = "메롱 ^ㅠ^";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}//inner try end s
		} //out try end
	}
}


