package day16.network.tcp.ex02;

import java.io.*;
import java.net.*;

public class ServerChat {
    public static void main(String[] args) throws IOException {
        int port = 8000;
        ServerSocket ss = new ServerSocket(port);
        System.out.println("Chat server start");

        while (true) {
            Socket s = ss.accept();
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "euc-kr"));
            PrintWriter ps = new PrintWriter(System.out, true);

            ps.print(s.getInetAddress().getHostAddress());
            String str = br.readLine();
            byte[] buffer = str.getBytes("euc-kr");
            String message = new String(buffer, "euc-kr");

            ps.print(" : 수신한 메시지 =====> " + message);

            br.close();
            s.close();
        } // while end
    }
}
