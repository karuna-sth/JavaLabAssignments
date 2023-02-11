package Lab4;

import java.sql.*;
import java.util.Scanner;

public class PreparedStUpdate {
    public static void main(String[] args) throws SQLException {
    	ConnectDB conn = new ConnectDB();
    	Scanner input = new Scanner(System.in);
    	Scanner inputstr = new Scanner(System.in);
    	System.out.println("Enter ID to update:");
        int stu_id = input.nextInt();
        System.out.println("Enter Name:");
        String name = inputstr.nextLine();
        System.out.println("Enter District:");
        String district = inputstr.nextLine();
        System.out.println("Enter Age:");
        int age = input.nextInt();
        String sql = String.format("update student set name = ?,district= ? , age = ? where stu_id =?;");
        PreparedStatement statement = conn.con.prepareStatement(sql);
        statement.setString(1,name);
        statement.setString(2,district);
        statement.setInt(3,age);
        statement.setInt(4,stu_id);
        int rowInserted = statement.executeUpdate();
        if(rowInserted>0)
            System.out.println("Updated Successfully!");
        else
            System.out.println("Update Failed!!");
        input.close();
        conn.con.close(); 
    }
}