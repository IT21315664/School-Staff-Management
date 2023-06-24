package accountant_Servlet;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import accountant_DB.UserDB;
import accountant_model.User;


@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDB UserDB;
	
	public void init() throws ServletException{
		UserDB = new UserDB();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		
			switch (action) {
			case "/new":
				showNewForm(request, response);
				break;
			case "/insert":
				try {
				insertUser(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case "/delete":
				try {
				deleteUser(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case "/edit":
				try {
				showEditForm(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case "/update":
				try {
				updateUser(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				try {
				listUser(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			}
		}
		

	
  //new 
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
		dispatcher.forward(request, response);
	}
	
	//insert
	private void insertUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneNo =request.getParameter("phoneNo");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		User newUser = new User(name, email, phoneNo, gender, address);
		UserDB.insertUser(newUser);
		//response.sendRedirect("user-list");
		RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//delete
	
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
		UserDB.deleteUser(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("list");

	}
	
	
	//edit
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		User existingUser;
		try {
			existingUser = UserDB.selectUser(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
			request.setAttribute("user", existingUser);
			dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	
//update
	private void updateUser(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneNo =request.getParameter("phoneNo");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		User user = new User(id, name, email, phoneNo, gender, address);
		UserDB.updateUser(user);
		response.sendRedirect("list");
	}

	//default
	private void listUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		try {
			List<User> listUser = UserDB.selectAllUsers();
			request.setAttribute("listUser", listUser);
			RequestDispatcher dispatcher = request.getRequestDispatcher("user-list.jsp");
			dispatcher.forward(request, response);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}