package login_school;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class adminDBUtil {
//validate part
	public static List<	Admin> validate(String username,String password){
		
	ArrayList<Admin>	adm =new ArrayList<>();
	
	//create database connection
	  String url = "jdbc:mysql://localhost:3306/userdb?useSSL=false";
	  String user = "root";
	  String pass= "997480503V";
	  //String driver="com.mysql.cj.jdbc.driver";
	
	//validate
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
		  
		  Connection con = DriverManager.getConnection(url,user,pass);
		  Statement stmt = con.createStatement();
		  String sql ="select * from login where username='"+username+"' and password='"+password+"'";
		  ResultSet rs = stmt.executeQuery(sql);
		  
		  if(rs.next()){
			  int id = rs.getInt(1);
			  String name = rs.getString(2);
			  String email = rs.getString(3);
			  String userU = rs.getString(4);
			  String passU = rs.getString(5);
			  
			  Admin ad = new Admin(id,name,email,userU,passU);
			  adm.add(ad);
			  
		  }
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	
	
	
	
	
	return adm;
}
}