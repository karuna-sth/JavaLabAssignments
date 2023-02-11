package Lab4;

import java.sql.*;
public class ExtractDataDemo {
	public static void main(String[] args)throws SQLException {
		ConnectDB connection = new ConnectDB();
		String sql = "Select * from student where district ='Kathmandu'";
		ResultSet rs = connection.stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%d %s %s %d \n",
					rs.getInt("stu_id"),
					rs.getString("Name"),
					rs.getString("District"),
					rs.getInt("Age")
					);
		}
		connection.con.close();
	}
}