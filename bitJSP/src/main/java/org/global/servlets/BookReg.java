package org.global.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.icarus.beans.Book;

/**
 * Servlet implementation class BookReg
 */
@WebServlet("/bookReg")
public class BookReg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookReg() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 요청 패러미터 추출
		request.setCharacterEncoding("utf-8");
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		String bookName = request.getParameter("bookName");
		String publisher = request.getParameter("publisher");
		int price = Integer.parseInt(request.getParameter("price"));

		// Books 객체 생성하여 book에 참조
		Book book = new Book(bookId, bookName, publisher, price);
		request.setAttribute("book", book);
		RequestDispatcher rd = request.getRequestDispatcher("ex1206/bookResult.jsp");
		rd.forward(request, response);
	}

}
