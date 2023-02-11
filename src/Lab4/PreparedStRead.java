package Lab4;
import java.sql.*;
public class PreparedStRead {
	public static void main(String[] args)throws SQLException {
		ConnectDB conn = new ConnectDB();
		String sql = "Select * from student";
		PreparedStatement statement = conn.con.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()) {
        	System.out.printf("%d %s %s %d \n",
                    resultSet.getInt("stu_id"),
                    resultSet.getString("Name"),
                    resultSet.getString("District"),
                    resultSet.getInt("Age")
            );
        }
        conn.con.close();
	}
}
