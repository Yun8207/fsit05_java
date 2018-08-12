package tw.org.iii.mytest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Alex57 {

	public static void main(String[] args) {
		Alex573 obj = new Alex573();
		try(ObjectOutputStream oout =
				new ObjectOutputStream(
						new FileOutputStream("dir1/alex2.object"))){
			oout.writeObject(obj);
			System.out.println("Save OK");
		}catch(Exception e) {
			System.out.println(e);
			
		}

	}

}
class Alex571 {
	Alex571(){System.out.println("Alex571()");}
}
class Alex572 extends Alex571 {
	Alex572(){System.out.println("Alex572()");}
}
class Alex573 extends Alex572 implements Serializable{
	Alex573(){System.out.println("Alex573()");}
}

