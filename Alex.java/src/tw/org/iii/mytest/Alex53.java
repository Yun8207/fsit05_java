package tw.org.iii.mytest;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Alex53 {

	public static void main(String[] args) {
		try {
			DataOutputStream dout =
				new DataOutputStream(new FileOutputStream("dir1/alex.dat"));
			dout.writeInt(4);
			dout.writeUTF("Alex");
			dout.writeBoolean(false);
			
			
			dout.flush();
			dout.close();
			System.out.println("Save OK");
		}catch(Exception e) {
			
		}

	}

}
