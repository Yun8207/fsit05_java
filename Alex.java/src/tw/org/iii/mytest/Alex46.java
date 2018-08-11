package tw.org.iii.mytest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Alex46 {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("dir1/alex");
			int temp; byte[] b = new byte[3];
			int size = 0;
			while((temp = fin.read(b)) != -1) { //assign then compare
				System.out.print(new String(b,0,temp));
				
			}
			fin.close();
		}catch(FileNotFoundException fe){ //smaller
			
		}catch(IOException fe) { //larger
			
		}//inputstream(byte) is use to read binary files(non-text file)
	}

}
