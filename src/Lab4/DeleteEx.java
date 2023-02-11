package Lab4;

import java.sql.*;
import java.util.Scanner;
public class DeleteEx {
	public static void main(String[] args) throws SQLException{
		ConnectDB conn = new ConnectDB();
		
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the Id to Delete from database:");
        int id = in.nextInt();

        String sql = "delete from student where stu_id= '" + id + "'";
        int rowDeleted = conn.stmt.executeUpdate(sql);
        
        if (rowDeleted > 0)
            System.out.println("Row Deleted Successfully!!");

        else
            System.out.println("Row isn't Deleted!!");
        
        conn.con.close();

	}
}
