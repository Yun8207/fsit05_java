package tw.org.iii.mytest;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Alex54 {

	public static void main(String[] args) {
		try(DataInputStream din = 			//try() = auto close()
				new DataInputStream(
						new FileInputStream("dir1/alex.dat"))) {
			int stage = din.readInt();
			String username = din.readUTF();
			boolean isSound = din.readBoolean();
			System.out.println(stage + ":" + username + ":" + isSound);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
