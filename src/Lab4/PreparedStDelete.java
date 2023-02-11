package Lab4;
import java.sql.*;
import java.util.Scanner;
public class PreparedStDelete {
    public static void main(String[] args) throws SQLException {
    	ConnectDB conn = new ConnectDB();
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter ID to update:");
        int stu_id = input.nextInt();
        String sql = String.format("delete from student where stu_id=?;");
        PreparedStatement statement = conn.con.prepareStatement(sql);
        statement.setInt(1,stu_id);
        int rowInserted = statement.executeUpdate();
        if(rowInserted>0)
            System.out.println("Deleted Successfully!");
        else
            System.out.println("Delete Failed!!");
        input.close();
        conn.con.close(); 
    }
}