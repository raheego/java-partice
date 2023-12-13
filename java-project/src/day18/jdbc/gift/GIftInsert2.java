package day18.jdbc.gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GIftInsert2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		// 1. Driver load .. exception 예외 발생
		Class.forName("org.mariadb.jdbc.Driver");
	
		//2. conncection & open
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore" , "root", "maria");
		
		//3. 사용 DML - insert = Statement / PreparedStatement

		System.out.println("추가할 상품번호. 상품데이터, 최저가, 최고가, 카운트");
		String sql = "INSERT INTO gift VALUES(?,?,?,?,?)"; // 쿼리문
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//컬럼에 맞게 데이터 넣기 
		
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		pstmt.setInt(5, sc.nextInt());
		
//		pstmt.setInt(1, 15);
//		pstmt.setString(2, "사탕세트");
//		pstmt.setInt(3, 50);
//		pstmt.setInt(4, 500);
//		pstmt.setInt(5, 0);
	
		
        int result = pstmt.executeUpdate(); //반환값이 없는 경우 - insert, update, delete; 
        System.out.println(result + " 개 데이터 추가 성공함");

        conn.commit();
        
        // 4. 닫기
        pstmt.close();
        conn.close();
        
        //SQL Query 구문, HTML Tag 는 자바에서 문자열 취급함.
	}
}
