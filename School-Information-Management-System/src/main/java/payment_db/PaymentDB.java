package payment_db;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import payment_model.Payment;

import java.util.Date;




public class PaymentDB {
	private String jdbcURL = "jdbc:mysql://localhost:3306/userdb?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "997480503V";
	private String jdbcDriver = "com.mysql.jdbc.Driver";
	

	private static final String INSERT_PAYMENT_STD_SQL = "INSERT INTO payment_std" + "  (name, email, grade, amount, date, status) VALUES "
			+ " (?, ?, ?, ?, ?, ?);";

	private static final String SELECT_PAYMENT_STD_BY_ID = "select id,  name, email, grade, amount, date, status from payment_std where id =?";
	private static final String SELECT_ALL_PAYMENT_STD = "select * from payment_std";
	private static final String DELETE_PAYMENT_STD_SQL = "delete from payment_std where id = ?;";
	private static final String UPDATE_PAYMENT_STD_SQL = "update payment_std set name = ?,email= ?, grade= ?,amount =? , date =? , status =? where id = ?;";
	

	public PaymentDB() {
	} 

	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(jdbcDriver);
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

//select payment
	public Payment selectPayment(int id) {
		Payment Payment = null;
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(SELECT_PAYMENT_STD_BY_ID);) {
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String grade = rs.getString("grade");
				String amount = rs.getString("amount");
				String date = rs.getString("date");
				String status = rs.getString("status");
				Payment = new Payment(id,name, email, grade, amount, date, status);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return Payment;
	}

	//insert payment
		public void insertPayment(Payment Payment) throws SQLException {
			System.out.println(INSERT_PAYMENT_STD_SQL);
			// try-with-resource statement will auto close the connection.
			try (Connection connection = getConnection();
					PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PAYMENT_STD_SQL)) {
				preparedStatement.setString(1, Payment.getName());
				preparedStatement.setString(2, Payment.getEmail());
				preparedStatement.setString(3, Payment.getGrade());
				preparedStatement.setString(4, Payment.getAmount());
				preparedStatement.setString(5, Payment.getDate());
				preparedStatement.setString(6, Payment.getStatus());
				
				System.out.println(preparedStatement);
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				printSQLException(e);
			
			}}

//update payment
	public boolean updatePayment(Payment Payment) throws SQLException {
		boolean rowUpdated;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(UPDATE_PAYMENT_STD_SQL);) {
			System.out.println("updated USer:"+statement);
			statement.setString(1, Payment.getName());
			statement.setString(2, Payment.getEmail());
			statement.setString(3, Payment.getGrade());
			statement.setString(4, Payment.getAmount());
			statement.setString(5, Payment.getDate()); 
			statement.setString(6, Payment.getStatus());
			statement.setInt(7, Payment.getId());

			rowUpdated = statement.executeUpdate() > 0;
		}
		return rowUpdated;
	}



//delete
	public boolean deletePayment(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(DELETE_PAYMENT_STD_SQL);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}

		
private void printSQLException(SQLException ex) {
	for (Throwable e : ex) {
		if (e instanceof SQLException) {
			e.printStackTrace(System.err);
			System.err.println("SQLState: " + ((SQLException) e).getSQLState());
			System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
			System.err.println("Message: " + e.getMessage());
			Throwable t = ex.getCause();
			while (t != null) {
				System.out.println("Cause: " + t);
				t = t.getCause();
			}
		}
	}
}

public List<Payment> selectAllPayments(){

	// using try-with-resources to avoid closing resources (boiler plate code)
	List<Payment> Payments  = new ArrayList<>();
	
	// Step 1: Establishing a Connection
	try (Connection connection = getConnection();

			// Step 2:Create a statement using connection object
		PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_PAYMENT_STD);) {
		System.out.println(preparedStatement);
		// Step 3: Execute the query or update query
		ResultSet rs = preparedStatement.executeQuery();

		// Step 4: Process the ResultSet object.
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String grade = rs.getString("grade");
			String amount = rs.getString("amount");
			String date = rs.getString("date");
			String status = rs.getString("status");
			Payments.add(new Payment(id, name, email, grade, amount, date, status));
			
		}
	} catch (SQLException e) {
		printSQLException(e);
	}
	return Payments;
}
			}


