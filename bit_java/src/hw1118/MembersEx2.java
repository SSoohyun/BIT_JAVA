package hw1118;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MembersEx2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/scottdb?useSSL=false";
		String dbId = "scott";
		String dbPwd = "tiger";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int userId = 0;
		String userPwd = null;

		Members mem = null;
		ArrayList<Members> al = null;

		
		conn = getConnectivity(url, dbId, dbPwd); // ����

		Scanner scan = new Scanner(System.in);
		
		BREAK:
		while (true) {
			System.out.println("==============================================");
			System.out.println("1.�߰� 2.��ȸ 3.���� 4.���� 5.��κ��� 6.����");
			System.out.println("==============================================");

			System.out.print("�޴��� �����Ͻÿ� >> ");
			int menu = scan.nextInt();

			switch (menu) {

			case 1: // �߰�
				System.out.println("��й�ȣ, �̸�, �̸���, ��ȭ��ȣ ������ �Է��Ͻÿ�.");
				insertMember(conn, pstmt, new Members(scan.next(), scan.next(), scan.next(), scan.next()));
				
				break;
			case 2: // ��ȸ
				System.out.print("�˻��� ȸ���� �̸��� �Է��Ͻÿ� >> ");
				
				al = getMembers(conn, pstmt, rs, scan.next());			
				showAll(al);
				
				break;
			case 3: // ����
				System.out.print("������ ȸ�� ���̵�� ��й�ȣ�� �Է��Ͻÿ� >> ");
				
				if (isMember(conn, pstmt, rs, userId = scan.nextInt(), userPwd = scan.next())) {
					System.out.println("��й�ȣ, �̸�, �̸���, ��ȭ��ȣ ������ �Է��Ͻÿ�.");
					updateMembers(conn, pstmt, new Members(userId, scan.next(), scan.next(), scan.next(), scan.next(), null));
				} else {
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				
				break;
			case 4: // ����
				System.out.print("������ ȸ�� ���̵�� ��й�ȣ�� �Է��Ͻÿ� >> ");
				
				if (isMember(conn, pstmt, rs, userId = scan.nextInt(), userPwd = scan.next())) {
					deleteMembers(conn, pstmt, userId);
				} else {
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				
				break;
			case 5: // ��� ����
				al = getMemberListAll(conn, pstmt, rs);
				showAll(al);
				
				break;
			case 6: // ����
				break BREAK;
			}
			
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				
			} catch (NullPointerException e) {
				
			}
		}
	}

	// db�� ����Ǵ� Connection ��ü ��ȯ
	public static Connection getConnectivity(String url, String dbId, String dbPwd) {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbId, dbPwd);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}

	// �Էµ� ������ ���� ȸ���� �����ϴ��� Ȯ���Ͽ� ������ true, �ƴϸ� false ��ȯ
	public static boolean isMember(Connection conn, PreparedStatement pstmt, ResultSet rs, int userId, String userPwd) {
		try {
			String sql = "select * from members where userID = ? and userPwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setString(2, userPwd);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				return true;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	// Members ��ü ����Ʈ�� �������� ��� ���
	public static void showAll(ArrayList<Members> al) {
		if (al.size() == 0) {
			System.out.println("����� ȸ�� ������ �����ϴ�.");
		}
		
		for (Members m : al) {
			System.out.println(m);
		}
	}
	
	// �̸� �˻� �� �ش� �̸��� ���� Members ��ü ����Ʈ ��ȯ
	public static ArrayList<Members> getMembers(Connection conn, PreparedStatement pstmt, ResultSet rs, String userName) {
		ArrayList<Members> memal = new ArrayList<Members>();
		
		try {
			String sql = "select * from members where userName = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userName);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				memal.add(new Members(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memal;
	}

	// ��� ��ü ������ ���̺� ����
	public static int insertMember(Connection conn, PreparedStatement pstmt, Members mem) {
		int num = 0;
		
		try {
			String sql = "insert into members(userPwd, userName, email, phoneNo) values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mem.getUserPwd());
			pstmt.setString(2, mem.getUserName());
			pstmt.setString(3, mem.getEmail());
			pstmt.setString(4, mem.getPhoneNo());
			
			num = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (num > 0) {
			System.out.println(num + "���� ȸ�� ������ �����߽��ϴ�.");
		}
		
		return num;
	}
	
	// ȸ�� ���θ� �Ǵ��� �� ȸ���� ��� �ش��ϴ� Ʃ�� ����
	public static int updateMembers(Connection conn, PreparedStatement pstmt, Members mem) {
		int num = 0;
		
		try {
			String sql = "update members set userPwd = ?, userName = ?, email = ?, phoneNo =? where userId = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mem.getUserPwd());
			pstmt.setString(2, mem.getUserName());
			pstmt.setString(3, mem.getEmail());
			pstmt.setString(4, mem.getPhoneNo());
			pstmt.setInt(5, mem.getUserID());
			
			num = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (num > 0) {
			System.out.println(num + "���� ȸ�� ������ �����߽��ϴ�.");
		}
		
		return num;
	}
	
	// ȸ���� ������ �ش��ϴ� Ʃ�� ����
	public static int deleteMembers(Connection conn, PreparedStatement pstmt, int userId) {
		int num = 0;
		
		try {
			String sql = "delete from members where userID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, userId);
			
			num = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (num > 0) {
			System.out.println(num + "���� ȸ�� ������ �����߽��ϴ�.");
		}
		
		return num;
	}
	
	// ���̺� ����� �������� ����Ʈ ��ü�� ���� �� ��ȯ
	public static ArrayList<Members> getMemberListAll(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		ArrayList<Members> memal = new ArrayList<Members>();
		
		try {
			String sql = "select * from members";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				memal.add(new Members(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return memal;
	}
}
