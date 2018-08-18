package tw.org.iii.mytest;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Alex63 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.201.160", 9999);
			OutputStream out = socket.getOutputStream();
			out.write("哈哈哈\n嘿嘿嘿\n齁齁齁".getBytes());
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("OK");
		} catch (IOException e) {
			
			System.out.println(e);
		}

	}

}
