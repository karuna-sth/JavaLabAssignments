package Lab4;

import java.sql.*;
import java.util.Scanner;

public class PreparedStCreate {
    public static void main(String[] args) throws SQLException {
    	ConnectDB conn = new ConnectDB();
    	Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        String name = input.nextLine();
        System.out.println("Enter District:");
        String district = input.next();
        System.out.println("Enter Age:");
        int age = input.nextInt();
        String sql = String.format("Insert into student (Name,District,Age) Values (?,?,?)");
        PreparedStatement statement = conn.con.prepareStatement(sql);
        statement.setString(1,name);
        statement.setString(2,district);
        statement.setInt(3,age);
        int rowInserted = statement.executeUpdate();
        if(rowInserted>0)
            System.out.println("Row Inserted Successfully!");
        else
            System.out.println("Row Insertion Failed!!");
        input.close();
        conn.con.close(); 
    }
}