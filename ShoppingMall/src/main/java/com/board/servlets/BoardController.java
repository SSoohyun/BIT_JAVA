package com.board.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.conan.vo.BoardDAO;
import com.conan.vo.BoardVO;

/**
 * Servlet implementation class BoardController3
 */
@WebServlet("*.do")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		
		BoardDAO dao = BoardDAO.getInstance();
		
		if (cmd.equals("/board/writeProc.do")) {
			request.setCharacterEncoding("utf-8");
			String userId = request.getParameter("userId");
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			String bn = request.getParameter("boardNo");
			
			if (bn != null) {
				int boardNo = Integer.parseInt(bn);
				dao.updateBoard(new BoardVO(boardNo, title, content));								
			} else {
				dao.insertBoard(new BoardVO(userId, title, content));								
			}
//			System.out.println(bn);
			
			response.sendRedirect(request.getContextPath() + "/board/listProc.do");
		} else if (cmd.equals("/board/listProc.do")) {
//			HttpSession session = request.getSession();
//			session.setAttribute("board", dao.selectBoardAll());
//			response.sendRedirect(request.getContextPath() + "/board/list.jsp");
			
			if (request.getAttribute("subject") != null && request.getAttribute("text") != null) {
//				System.out.println((String)request.getAttribute("text"));
//				System.out.println((String)request.getAttribute("subject"));
				String subject = (String) request.getAttribute("subject");
				String text = (String) request.getAttribute("text");
				request.setAttribute("posts", dao.matchText(subject, text).size());
//				request.setAttribute("posts", dao.getMatchCount(subject, text));
				request.setAttribute("board", dao.matchText(subject, text));
				RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("posts", dao.getListCount());
				request.setAttribute("board", dao.selectBoardAll());
				RequestDispatcher rd = request.getRequestDispatcher("/board/list.jsp");
				rd.forward(request, response);
			}
		} else if (cmd.equals("/board/viewProc.do")) {
			request.setCharacterEncoding("utf-8");
			int boardNo = Integer.parseInt(request.getParameter("boardNo"));
			System.out.println(boardNo);
			
			dao.increaseHit(boardNo); // 조회수 증가
			request.setAttribute("post", dao.selectBoard(boardNo)); // 게시글 정보 DB 조회
			
			RequestDispatcher rd = request.getRequestDispatcher("/board/view.jsp");
			rd.forward(request, response);
		} else if (cmd.equals("/board/deleteProc.do")) {
			request.setCharacterEncoding("utf-8");
			int boardNo = Integer.parseInt(request.getParameter("boardNo"));
			dao.deleteBoard(boardNo);
			response.sendRedirect(request.getContextPath() + "/board/listProc.do");
		} else if (cmd.equals("/board/searchProc.do")) {
			request.setCharacterEncoding("utf-8");
			String item = request.getParameter("items");
			String text = request.getParameter("text");
			
			request.setAttribute("subject", item);
			request.setAttribute("text", text);
			RequestDispatcher rd = request.getRequestDispatcher("/board/listProc.do");
			rd.forward(request, response);
		}
	}
}


