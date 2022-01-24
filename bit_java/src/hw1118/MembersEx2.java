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

		
		conn = getConnectivity(url, dbId, dbPwd); // 연결

		Scanner scan = new Scanner(System.in);
		
		BREAK:
		while (true) {
			System.out.println("==============================================");
			System.out.println("1.추가 2.조회 3.수정 4.삭제 5.모두보기 6.종료");
			System.out.println("==============================================");

			System.out.print("메뉴를 선택하시오 >> ");
			int menu = scan.nextInt();

			switch (menu) {

			case 1: // 추가
				System.out.println("비밀번호, 이름, 이메일, 전화번호 순으로 입력하시오.");
				insertMember(conn, pstmt, new Members(scan.next(), scan.next(), scan.next(), scan.next()));
				
				break;
			case 2: // 조회
				System.out.print("검색할 회원의 이름을 입력하시오 >> ");
				
				al = getMembers(conn, pstmt, rs, scan.next());			
				showAll(al);
				
				break;
			case 3: // 수정
				System.out.print("수정할 회원 아이디와 비밀번호를 입력하시오 >> ");
				
				if (isMember(conn, pstmt, rs, userId = scan.nextInt(), userPwd = scan.next())) {
					System.out.println("비밀번호, 이름, 이메일, 전화번호 순으로 입력하시오.");
					updateMembers(conn, pstmt, new Members(userId, scan.next(), scan.next(), scan.next(), scan.next(), null));
				} else {
					System.out.println("존재하지 않는 회원입니다.");
				}
				
				break;
			case 4: // 삭제
				System.out.print("삭제할 회원 아이디와 비밀번호를 입력하시오 >> ");
				
				if (isMember(conn, pstmt, rs, userId = scan.nextInt(), userPwd = scan.next())) {
					deleteMembers(conn, pstmt, userId);
				} else {
					System.out.println("존재하지 않는 회원입니다.");
				}
				
				break;
			case 5: // 모두 보기
				al = getMemberListAll(conn, pstmt, rs);
				showAll(al);
				
				break;
			case 6: // 종료
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

	// db와 연결되는 Connection 객체 반환
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

	// 입력된 정보를 가진 회원이 존재하는지 확인하여 있으면 true, 아니면 false 반환
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

	// Members 객체 리스트의 정보들을 모두 출력
	public static void showAll(ArrayList<Members> al) {
		if (al.size() == 0) {
			System.out.println("출력할 회원 정보가 없습니다.");
		}
		
		for (Members m : al) {
			System.out.println(m);
		}
	}
	
	// 이름 검색 후 해당 이름을 가진 Members 객체 리스트 반환
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

	// 멤버 객체 정보를 테이블에 저장
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
			System.out.println(num + "개의 회원 정보를 저장했습니다.");
		}
		
		return num;
	}
	
	// 회원 여부를 판단한 후 회원인 경우 해당하는 튜플 수정
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
			System.out.println(num + "개의 회원 정보를 수정했습니다.");
		}
		
		return num;
	}
	
	// 회원인 정보에 해당하는 튜플 삭제
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
			System.out.println(num + "개의 회원 정보를 삭제했습니다.");
		}
		
		return num;
	}
	
	// 테이블에 저장된 정보들을 리스트 객체에 저장 후 반환
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
