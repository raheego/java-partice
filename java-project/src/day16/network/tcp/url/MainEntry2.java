package day16.network.tcp.url;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainEntry2 {
	public static void main(String[] args) throws MalformedURLException, IOException {
		URL url = new URL("https://www.google.com/search?gs_ssp=eJzj4tLP1TdIyck2LK8yYPTiLc7PU8hILc1LV8jNzAMAdq8I4A&q=son+heung+min&oq=son&gs_lcrp=EgZjaHJvbWUqDQgBEC4YgwEYsQMYgAQyEAgAEAAYgwEY4wIYsQMYgAQyDQgBEC4YgwEYsQMYgAQyBggCEEUYOTINCAMQLhjHARjRAxiABDIKCAQQABixAxiABDIKCAUQABixAxiABDINCAYQABiDARixAxiABDIGCAcQRRg80gEIMzA4M2owajmoAgCwAgA&sourceid=chrome&ie=UTF-8");

//		https://www.google.com/
//		search?
//		gs_ssp=eJzj4tLP1TdIyck2LK8yYPTiLc7PU8hILc1LV8jNzAMAdq8I4A
//		&q=son+heung+min
//		&oq=son&gs_lcrp=EgZjaHJvbWUqDQgBEC4YgwEYsQMYgAQyEAgAEAAYgwEY4wIYsQMYgAQyDQgBEC4YgwEYsQMYgAQyBggCEEUYOTINCAMQLhjHARjRAxiABDIKCAQQABixAxiABDIKCAUQABixAxiABDINCAYQABiDARixAxiABDIGCAcQRRg80gEIMzA4M2owajmoAgCwAgA&sourceid=chrome&ie=UTF-8");

		//url이 갖고 있는 함수들 사용
		System.out.println( "프로토콜 : " + url.getProtocol() );
		System.out.println( "호스트와 포트 : " + url.getAuthority() );
		System.out.println( "호스트 : " + url.getHost() );
		System.out.println( "포트 : " + url.getPort() );
		System.out.println( "경로 : " + url.getPath() );
		System.out.println( "질의 : " + url.getQuery() );
		System.out.println( "파일명 : " + url.getFile() );
		System.out.println( "참조 : " + url.getRef() );
		
	}
}
