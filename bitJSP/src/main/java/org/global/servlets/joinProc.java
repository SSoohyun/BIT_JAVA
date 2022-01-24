package org.global.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class joinProc
 */
@WebServlet("/member/joinProc.do")
public class joinProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public joinProc() {
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
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId"); 
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String phoneNo = request.getParameter("phoneNo");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		String url = "jdbc:mysql://localhost:3306/scottdb?useSSL=false";
		String dbId = "scott";
		String dbPwd = "tiger";
		Connection conn = null;
		String sql = null;
		PreparedStatement pstmt = null;
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbId, dbPwd);
			
			// 데이터 저장
			sql = "insert into members(userid, userpwd, username, phoneno, address, email) values(?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			pstmt.setString(3, userName);
			pstmt.setString(4, phoneNo);
			pstmt.setString(5, address);
			pstmt.setString(6, email);
			int i = pstmt.executeUpdate();
			
			if (i > 0) {
				response.sendRedirect("joinResult.jsp");
			} else {
				
				/* Response.Write("<script>alert('존재하는 아이디입니다.');</script>");
				Response.Write("<script>location.href='joinFrm.jsp';</script>"); */
			}
			
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			response.sendRedirect("joinFrm.jsp");
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
