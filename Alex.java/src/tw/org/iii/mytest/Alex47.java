package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.IOException;

public class Alex47 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("dir1/alex4.txt");
			fout.write("1234567\n".getBytes());
			fout.write("1234567\n".getBytes());
			fout.write("1234567\n".getBytes());
			fout.write("1234567\n".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(IOException ie) {
			System.out.println(ie);
		}

	}

}
