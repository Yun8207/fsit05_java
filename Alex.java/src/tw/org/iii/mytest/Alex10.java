package tw.org.iii.mytest;

public class Alex10 {

	public static void main(String[] args) {
		byte a = 11, b = 100;
		final byte c = 100;
		
		switch (a) {

		default : 
			System.out.println("X");
		case 1 : 
			System.out.println("A"); 
			break;
		case c-90 : 
			System.out.println("B"); 
			break;
		case c : 
			System.out.println("C"); 
			break;
//		case 1000 : 
//			System.out.println("D"); 
//			break;
		}

	}

}
