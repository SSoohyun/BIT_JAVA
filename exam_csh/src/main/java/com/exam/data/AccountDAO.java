package com.exam.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class AccountDAO {
	private static AccountDAO dao = new AccountDAO();

	private AccountDAO() {
	}

	public static AccountDAO getInstance() {
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

	public void close(Connection conn, PreparedStatement pstmt) {
		try {
			conn.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 계좌 개설
	public int openAccount(Account ac) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		int i = 0;

		try {
			String sql = "insert into account values(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ac.getAccountId());
			pstmt.setString(2, ac.getAccountPwd());
			pstmt.setString(3, ac.getUserName());
			pstmt.setInt(4, ac.getBalance());
			i = pstmt.executeUpdate();

			close(conn, pstmt);
		} catch (SQLException e) {
			
		}
		return i;
	}

	// 계좌 조회
	public Account selectAccount(String accountId, String accountPwd) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		Account ac = null;

		try {
			String sql = "select * from account where accountId = ? and accountPwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountId);
			pstmt.setString(2, accountPwd);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				ac = new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			}

			close(conn, pstmt, rs);
		} catch (SQLException e) {

		}
		return ac;
	}

	// 은행 업무
	public int accountJob(String accountId, String accountPwd, int amount, String item, String receiver) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int i = 0;
		String pwd = null;
		int balance = 0;
		
		String msg = null;
		
		try {
			String sql = "select accountPwd, balance from account where accountId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, accountId);
			rs = pstmt.executeQuery();
			
			if (rs.next() != false) {
				pwd = rs.getString(1);
				balance = rs.getInt(2);
			}
			
			
			if (item.equals("deposit")) {
				balance += amount;
				
				sql = "update account set balance = ? where accountId = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, accountId);
				pstmt.executeUpdate();
				
			} else if (item.equals("withdraw")) {
				if (accountPwd.equals(pwd)) {
					if (balance >= amount) {
						balance -= amount;
						sql = "update account set balance = ? where accountId = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, balance);
						pstmt.setString(2, accountId);
						pstmt.executeUpdate();
						
						msg = "정상적으로 출금됨";
					} else {
						msg ="잔액이 부족해서 출금 불가";
					}
				} else {
					msg = "비밀번호가 틀렸음";
				}
				
					
			} else if (item.equals("send")) {
				if (accountPwd.equals(pwd)) {
					if (balance >= amount) {
						balance -= amount;
						sql = "update account set balance = ? where accountId = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, balance);
						pstmt.setString(2, accountId);
						pstmt.executeUpdate();
						
						sql = "select balance from account where accountId = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, receiver);
						rs = pstmt.executeQuery();
						rs.next();
						
						if (rs.next() != false) {
							balance = rs.getInt(1);
						}
						
						sql = "update account set balance = ? where accountId = ?";
						pstmt = conn.prepareStatement(sql);
						pstmt.setInt(1, balance);
						pstmt.setString(2, receiver);
						pstmt.executeUpdate();
						
						msg = "정상적으로 송금됨";
					} else {
						msg ="잔액이 부족해서 송금 불가";
					}
				} else {
					msg = "비밀번호가 틀렸음";
				}
			}
			
			close(conn, pstmt, rs);
		} catch (SQLException e) {

		}
		return i;
	}

	// 모든 계좌 보기
	public ArrayList<Account> selectAccountAll() {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ArrayList<Account> ac = new ArrayList<Account>();

		try {
			String sql = "select * from account";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				ac.add(new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}

			close(conn, pstmt, rs);
		} catch (SQLException e) {
			
		}
		return ac;
	}
}
