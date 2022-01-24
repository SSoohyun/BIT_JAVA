package com.shop.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.conan.vo.Products;

/**
 * Servlet implementation class AddCart
 */
@WebServlet("/AddCart")
public class AddCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proId = request.getParameter("proId");
		
		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
			Connection conn = ds.getConnection();
			String sql = "select * from products where proid = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, proId);
			ResultSet rs = pstmt.executeQuery();
			Products selectedItem = null;
		
			if (rs.next()) {
				selectedItem = new Products(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4),
						  					rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8));
			}
			
			rs.close(); pstmt.close(); conn.close();
			
			
			HttpSession session = request.getSession();
			ArrayList<Products> cartList = (ArrayList<Products>) session.getAttribute("cartList");
			if (cartList == null) {
				cartList = new ArrayList<Products>();
				session.setAttribute("cartList", cartList); // 카트 리스트 생성
			}
			
			int cnt = 0;
			Products orderedItem = new Products(); // 주문 상품
			for (int i = 0; i < cartList.size(); i++) {
				orderedItem = cartList.get(i);
				if (orderedItem.getProId().equals(proId)) { // 있는 아이템
					cnt++;
					int orderedQuantity = orderedItem.getQuantity() + 1; // 주문 수량 증가 (줄 수)
					orderedItem.setQuantity(orderedQuantity);
				}
			}
			
			if (cnt == 0) { // 카트에 추가된 적이 없으면 (새로운 아이템)
				selectedItem.setQuantity(1);
				cartList.add(selectedItem);
			}
			
			// 해당 상품의 상세 페이지
			response.sendRedirect("ProductDetail?proId=" + proId);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
