package org.global.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class MemberDAO {
	// singleton
	private static MemberDAO dao = new MemberDAO();
	private MemberDAO() {}
	public static MemberDAO getInstance() {
		return dao;
	}
	
	public Connection getConnection() {
		InitialContext ic = null;
		DataSource ds = null;
		Connection conn = null;
		
		try {
			ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
			conn = ds.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(Connection conn, PreparedStatement pstmt){
		try {
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<MemberDTO> selectMemberAll(){
		ArrayList<MemberDTO> mt = new ArrayList<MemberDTO>();
		String sql = "select * from members";
		Connection conn = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				MemberDTO dto = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
				mt.add(dto);
			}
			
			close(conn, pstmt, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mt;
	}
	
	public MemberDTO selectMember(String userId) {
		Connection conn = null;
		String sql = "select * from members where userid = ?";
		MemberDTO mt = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next() != false) {
				mt = new MemberDTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
			
			close(conn, pstmt);
		} catch (SQLException e) {
			
		}
		
		return mt;
	}
	public int insertMember(MemberDTO dto) {
		int i = 0;
		if (selectMember(dto.getUserId()) == null) { // 회원이 아님
			String sql = "insert into members values(?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement pstmt = getConnection().prepareStatement(sql);
				pstmt.setString(1, dto.getUserId());
				pstmt.setString(2, dto.getUserPwd());
				pstmt.setString(3, dto.getUserName());
				pstmt.setString(4, dto.getPhoneNo());
				pstmt.setString(5, dto.getAddress());
				pstmt.setString(6, dto.getEmail());
				i = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				
			}
		} else {
			i = 0;
		}
		
		return i;
	}
	public int updateMember(MemberDTO dto) {
		String sql = "update members set userpwd = ?, username = ?, phoneno = ?, address = ?, email =? where userid = ?";
		int i = 0;
		try {
			PreparedStatement pstmt = getConnection().prepareStatement(sql);
			pstmt.setString(1, dto.getUserPwd());
			pstmt.setString(2, dto.getUserName());
			pstmt.setString(3, dto.getPhoneNo());
			pstmt.setString(4, dto.getAddress());
			pstmt.setString(5, dto.getEmail());
			pstmt.setString(6, dto.getUserId());
			i = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			
		}
		
		return i;
	}
	public int deleteMember(String userId) {
		int i = 0;
		if (selectMember(userId) != null) {
			String sql = "delete from members where userid = ?";
			try {
				PreparedStatement pstmt = getConnection().prepareStatement(sql);
				pstmt.setString(1, userId);
				i = pstmt.executeUpdate();
				
			} catch (SQLException e) {
				
			}
		} else {
			i = 0;
		}
		
		return i;
	}
}
