package Lab4;

import java.sql.*;
public class ReadEx {
	public static void main(String[] args)throws SQLException {
		ConnectDB connection = new ConnectDB();
		String sql = "Select * from student";
		ResultSet rs = connection.stmt.executeQuery(sql);
		while(rs.next()) {
			   System.out.printf("%d %s %s %s \n",
					   rs.getInt("stu_id"),
					   rs.getString("Name"),
					   rs.getString("District"),
					   rs.getString("Age")
               );
		}
		connection.con.close();
	}
}