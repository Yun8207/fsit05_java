package tw.org.iii.mytest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Alex59 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.google.com");//Host name = 主機name(www).domain.root
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(e);
		}

	}

}
