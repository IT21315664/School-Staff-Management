package payment_Servlet;



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
import payment_db.PaymentDB;
import payment_model.Payment;



@WebServlet("/")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PaymentDB PaymentDB;
	
	public void init() throws ServletException{
		PaymentDB = new PaymentDB();
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
				insertPayment(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			case "/delete":
				try {
				deletePayment(request, response);
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
				updatePayment(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			
			default:
				try {
				listPayment(request, response);
				}catch(SQLException e) {
					e.printStackTrace();
				}
				break;
			}
		}
		



//new 
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("payment-form.jsp");
		dispatcher.forward(request, response);
	}
	
	//insert
	private void insertPayment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String grade =request.getParameter("grade");
		String amount = request.getParameter("amount");
		String date = request.getParameter("date");
		String status= request.getParameter("status");
		
		Payment newPayment = new Payment(name, email, grade, amount, date, status);
	      PaymentDB.insertPayment(newPayment);
		response.sendRedirect("list");
	}
	

	//delete
	
	private void deletePayment(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			PaymentDB.deletePayment(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("list");

	}
	
	
	//edit
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		Payment existingPayment;
		try {
			existingPayment = PaymentDB.selectPayment(id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("payment-form.jsp");
			request.setAttribute("payment", existingPayment);
			dispatcher.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	
//update
	
	  private void updatePayment(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		   {
				int id = Integer.parseInt(request.getParameter("id"));
				String name = request.getParameter("name");
				String email = request.getParameter("email");
				String grade =request.getParameter("grade");
				String amount = request.getParameter("amount");
				String date = request.getParameter("date");
				String status= request.getParameter("status");
				Payment Payment = new Payment(id, name, email,grade, amount, date, status);
				PaymentDB.updatePayment(Payment);
				response.sendRedirect("list");
		  }
		}
	//default
	private void listPayment(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		try { 
			List<Payment> listPayment = PaymentDB.selectAllPayments();
			request.setAttribute("listPayment", listPayment);
			RequestDispatcher dispatcher = request.getRequestDispatcher("payment-list.jsp");
			dispatcher.forward(request, response);	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}


}