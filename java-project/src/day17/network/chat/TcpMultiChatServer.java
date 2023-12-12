package day17.network.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

// collection, Thread, io, basic java
public class TcpMultiChatServer { // outer Class
	HashMap clients; // key value;

	public TcpMultiChatServer() { // 생성자 함수
		clients = new HashMap(); // 초기화 및 객체생성
		Collections.synchronizedMap(clients); //동기화 
	}

	// user method
	public void start() {
		ServerSocket ss = null; // server socket 1
		Socket s = null; // client socket 2

		try {
			ss = new ServerSocket(7777);
			System.out.println("Sever Start --");

			//클라이언트가 계속 들어올 수 있게 while 
			//클라이언트 별로 소켓 생성
			while (true) {
				System.out.println("클라이언트 연결 대기중");

				s = ss.accept(); // 응답대기, 클라이언트 소켓
				System.out.println("[" + s.getInetAddress() + ":" + s.getPort() + "] 에서 접속하셨습니다.");

				// client가 접속할 때 새로운 스레드 생성
				ServerReceiver thread = new ServerReceiver(s); // user class
				thread.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}// user method, start() end.

	
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator(); // key 값 출력
	
		while( it.hasNext() ) { 
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(it.next()); //해당 키 값으로 value 값 출력
				System.out.println("dos.toString() : " + dos.toString() );
				dos.writeUTF(msg);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // while end
	} // sendToAll end

	
	class ServerReceiver extends Thread { // inner class
		Socket s;
		DataInputStream dis; // readXXX(); - XXX:자료형
		DataOutputStream dos; // writeXXX(); - XXX: 자료형
		
		public ServerReceiver(Socket s) { // 생성자 함수 멤버변수의 초기화 담당
			this.s = s;
			
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크를 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크를 통해서 쓰기
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			String name = "";
			
			try {
				name = dis.readUTF();
				//sendToAll("#" + name + "님이 입장하셨습니다.");
				clients.put(name, dos); //HashMap에 넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + "입니다."); //접속자 수 확인
				
				// 대화
				while( dis != null ) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				sendToAll("#" + name + "님이 나가셨습니다.");
				clients.remove(name); // 접속자수 제거
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속 종료 하셨습니다.");
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + "입니다.");
			}
		}
	} // ServerReceiver class end

	
	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}
}
