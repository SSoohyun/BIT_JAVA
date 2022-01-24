package com.shop.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class AddProductProc
 */
@WebServlet("/AddProductProc")
public class AddProductProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductProc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InitialContext ic = null;
		DataSource ds = null;
		Connection conn = null;
		int i = 0;
		
		try {
			ic = new InitialContext();
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
			conn = ds.getConnection();
			
			ServletContext cxt = getServletContext();
			String path = cxt.getRealPath("/upload"); // 파일을 업로드할 위치
			int size = 1024 * 1024 * 10; // 10M
			
			MultipartRequest multi = new MultipartRequest(request, path, size, "UTF-8",  new DefaultFileRenamePolicy());
			Enumeration files = multi.getFileNames(); // getParameter와 같음
			String name = (String) files.nextElement(); // 다음 요소 받아옴 (rs.next() 같은?)
			String orgFile = multi.getOriginalFileName(name); // 원래 파일 이름 받아옴
			
			
			String sql = "insert into products values(?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			request.setCharacterEncoding("utf-8");
			pstmt.setString(1, multi.getParameter("proId"));
			pstmt.setString(2, multi.getParameter("proName"));
			pstmt.setInt(3, Integer.parseInt(multi.getParameter("unitPrice")));
			pstmt.setString(4, multi.getParameter("description"));
			pstmt.setString(5, multi.getParameter("manufacturer"));
			pstmt.setString(6, multi.getParameter("category"));
			pstmt.setInt(7, Integer.parseInt(multi.getParameter("noOfStock")));			
			pstmt.setString(8, orgFile); // type="file"로 넘겨서 더 이상 getParameter로 받을 수 없는 듯..
			
			i = pstmt.executeUpdate();
			
			conn.close(); pstmt.close();
			
			if (i > 0) { 
				System.out.println("상품이 등록되었습니다.");
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.sendRedirect("addProduct.jsp");
		}
	}

}
