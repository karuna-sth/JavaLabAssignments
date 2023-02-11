package Lab5;

import java.net.*;

public class InetEx {
	public static void main(String[] args)
	        throws UnknownHostException{
	        InetAddress address1 = InetAddress.getLocalHost();
	        System.out.println("InetAddress of Local Host : "+ address1);
	        InetAddress address2
	            = InetAddress.getByName("58.33.69.21");
	        System.out.println("InetAddress of Named Host : "+ address2);
	        InetAddress address3[] = InetAddress.getAllByName("172.181.0.1");
	        for (int i = 0; i < address3.length; i++) {
	            System.out.println("ALL InetAddresses of Named Host : " + address3[i]);
	        }
	    }
}