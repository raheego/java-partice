package day18.jdbc.gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GIftDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		// 1. Driver load .. exception 예외 발생
		Class.forName("org.mariadb.jdbc.Driver"); 
	
		//2. conncection & open
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore" , "root", "maria");
		
		//3. 사용 DML - insert = Statement / PreparedStatement
		System.out.println("삭제할 gno = ? ");
		String sql = "DELETE FROM GIFT WHERE GNO = ?"; // 쿼리문임, '?' 안으로 들어감
		 
		//컬럼에 맞게 데이터 넣기 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt()); //1은 첫번째 물음표 
		
        int result = pstmt.executeUpdate(); //반환값이 없는 경우 - insert, update, delete; 
        System.out.println(result + " 개 데이터 삭제 성공함");

        conn.commit(); 
        
        // 4. 닫기
        pstmt.close();
        conn.close();
        
        //SQL Query 구문, HTML Tag 는 자바에서 문자열 취급함.
	}
}
