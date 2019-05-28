package org.demoP1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("username");
		String password = request.getParameter("passbox");
		
		JSONArray arr = new JSONArray();
		arr.put("data1");
		arr.put("data2");
		arr.put("data3");
		arr.put("data4");
		arr.put("data5");
		
		JSONObject jobj =  new JSONObject();
		try {
			jobj.put("mydata", arr);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out  =  response.getWriter();
		out.write(jobj.toString());
		out.flush();
	}

}
