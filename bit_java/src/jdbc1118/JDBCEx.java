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
//		Scanner scan = new Scanner(System.in); // 키보드 입력을 위해
//		System.out.println("도서 번호와 책 이름을 입력하세요 >> ");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 로딩
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottdb?useSSL=false", "scott", "tiger"); // 연결
//			System.out.println("DB 연결 성공");
			
			
//			Statement stmt = conn.createStatement(); // Statement 객체 반환
			
//			ResultSet rs= stmt.executeQuery("SELECT * FROM BOOK"); // 그 결과를 ResultSet으로 반환
//			ResultSet rs= stmt.executeQuery("SELECT BOOKID FROM BOOK"); // 특정 열만 검색
//			ResultSet rs= stmt.executeQuery("SELECT BOOKNAME, BOOKID FROM BOOK WHERE BOOKID = 1"); // 조건 검색
//			ResultSet rs= stmt.executeQuery("SELECT * FROM BOOK WHERE BOOKNAME = '야구의 추억'"); // 조건 검색
			
			// 레코드 추가
//			stmt.executeUpdate("insert into Book values(79, '하드보일드원더랜드', '하루끼', 14000)");
//			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK"); // 확인
			
			// 데이터 수정
//			stmt.executeUpdate("update book set bookname = 'cccc' where bookid = 79");
//			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK"); // 확인
			
			// 데이터 삭제
//			stmt.executeUpdate("delete from book where bookname = 'cccc'");
//			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK"); // 확인
			
			// 키보드 입력받아 변경
//			String sql = String.format("insert into book (bookid, bookname) values (%d, '%s')", scan.nextInt(), scan.next());
//			stmt.executeUpdate(sql);
//			sql = "SELECT * FROM BOOK";
//			ResultSet rs = stmt.executeQuery(sql); // 확인
			
			// 실행 시 필요한 인자들을 동적으로 설정
//			PreparedStatement pstmt = conn.prepareStatement("select * from Book"); // stmt와 다르게 여기에 쿼리 들어감
//			ResultSet rs = pstmt.executeQuery(); // 여기는 빈 괄호
			
//			String sql = "select * from book where bookid in (?, ?)";
//			PreparedStatement pstmt = conn.prepareStatement(sql); // 쿼리 준비
//			pstmt.setInt(1, 2); // 첫 번째 인자: 2
//			pstmt.setInt(2, 4); // 두 번째 인자: 4
//			ResultSet rs = pstmt.executeQuery(); // 쿼리 실행
			
//			String sql = "select * from book where bookname = ?";
//			PreparedStatement pstmt = conn.prepareStatement(sql); // 쿼리 준비
//			pstmt.setString(1, "야구의 추억");
//			ResultSet rs = pstmt.executeQuery(); // 쿼리 실행
			
			
			
			String sql = "insert into book values(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql); // 쿼리 준비
			pstmt.setInt(1, 33);
			pstmt.setString(2, "행복한 왕자");
			pstmt.setString(3, "와일드출판사");
			pstmt.setInt(4, 12000);
			pstmt.executeUpdate(); // 쿼리 실행
			
			sql = "select * from book where bookid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 33);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) { // 가져올 데이터가 있으면
				// 컬럼 이름으로 출력
//				System.out.println(rs.getString("bookid")); // 원래는 int형이지만 String으로 받아왔기 때문에 여기서는 String
//				System.out.println(rs.getString("bookname"));
//				System.out.println(rs.getString("publisher"));
//				System.out.println(rs.getString("price"));
				
				// 인덱스로 출력
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // 전체 검색
//				System.out.printf("%s\n", rs.getString(1)); // 특정 열 검색
//				System.out.printf("%s %s\n", rs.getString(1), rs.getString(2)); // 조건 검색
//				System.out.printf("%s %s\n", rs.getString(1), rs.getString(2)); // 조건 검색
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // 야구의 추억 검색
			
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // 업데이트 확인
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // 데이터 수정
//				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // 데이터 삭제
				
				
				System.out.printf("%s %s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)); // 데이터 확인
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
		}
		
	}

}
