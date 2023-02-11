package Lab4;

import java.sql.*;
public class ConnectDB {
	public Connection con;
    public Statement stmt;
    ConnectDB(){
		 try {
	            Class.forName("org.postgresql.Driver");
	            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Classroom","postgres","HelloWorld");
	            stmt = con.createStatement();
	            if (con !=null) {
	            	System.out.println("Connected to DB");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
    public static void main(String[] args)throws SQLException {
    	new ConnectDB();
    }
}
