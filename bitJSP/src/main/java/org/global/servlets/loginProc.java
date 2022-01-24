package org.global.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginProc
 */
@WebServlet("/member/loginProc.do")
public class loginProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginProc() {
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
		ResultSet rs = null;
		
		request.setCharacterEncoding("utf-8");
		String userId = request.getParameter("userId"); 
		String userPwd = request.getParameter("userPwd");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbId, dbPwd);
			
			// 데이터 저장
			sql = "select userid, userpwd, username from members where userid = ? and userpwd = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			rs = pstmt.executeQuery();
			
			if (rs.next() == false) {
				response.sendRedirect("loginFrm.jsp");
			} else {
				HttpSession httpSession = request.getSession();
				if (httpSession.isNew() || httpSession.getAttribute("userId") == null) {
					httpSession.setAttribute("userId", userId);			
					RequestDispatcher rd = request.getRequestDispatcher("loginResult.jsp");
					rd.forward(request, response);
				}
			}
			
			rs.close(); pstmt.close(); conn.close();
		} catch(ClassNotFoundException e) { 
			
		} catch(SQLException e) {
			
		}
	}

}
