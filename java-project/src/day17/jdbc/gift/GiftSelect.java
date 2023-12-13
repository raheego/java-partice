package day17.jdbc.gift;

import java.sql.*;

public interface GiftSelect { //select
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load .. exception 예외 발생
		Class.forName("org.mariadb.jdbc.Driver"); //예외발생
		System.out.println("driver load success!");
	
		//2. conncection & open
					//driver:IP:portNumber/db명
		String url = "jdbc:mariadb://localhost:3306/encore";
		String uid = "root";
		String pwd = "maria"; 
		
		Connection conn = DriverManager.getConnection(url,uid,pwd); //예외발생
		System.out.println("conncection success");
		
		
		//3. 사용 (DML 명령어) - select
		Statement stmt = conn.createStatement(); 
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT"); //
		
		System.out.println("상품번호/col2/col3/ .... ");
		while(rs.next()) { 
			int gno = rs.getInt(1); // 인덱스, int gno = rs.getInt("필드명");
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt("g_end");
			
			System.out.println(gno + "\t" + gname +"\t" + g_s +"\t" +g_e  );
		}
		
		//4. close (자원반환)
		rs.close(); 
		stmt.close();
		conn.close();
		
		
	}
}
// SQL Query 구문,HTML Tag는 자바에서 문자열 취급