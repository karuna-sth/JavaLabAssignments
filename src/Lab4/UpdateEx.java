package Lab4;

import java.sql.*;
import java.util.Scanner;

public class UpdateEx {
	public static void main(String[] args)throws SQLException {
		ConnectDB conn = new ConnectDB();
		Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID of student to update data:\t");
		int ID = sc.nextInt();		
        System.out.println("Enter the Name to update into database:");
        String name = s.nextLine();
        System.out.println("Enter the Age to update into database:");
        int age = sc.nextInt();
        System.out.println("Enter the District to update into database:");
        String district = s.nextLine();
        s.close();
        sc.close();
        String sql = "update student set name = '" + name + "',district= '" + district + "' , age = '" + age + "' where stu_id =" + ID + ";" ;
        System.out.println(sql);
        int rowUpdated = conn.stmt.executeUpdate(sql);
        if (rowUpdated > 0)
            System.out.println("Row updated Successfully!!");

        else
            System.out.println("Row isn't Updated!!");
        
        conn.con.close();
	}
}