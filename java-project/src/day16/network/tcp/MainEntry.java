package day16.network.tcp;

import java.net.InetAddress;

public class MainEntry {
	public static void main(String[] args) {
		String host = "127.0.0.1"; //고정ip
		
		try {
			
			InetAddress[] address = InetAddress.getAllByName(host);
			for(InetAddress item: address) {
				System.out.println(item);
				System.out.println(item.getCanonicalHostName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
