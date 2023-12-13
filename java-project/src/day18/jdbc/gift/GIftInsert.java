package day18.jdbc.gift;

import java.sql.*;

public class GIftInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load .. exception 예외 발생
		Class.forName("org.mariadb.jdbc.Driver");
	
		//2. conncection & open
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore" , "root", "maria");
		
		//3. 사용 DML - insert = Statement / PreparedStatement
		System.out.println();
        Statement stmt = conn.createStatement();
        
        // INSERT INTO gift VALUES(2, '스팸', 800, 1200)
        String sql = "INSERT INTO gift VALUES(3, '스팸세트', 1000,4000, 0)"; // 쿼리문
    
        int result = stmt.executeUpdate(sql); // 정상적으로 처리되었는지 
        System.out.println(result + " 개 데이터 추가 성공함");

        conn.commit(); 
        
        // 4. 닫기
        stmt.close();
        conn.close();
        
        //SQL Query 구문, HTML Tag 는 자바에서 문자열 취급함.
	}
}
