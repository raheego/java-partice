package day18.jdbc.gift.quiz.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day18.jdbc.gift.mvc.connectionutil.CloseHelper;

public class DeptController {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	// close
	public static void close() {
		try {
			CloseHelper.close(rs);
			CloseHelper.close(stmt);
			CloseHelper.close(pstmt);
			CloseHelper.close(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void delete(String className) throws SQLException {
		System.out.println("삭제할 deptno를 말씀주세요");
		int deptno = sc.nextInt();
		
	}
}
