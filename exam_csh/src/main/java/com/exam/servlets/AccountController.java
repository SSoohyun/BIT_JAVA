package com.exam.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exam.data.Account;
import com.exam.data.AccountDAO;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("*.action")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		System.out.println("uri: " + uri);
		String ctxPath = request.getContextPath();
		System.out.println("ctxPath: " + ctxPath);
		String cmd = uri.substring(ctxPath.length());
		System.out.println("cmd: " + cmd);
		
		AccountDAO dao = AccountDAO.getInstance();
		
		if (cmd.equals("/openAccount.action")) {
			request.setCharacterEncoding("UTF-8");
			String accountId = request.getParameter("accountId");
			String accountPwd = request.getParameter("accountPwd");
			String userName = request.getParameter("userName");
			int balance = Integer.parseInt(request.getParameter("balance"));
			
			dao.openAccount(new Account(accountId, accountPwd, userName, balance));
			response.sendRedirect(request.getContextPath() + "/frontController.jsp");
		} else if (cmd.equals("/selectAccount.action")) {
			request.setCharacterEncoding("UTF-8");
			String accountId = request.getParameter("accountId");
			String accountPwd = request.getParameter("accountPwd");
			
			request.setAttribute("account", dao.selectAccount(accountId, accountPwd));
			RequestDispatcher rd = request.getRequestDispatcher("/selectAccount.jsp");
			rd.forward(request, response);
		} else if (cmd.equals("/accountJob.action")) {
			request.setCharacterEncoding("UTF-8");
			String accountId = request.getParameter("accountId");
			String accountPwd = request.getParameter("accountPwd");
			int amount = Integer.parseInt(request.getParameter("amount"));
			String item = request.getParameter("items");
			String receiver = request.getParameter("receiver");
			
			dao.accountJob(accountId, accountPwd, amount, item, receiver);
			
			response.sendRedirect(request.getContextPath() + "/frontController.jsp");
		} else if (cmd.equals("/selectAccountAll.action")) {
			request.setAttribute("account", dao.selectAccountAll());
			RequestDispatcher rd = request.getRequestDispatcher("/selectAccountAll.jsp");
			rd.forward(request, response);
		} 
	}
}
