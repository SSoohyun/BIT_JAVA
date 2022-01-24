package jdbc1118;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottdb?useSSL=false", "scott", "tiger"); // ¿¬°á
			
			String sql = "create table emp1 (empno int primary key, ename varchar(10), salary int)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
