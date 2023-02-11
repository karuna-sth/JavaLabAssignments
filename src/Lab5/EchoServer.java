package Lab5;

import java.net.*;
import java.io.*;
public class EchoServer{
    public static void main(String args[]){
        int port = 8000;
        DatagramSocket serverDatagramSocket = null;
        try{
            serverDatagramSocket = new DatagramSocket(port);
            System.out.println("Created UDP Echo Server on port"+port);
            byte buffer[] = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
            System.out.println("Server Started ...");
            String input;
            while(true){
                serverDatagramSocket.receive(datagramPacket);
                input = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
                System.out.println("Received from Client: "+ input);
                serverDatagramSocket.send(datagramPacket);
                if (input.equalsIgnoreCase("exit")) break;
            }
            System.out.println("Server has been stopped...");
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(1);
        }
    }
}
