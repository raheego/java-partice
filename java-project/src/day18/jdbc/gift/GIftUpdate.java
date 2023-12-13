package day18.jdbc.gift;

import java.sql.*;
import java.util.Scanner;

public class GIftUpdate { 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Scanner sc = new Scanner(System.in);
        Class.forName("org.mariadb.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore","root","maria");
        System.out.println("Gift Table change : gname,g_start,g_end , count update number : gno = ");
//        System.out.println("Gift Table Update number : gno = ");
        String sql = "UPDATE gift SET gname = ?, g_start = ?, g_end = ?, count =? WHERE gno = ?";
        
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,sc.next());
        pstmt.setInt(2,sc.nextInt());
        pstmt.setInt(3,sc.nextInt());
        pstmt.setInt(4,sc.nextInt());
        pstmt.setInt(5,sc.nextInt());
        
        int result = pstmt.executeUpdate();
        System.out.println(result + " 개 데이터 업데이트 성공함");
        conn.commit();

        pstmt.close();
        conn.close();
        
        //SQL Query 구문, HTML Tag 는 자바에서 문자열 취급함.
	}
}
