package sub4;
/*
 * 날짜 : 2022-09-15
 * 이름 : 전인준
 * 내용 : JDBC PrepatrdStatement 실습
 * 
 * 
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedTest {
	public static void main(String[] args) {
		// DB정보 
				String host = "jdbc:mysql://127.0.0.1:3306/java2db";
				String user = "root";
				String pass = "1234";
		try {
			// 1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 3단계
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			psmt.setString(2, "김유신");
			psmt.setString(3, "010-1022-1011");
			psmt.setInt(4, 27);
			
			// 4단계
			psmt.executeUpdate();
			
			// 5단계
			
			// 6단계
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Insert 완료...");
	}
}
