package tw.org.iii.mytest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Alex59 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.google.com");//Host name = 主機name(www).domain.root
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
		} catch (UnknownHostException e) {
			System.out.println(e);
		}

	}//UDP TCP ICHP watch internet knowledge ex.台灣鳥哥 birdbro

}
