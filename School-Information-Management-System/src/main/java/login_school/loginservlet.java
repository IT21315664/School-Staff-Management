package login_school;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//to catch the JSP details
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");

		try {
	      List<Admin>admDetails =adminDBUtil.validate(username, password);
	      request.setAttribute("admDetails", admDetails);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	    
	    
	    RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/useraccount.jsp");
	    dis.forward(request, response);
	
	}

}
