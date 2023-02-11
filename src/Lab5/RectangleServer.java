package Lab5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class RectangleServer {
	 public static void main(String[] args) throws IOException {
	        final int PORT = 1234;
	        System.out.println("Server started.");
	        System.out.println("Listening to client...");

	        try (
	                ServerSocket serverSocket = new ServerSocket(PORT);
	                Socket clientSocket = serverSocket.accept();
	                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
	                Scanner in = new Scanner(clientSocket.getInputStream());
	        ) {
	            while (true)
	            {
	                double length = in.nextDouble();
	                double breadth = in.nextDouble();
	                double area =  length*breadth;
	                System.out.println("Dimension received from client: " + length +" and "+ breadth);
	                out.println(area);

	                String choice = in.next();
	                if (choice.equalsIgnoreCase("Y")) break;

	            }
	            System.out.println("Server has been stopped.");
	        }


	    }
}
