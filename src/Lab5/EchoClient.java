package Lab5;

import java.net.*;
import java.io.*;
public class EchoClient{
    public static void main(String[] args) throws Exception{
        InetAddress address = null;
        int port = 8000;      
        DatagramSocket datagramSocket = null;
        BufferedReader keyboardReader = null;
        try {
            address = InetAddress.getByName("127.0.0.1");
            datagramSocket = new DatagramSocket();
            keyboardReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Client Started...");
            String input;
            while (true){
                System.out.println("Enter Input: ");
                input = keyboardReader.readLine();
                DatagramPacket sendDatagramPacket = new DatagramPacket(input.getBytes(), input.length(), address, port);
                datagramSocket.send(sendDatagramPacket);
                byte[] b1 = new byte[1024];
                DatagramPacket receiveDatagramPacket = new DatagramPacket(input.getBytes(),input.length());
                datagramSocket.receive(receiveDatagramPacket);
                String str = new String(receiveDatagramPacket.getData());
                System.out.println("Result Received from Server is: " + str);
                if (input.equalsIgnoreCase("exit")) break;
            }
            System.out.println("Client Stopped...");
        }
        catch (IOException e){
            System.out.println(e);
            System.exit(1);
        }
    }
}
