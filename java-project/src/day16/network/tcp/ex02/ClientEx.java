package day16.network.tcp.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {
	public static void main(String[] args) {
		BufferedReader br = null, stin = null;
		BufferedWriter bw = null;
		Socket client = null; //socket 1
		
		try {
			client = new Socket("127.0.0.1", 9999);
		
			// 네티워크를 통해서 데이터 읽어옴
			br = new BufferedReader(new InputStreamReader(client.getInputStream())); 
			// 키보드로부터 입력 스트림
			stin = new BufferedReader(new InputStreamReader(System.in));
			// 출력 스트림
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				
			String OutputMessage; //내가 먼저 말걸어
			while(true) {
				System.out.println("메세지를 입력하세요");
				OutputMessage = stin.readLine();
				
				if (OutputMessage.equalsIgnoreCase("exit")) {
					bw.write(OutputMessage);
					bw.flush();
					break;
				}
				
				bw.write(client.getInetAddress() + "클라이언트 > " + OutputMessage + "\n");
				bw.flush();
				
				String inputMessage = br.readLine();
				System.out.println(inputMessage);
			}//while end 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				client.close();
			} catch (Exception e2) {
				System.out.println("서버와 채팅 중 오류 발생..");
			} // inner try end
		}// out try end 
		
		
	}
}
