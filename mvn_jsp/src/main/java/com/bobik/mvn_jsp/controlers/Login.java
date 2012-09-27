package com.bobik.mvn_jsp.controlers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.bobik.mvn_jsp.models.impl.LoginModelDAOImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(Login.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		LoginModelDAOImpl lm = new LoginModelDAOImpl();
		request.setAttribute("title", lm.getTitle());
		request.setAttribute("list", lm.getFromDB("SELECT * FROM test"));
		RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp");
		rd.forward(request, response);
		log.error("forwarded");
	}

}
