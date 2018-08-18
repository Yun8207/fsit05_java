package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Alex65 {

	public static void main(String[] args) {
		try {
			
			
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			
			FileOutputStream fout = new FileOutputStream("dir3/picture.jpg");
			
			InputStream in = socket.getInputStream();
			int len; byte[] buf = new byte[4096*1024];
			
			while ((len = in.read(buf)) != -1) {
				fout.write(buf,0,len);
				
			}
			in.close();
			
			fout.flush();
			fout.close();
			
			server.close();
		} catch (IOException e) {
			
			System.out.println(e);
		}
//		try {
//			
//			
//			ServerSocket server = new ServerSocket(7777);
//			Socket socket = server.accept();
//			
//			FileOutputStream fout = new FileOutputStream("dir3/picture.jpg");
//			
//			InputStream in = socket.getInputStream();
//			int temp;
//			while ((temp = in.read()) != -1) {
//				fout.write(temp);
//				
//			}
//			in.close();
//			
//			fout.flush();
//			fout.close();
//			
//			server.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
