package jdbc1118;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCEx {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in); // Ű���� �Է��� ����
//		System.out.println("���� ��ȣ�� å �̸��� �Է��ϼ��� >> ");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // ����̹� �ε�
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottdb?useSSL=false", "scott", "tiger"); // ����
//			System.out.println("DB ���� ����");
			
			
//			Statement stmt = conn.createStatement(); // Statement ��ü ��ȯ
			
//			ResultSet rs= stmt.executeQuery("SELECT * FROM BOOK"); // �� ����� ResultSet���� ��ȯ
//			ResultSet rs= stmt.executeQuery("SELECT BOOKID FROM BOOK"); // Ư�� ���� �˻�
//			ResultSet rs= stmt.executeQuery("SELECT BOOKNAME, BOOKID FROM BOOK WHERE BOOKID = 1"); // ���� �˻�
//			ResultSet rs= stmt.executeQuery("SELECT * FROM BOOK WHERE BOOKNAME = '�߱��� �߾�'"); // ���� �˻�
			
			// ���ڵ� �߰�
//			stmt.executeUpdate("insert into Book values(79, '�ϵ庸�ϵ��������', '�Ϸ糢', 14000)");
//			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK"); // Ȯ��
			
			// ������ ����
//			stmt.executeUpdate("update book set bookname = 'cccc' where bookid = 79");
//			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK"); // Ȯ��
			
			// ������ ����
//			stmt.executeUpdate("delete from book where bookname = 'cccc'");
//			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK"); // Ȯ��
			
			// Ű���� �Է¹޾� ����
//			String sql = String.format("insert into book (bookid, bookname) values (%d, '%s')", scan.nextInt(), scan.next());
//			stmt.executeUpdate(sql);
//			sql = "SELECT * FROM BOOK";
//			ResultSet rs = stmt.executeQuery(sql); // Ȯ��
			
			// ���� �� �ʿ��� ���ڵ��� �������� ����
//			PreparedStatement pstmt = conn.prepareStatement("select * from Book"); // stmt�� �ٸ��� ���⿡ ���� ��
//			ResultSet rs = pstmt.executeQuery(); // ����� �� ��ȣ
			
//			String sql = "select * from book where bookid in (?, ?)";
//			PreparedStatement pstmt = conn.prepareStatement(sql); // ���� �غ�
//			pstmt.setInt(1, 2); // ù ��° ����: 2
//			pstmt.setInt(2, 4); // �� ��° ����: 4
//			ResultSet rs = pstmt.executeQuery(); // ���� ����
			
//			String sql = "select * from book where bookname = ?";
//			PreparedStatement pstmt = conn.prepareStatement(sql); // ���� �غ�
//			pstmt.setString(1, "�߱��� �߾�");
//			ResultSet rs = pstmt.executeQuery(); // ���� ����
			
			
			
			String sql = "insert into book values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql); // ���� �غ�
			pstmt.setInt(1, 33);
			pstmt.setString(2, "�ູ�� ����");
			pstmt.setString(3, "���ϵ����ǻ�");
			pstmt.setInt(4, 12000);
			pstmt.executeUpdate(); // ���� ����
			
			sql = "select * from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 33);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) { // ������ �����Ͱ� ������
				// �÷� �̸����� ���
//				System.out.println(rs.getString("bookid")); // ������ int�������� String���� �޾ƿԱ� ������ ���⼭�� String
//				System.out.println(rs.getString("bookname"));
//				System.out.println(rs.getString("publisher"));
//				System.out.println(rs.getString("price"));
				
				// �ε����� ���
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // ��ü �˻�
//				System.out.printf("%s\n", rs.getString(1)); // Ư�� �� �˻�
//				System.out.printf("%s %s\n", rs.getString(1), rs.getString(2)); // ���� �˻�
//				System.out.printf("%s %s\n", rs.getString(1), rs.getString(2)); // ���� �˻�
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // �߱��� �߾� �˻�
			
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // ������Ʈ Ȯ��
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // ������ ����
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // ������ ����
				
				
				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // ������ Ȯ��
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
		}
		
	}

}
