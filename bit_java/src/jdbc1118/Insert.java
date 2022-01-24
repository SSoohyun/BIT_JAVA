package jdbc1118;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottdb?useSSL=false", "scott", "tiger"); // ����
			
			Scanner scan = new Scanner(System.in);
			String exec = "y";
			
			while (exec.equals("y")) {
				System.out.println("���, �̸�, ���� ������ �Է��Ͻÿ�");
				String sql = "insert into emp1 values(?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, scan.nextInt());
				pstmt.setString(2, scan.next());
				pstmt.setInt(3, scan.nextInt());
				
				if (pstmt.executeUpdate() == 1) {
					System.out.println("������ �߰��Ǿ����ϴ�.");					
				} else {
					System.out.println("�߰��� �� �����ϴ�.");
				}
				
				System.out.println("�Է��� ����Ͻðڽ��ϱ�? (y/n)");
				exec = scan.next();
			}
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
