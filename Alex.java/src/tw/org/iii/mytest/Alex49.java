package tw.org.iii.mytest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Alex49 {

	public static void main(String[] args) {
		try {
		long start = System.currentTimeMillis();
		FileInputStream fin = new FileInputStream("dir1/alex.jpg");
		FileOutputStream fout = new FileOutputStream("dir2/alex.jpg");
		
		int temp;
		
		while((temp= fin.read()) != -1) {
			fout.write(temp);
		}

		fout.flush();
		fout.close();
		fin.close();
		System.out.println("OK" + (System.currentTimeMillis()-start));
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
