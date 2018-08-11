package tw.org.iii.mytest;

public class Alex41 {

	public static void main(String[] args) {
		int a = 10, b =3;
		int c;
		int [] d = new int[3];
		try {
			c= a/b;
			System.out.println(c);
			 System.out.println(d[13]);
//		}catch (ArithmeticException e) {
//			System.out.println("Ops");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ops2");
		}
		
		System.out.println("Game Over");

	}

}
