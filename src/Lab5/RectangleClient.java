	package Lab5;
	
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.net.Socket;
	import java.util.Scanner;
	
	public class RectangleClient {
		public static void main(String[] args) throws IOException {
			final String HOST = "127.0.0.1";
			final int PORT = 1234;
	
			System.out.println("Client started.");
			try (Socket socket = new Socket(HOST, PORT);
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					Scanner in = new Scanner(socket.getInputStream());
					Scanner s = new Scanner(System.in);) {
				System.out.print("Enter length and breadth: ");
				double length = s.nextDouble();
				double breadth = s.nextDouble();
				out.println(length);
				out.println(breadth);
				System.out.println("Area of Circle returned from server: " + in.nextDouble());
	
			}
		}
	}
