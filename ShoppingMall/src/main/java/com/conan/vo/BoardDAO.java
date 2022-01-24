package com.conan.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	private static BoardDAO dao = new BoardDAO();
	private BoardDAO() {}
	public static BoardDAO getInstance() {
		return dao;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			conn.close();
			pstmt.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection conn, PreparedStatement pstmt){
		try {
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<BoardVO> selectBoardAll() {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ArrayList<BoardVO> vo = new ArrayList<BoardVO>();
		
		try {
			String sql = "select * from board";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				vo.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							       rs.getString(5), rs.getInt(6)));
			}
					
			close(conn, pstmt, rs);
		} catch (SQLException e) {
			
		}
		return vo;
	}
	
	public BoardVO selectBoard(Integer boardNo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		BoardVO vo = null;
		
		try {
			String sql = "select * from board where boardno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				vo = new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							     rs.getString(5), rs.getInt(6));
			}
					
			close(conn, pstmt, rs);
		} catch (SQLException e) {
			
		}
		return vo;
	}
	
	public int insertBoard(BoardVO vo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int i = 0;
		
		try {
			String sql = "insert into board(userId, title, content) values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserId());
			pstmt.setString(2, vo.getTitle());
			pstmt.setString(3, vo.getContent());
			i = pstmt.executeUpdate();
			
			close(conn, pstmt);
		} catch (SQLException e) {
			
		}
		return i;
	}
	
	public int updateBoard(BoardVO vo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int i = 0;
		
		try {
			String sql = "update board set title = ?, content = ? where boardno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getBoardNo());
			i = pstmt.executeUpdate();
			
			close(conn, pstmt);
		} catch (SQLException e) {
			
		}
		return i;
	}
	
	public int deleteBoard(Integer boardNo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int i = 0;
		
		try {
			String sql = "delete from board where boardno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			i = pstmt.executeUpdate();
			
			close(conn, pstmt);
		} catch (SQLException e) {
			
		}
		return i;
	}
	
	public int getListCount() { // 게시글 개수 반환
		Connection conn = getConnection();
		int cnt = 0;
		
		try {
			String sql = "select count(*) from board";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next() != false) {
				cnt = rs.getInt(1); // 게시글 개수 받아옴
			}
			
			close(conn, pstmt, rs);
		} catch (SQLException e) {
			
		}
		return cnt;
	}
	
	public int increaseHit(Integer boardNo) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0; // 조회수
		int i = 0;
		
		try {
			String sql = "select hit from board where boardno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next() != false) {
				cnt = rs.getInt(1); // 조회수 DB에서 받아옴
			}
			
			cnt += 1; // 조회수 증가
			
			sql = "update board set hit = ? where boardno =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, cnt);
			pstmt.setInt(2, boardNo);
			i = pstmt.executeUpdate();
			
			close(conn, pstmt, rs);
		} catch (SQLException e) {
			
		}
		return i;
	}
	
	public ArrayList<BoardVO> matchText(String subject, String text) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ArrayList<BoardVO> vo = new ArrayList<BoardVO>();
		
		try {
			String sql = "";
			if (subject.equals("title")) {
				sql = "select * from board where title like ?";
			} else if (subject.equals("content")) {
				sql = "select * from board where content like ?";
			} else if (subject.equals("userId")) {
				sql = "select * from board where userId like ?";
			}
			
			pstmt = conn.prepareStatement(sql);
			String str = '%' + text + '%';
			pstmt.setString(1, str);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				vo.add(new BoardVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
							     rs.getString(5), rs.getInt(6)));
			}
		
			close(conn, pstmt, rs);
		} catch (SQLException e) {
			
		}
		return vo;
	}
	
	public int getMatchCount(String subject, String text) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int cnt = 0;
		
		try {
			String sql = "";
			if (subject.equals("title")) {
				sql = "select count(*) from board where title like ?";
			} else if (subject.equals("content")) {
				sql = "select count(*) from board where content like ?";
			} else if (subject.equals("userId")) {
				sql = "select count(*) from board where userId like ?";
			}
			
			pstmt = conn.prepareStatement(sql);
			String str = '%' + text + '%';
			pstmt.setString(1, str);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				cnt = rs.getInt(1);
			}
		
			close(conn, pstmt, rs);
		} catch (SQLException e) {
			
		}
		return cnt;
	}
	
}
