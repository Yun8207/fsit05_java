package tw.org.iii.mytest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Alex64 {

	public static void main(String[] args) {
		// 1. read local file
		// 2. send tcp data
		try {
			File file = new File("dir1/alex.jpg");
			byte[] buf = new byte[(int)file.length()];
			new FileInputStream(file).read(buf);
			
			Socket socket = new Socket("192.168.201.160", 7777);
			
			OutputStream out = socket.getOutputStream();
			
			out.write(buf);
			out.flush();
			out.close();
			socket.close();
			System.out.println("Send OK");
		} catch (IOException e) {
			
			System.out.println(e);
		}

//		try {
//			byte[] buf = new byte[4096];
//			Socket socket = new Socket("192.168.201.160", 7777);
//			OutputStream out = socket.getOutputStream();
//			
//			FileInputStream fin = new FileInputStream("dir1/alex.jpg");
//			int len;
//			while ((len = fin.read(buf)) != -1) {
//				out.write(buf, 0 , len);
//			}
//			fin.close();
//			out.flush();
//			out.close();
//			socket.close();
//			System.out.println("Send OK");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e);
//		}
//		
//		
//
	}

}
