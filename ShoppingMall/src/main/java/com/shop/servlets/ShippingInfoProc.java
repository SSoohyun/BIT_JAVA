package com.shop.servlets;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShippingInfoProc
 */
@WebServlet("/ShippingInfoProc")
public class ShippingInfoProc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShippingInfoProc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Cookie cartId = new Cookie("shippingCartId", URLEncoder.encode(request.getParameter("cartId"), "UTF-8"));
		Cookie name = new Cookie("shippingName", URLEncoder.encode(request.getParameter("name"), "UTF-8"));
		Cookie date = new Cookie("shippingDate", URLEncoder.encode(request.getParameter("shippingDate"), "UTF-8"));
		Cookie country = new Cookie("shippingCountry", URLEncoder.encode(request.getParameter("country"), "UTF-8"));
		Cookie zipcode = new Cookie("shippingZipcode", URLEncoder.encode(request.getParameter("zipcode"), "UTF-8"));
		Cookie address = new Cookie("shippingAddress", URLEncoder.encode(request.getParameter("address"), "UTF-8"));
		
		// 유효기간 설정
		cartId.setMaxAge(24*60*60);
		name.setMaxAge(24*60*60);
		date.setMaxAge(24*60*60);
		country.setMaxAge(24*60*60);
		zipcode.setMaxAge(24*60*60);
		address.setMaxAge(24*60*60);
		
		// 쿠키 추가
		response.addCookie(cartId);
		response.addCookie(name);
		response.addCookie(date);
		response.addCookie(country);
		response.addCookie(zipcode);
		response.addCookie(address);
		
		response.sendRedirect("orderConfirmation.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
