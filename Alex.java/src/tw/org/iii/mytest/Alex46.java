package tw.org.iii.mytest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Alex46 {

	public static void main(String[] args) {
		try {
			File source = new File("dir1/alex");
			FileInputStream fin = new FileInputStream(source);
			int temp; byte[] b = new byte[(int)(source.length())];
			int size = 0;
			
			fin.read(b);
			fin.close();
			System.out.print(new String(b,0,fin.read(b)));
//			while((temp = fin.read(b)) != -1) { //assign then compare
//				System.out.print(new String(b,0,temp));
//				
//			}
		}catch(FileNotFoundException fe){ //smaller
			
		}catch(IOException fe) { //larger
			
		}//inputstream(byte) is use to read binary files(non-text file)
	}

}
