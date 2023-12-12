package day16.network.tcp.ex02;
import java.io.*;
import java.net.*;

public class ClientChat {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        String ip, str;

        PrintWriter ps = new PrintWriter(System.out, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ps.print("접속할 서버의 IP 주소를 입력하세요: ");
        ip = br.readLine();
        ps.print("전송할 메시지를 입력하세요: ");
        str = br.readLine();

        try (Socket client = new Socket(ip, port);
             OutputStream os = client.getOutputStream();
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os, "euc-kr"))) {

            byte[] buffer = str.getBytes("euc-kr");
            String message = new String(buffer, "euc-kr");

            bw.write(message, 0, message.length());
            bw.flush();

            ps.println(ip + " 서버로 메시지를 전송했습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





