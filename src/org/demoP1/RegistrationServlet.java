package org.demoP1;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname= request.getParameter("uname");
		String pwd = request.getParameter("password");
		String mono= request.getParameter("mobno");
		String email = request.getParameter("email");
		Object date= request.getParameter("dob");
		System.out.println(uname);
		System.out.println(date.getClass());
	}

}
