package Lab4;

import java.sql.*;
import java.util.*;
public class CreateEx {
	public static void main(String[] args)throws SQLException {
		ConnectDB connection = new ConnectDB();
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter Name:");
	    String name = in.nextLine();
	    System.out.println("Enter District:");
	    String district = in.next();
	    System.out.println("Enter Age:");
	    int age = in.nextInt();
	    
	    String sql = String.format("Insert into student (Name,District,Age) Values ('"+name+"','"+district+"','"+age+"')");
	    int rowInserted = connection.stmt.executeUpdate(sql);
        if(rowInserted>0)
            System.out.println("Row Inserted Successfully!");
        else
            System.out.println("Row Insertion Failed!!");
        in.close();
        connection.con.close();
	}
}
