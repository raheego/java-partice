package day17.jdbc.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry { 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load .. exception 예외 발생
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success!");
	
		//2. conncection & open
					//driver:IP:portNumber/db명
		String url = "jdbc:mariadb://localhost:3306/encore";
		String uid = "root";
		String pwd = "maria";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		System.out.println("conncection success");
		
		
		//3. 사용 (DML 명령어)
		
		
		//4. close (자원반환)
	}
}
