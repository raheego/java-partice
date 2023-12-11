package day16.network.tcp.url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class MainEntry {
	public static void main(String[] args) throws MalformedURLException, IOException {
		//웹상에 있는 것을 읽어들일 때 
		URL google = new URL("http://www.google.com");

		//System.in : 표준입력 - 키보드
		//openStream 웹상 통로를 여는 것
		BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
		
		String inputLine;
		while( (inputLine = br.readLine() ) != null ) {
			System.out.println(inputLine);
		}
		
		br.close();
	}
}
