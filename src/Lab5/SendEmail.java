package Lab5;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;

public class SendEmail {
    public static void main(String[] args) throws IOException
    {
        Email email = new Email(
                "karuna.sth01@gmail.com",
                "ks@gmail.com",
                "Test email."
        );
        email.send();
    }
}
class Email
{
    private Scanner in = null;
    private PrintWriter out = null;
    private final String SMTP_SERVER = "smtp.wlink.com.np";
    private final int SMTP_PORT = 25;
    private String from = null;
    private String to = null;
    private String message = null;
    public Email(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }
    private void send(String s) throws IOException {
        System.out.println(">> " + s);
        out.print(s.replaceAll("\n", "\r\n"));
        out.print("\r\n");
        out.flush();
    }
    private void receive() throws IOException {
        String line = in.nextLine();
        System.out.println(" " + line);
    }
    public void send() throws IOException {
        Socket socket = new Socket(SMTP_SERVER, SMTP_PORT);
        in = new Scanner(socket.getInputStream());
        out = new PrintWriter(socket.getOutputStream(), true);
        String hostName = InetAddress.getLocalHost().getHostName();

        receive();
        send("Hello Host " + hostName);
        receive();
        send("MAIL FROM: <" + from + ">"); receive();
        send("RCPT TO: <" + to + ">"); receive();
        send("DATA"); receive();
        send(message);
        send("."); receive();
        socket.close();
    }

}
