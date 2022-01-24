package jdbc1118;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

class Members {
	private int userID;
	private String userName, email, phoneNo;
	private String userPwd, regDate;
	
	public Members(String userPwd, String userName, String email, String phoneNo) {
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	public Members(int userID, String userPwd, String userName, String email, String phoneNo, String regDate) {
		this(userPwd, userName, email, phoneNo);
		this.userID = userID;
		this.regDate = regDate;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getRegDate() {
		return regDate;
	}
	
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return "Members [userID=" + userID + ", userName=" + userName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", userPwd=" + userPwd + ", regDate=" + regDate + "]";
	}	
}


public class MembersEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sql = "";
		PreparedStatement ps;
		ResultSet rs;
		int id, pw;
		ArrayList<Members> ml = new ArrayList<Members>();
		
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottdb?useSSL=false", "scott", "tiger"); // ����
			
			BREAK:
			while (true) {
				System.out.println("==============================================");
				System.out.println("1.�߰� 2.��ȸ 3.���� 4.���� 5.��κ��� 6.����");
				System.out.println("==============================================");
				
				System.out.print("�޴��� �����Ͻÿ� >> ");
				int menu = scan.nextInt();
				
				
				switch(menu) {
				
				case 1: // �߰�
					System.out.println("��й�ȣ, �̸�, �̸���, ��ȭ��ȣ ������ �Է��Ͻÿ�.");
					sql = "insert into members(userPwd, userName, email, phoneNo) values(?, ?, ?, ?)";
					ps = conn.prepareStatement(sql);
					
					ps.setString(1, scan.next());
					ps.setString(2, scan.next());
					ps.setString(3, scan.next());
					ps.setString(4, scan.next());
					
					ps.executeUpdate();
					
					break;
				case 2: // ��ȸ
					
					// �ϴ� db �޾ƿ���
					sql = "select * from members";
					ps = conn.prepareStatement(sql);
					
					rs = ps.executeQuery();
					
					// ����Ʈ�� add
					ml.clear();
					while (rs.next()) {
						ml.add(new Members(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
					}
					
					System.out.print("�˻��� ȸ���� �̸��� �Է��Ͻÿ� >> ");
					String name = scan.next();
					
					sql = "select * from members where userName = ?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, name);
					rs = ps.executeQuery();
					
					// ����Ʈ���� ȸ�� ã��
					for (Members m : ml) {
						if (m.getUserName().equals(name)) {
							System.out.println(m);
						}
					}
					
					// ������ ���ٰ� ���
					if (rs.next() == false) {
						System.out.println("�������� �ʴ� ȸ���Դϴ�.");						
					}
					rs.close();
					break;
				case 3: // ����
					System.out.print("������ ȸ�� ���̵�� ��й�ȣ�� �Է��Ͻÿ� >> ");
					id = scan.nextInt();
					pw = scan.nextInt();
					
					sql = "select userID, userPwd from members where userID = ? and userPwd = ?";
					ps = conn.prepareStatement(sql);
					ps.setInt(1, id);
					ps.setInt(2, pw);
					
					rs = ps.executeQuery();
					
					if (rs.next()) {
						//rs.next();
//						System.out.printf("%s %s\n", rs.getString(1), rs.getString(2));
						System.out.println("��й�ȣ, �̸�, �̸���, ��ȭ��ȣ ������ �Է��Ͻÿ�.");
						sql = "update members set userPwd = ?, userName = ?, email = ?, phoneNo = ? where userID = ? and userPwd = ?";
						ps = conn.prepareStatement(sql);
						
						ps.setString(1, scan.next());
						ps.setString(2, scan.next());
						ps.setString(3, scan.next());
						ps.setString(4, scan.next());
						ps.setInt(5, id);
						ps.setInt(6, pw);
						
						ps.executeUpdate();
						
						System.out.println("ȸ�� ������ �����߽��ϴ�.");
					} else {
						System.out.println("�������� �ʴ� ȸ���Դϴ�.");
					}
					
					rs.close();
					break;
				case 4: // ����
					System.out.print("������ ȸ�� ���̵�� ��й�ȣ�� �Է��Ͻÿ� >> ");
					id = scan.nextInt();
					pw = scan.nextInt();
					
					// ȸ�� �ִ��� ��ȸ
					sql = "select userID, userPwd from members where userID = ? and userPwd = ?";
					ps = conn.prepareStatement(sql);
					ps.setInt(1, id);
					ps.setInt(2, pw);
					
					rs = ps.executeQuery();
					
					if (rs.next()) {
						sql = "delete from members where userID = ? and userPwd = ?";
						ps = conn.prepareStatement(sql);
						ps.setInt(1, id);
						ps.setInt(2, pw);
						
						ps.executeUpdate();
						
						System.out.println("ȸ���� �����߽��ϴ�.");
					} else {
						System.out.println("�������� �ʴ� ȸ���Դϴ�.");
					}
					
					rs.close();
					break;
				case 5: // ��� ����
					// ������ ���� �޾ƿ�
					sql = "select * from members";
					ps = conn.prepareStatement(sql);
					
					rs = ps.executeQuery();
					
					ml.clear();
					while (rs.next()) {
						ml.add(new Members(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
					}
					
					// ���
					if (ml.size() != 0) {
						for (Members m : ml) {
							System.out.println(m);
						}
					} else {
						System.out.println("ȸ���� �����ϴ�.");
					}
					
					rs.close();
					break;
				case 6: // ����
					break BREAK;
				}
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
