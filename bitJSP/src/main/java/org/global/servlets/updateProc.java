package org.global.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateProc
 */
@WebServlet("/member/updateProc")
public class updateProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateProc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/scottdb?useSSL=false";
		String dbId = "scott";
		String dbPwd = "tiger";
		Connection conn = null;
		String sql = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbId, dbPwd);
			
			// 수정을 위해 입력한 데이터
			request.setCharacterEncoding("utf-8");
			String userId = request.getParameter("userId"); 
			String userPwd = request.getParameter("userPwd");
			String userName = request.getParameter("userName");
			String phoneNo = request.getParameter("phoneNo");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			
			// 데이터 업데이트
			sql = "update members set userpwd = ?, username = ?, phoneno = ?, address = ?, email =? where userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userPwd);
			pstmt.setString(2, userName);
			pstmt.setString(3, phoneNo);
			pstmt.setString(4, address);
			pstmt.setString(5, email);
			pstmt.setString(6, userId);
			int i = pstmt.executeUpdate(); 
			
			if (i > 0) {
				response.sendRedirect("updateResult.jsp");
			} else {
				response.sendRedirect("updateFrm.jsp");
			}
			
			
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
