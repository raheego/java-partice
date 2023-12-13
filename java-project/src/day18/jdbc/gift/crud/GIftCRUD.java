package day18.jdbc.gift.crud;

import java.sql.*;
import java.util.Scanner;

public class GIftCRUD {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		while (true) {
			System.out.println("선택헤주세요");
			menu();
			
			switch (sc.nextInt()) {
			case 1:
				selectAll(); break;
			case 2:
				 SelectByGno(sc.nextInt()); 
				break;
			case 3:
				update(); break;
			case 4: 
				delete(); break;
			case 5: 
				
				break;
			default:
				break;
			}
		}
	}
	

	
	// 연결 메소드
	public static Connection Connection() throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
		
		return conn;
	}

	
	// SelectAll()
	public static void selectAll() throws SQLException, ClassNotFoundException {
		Statement stmt = Connection().createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");

		while (rs.next()) {
			int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_s = rs.getInt("g_start");
			int g_e = rs.getInt("g_end");
			int count = rs.getInt("count");

			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e + "\t" + count);
		}
	}

	//SelectByGno
	public static void SelectByGno(int gno) throws SQLException, ClassNotFoundException {
		Statement stmt = Connection().createStatement();
		ResultSet  rs = stmt.executeQuery("SELECT * FROM GIFT WHERE gno = " + gno);

		System.out.printf("%10s%10s%10s%10s\n", "상품번호", "상품명", "최저가", "최고가","카운트");
		while (rs.next()) {
			String gname = rs.getString(2);
			int g_start = rs.getInt(3);
			int g_end = rs.getInt("g_end");
			int count = rs.getInt(0);
			System.out.printf("%10d%10s%10d%10d\n", gno, gname, g_start, g_end, count);
		}

		rs.close();
		stmt.close();
	}
	
	
	// update
	public static void update() throws ClassNotFoundException, SQLException {
		// 연결 메소드
		Connection conn = Connection();
		
		System.out.println("Gift Table change : gname,g_start,g_end , count update number : gno = ");
		String sql = "UPDATE gift SET gname = ?, g_start = ?, g_end = ?, count =? WHERE gno = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		pstmt.setInt(5, sc.nextInt());

		int result = pstmt.executeUpdate();
		System.out.println(result + " 개 데이터 업데이트 성공함");

		conn.commit();
	}
	
	//delete
	public static void delete() throws SQLException, ClassNotFoundException {
		Connection conn = Connection();
				
		System.out.println("삭제할 gno = ? ");
		String sql = "DELETE FROM GIFT WHERE GNO = ?"; // 쿼리문임, '?' 안으로 들어감
		 
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt()); 
		
        int result = pstmt.executeUpdate(); 
        System.out.println(result + " 개 데이터 삭제 성공함");

        conn.commit(); 
        
        pstmt.close();
        conn.close();
	}

	public static void menu() {
		System.out.println("메뉴를 골라주세요");
		System.out.println("1. select all");
		System.out.println("2. select by gno");
		System.out.println("3. update ");
		System.out.println("4. delete ");
		System.out.println("5. insert ");
		System.out.println("6. exit ");
	}
}
