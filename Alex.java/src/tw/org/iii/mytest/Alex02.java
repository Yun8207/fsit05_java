package tw.org.iii.mytest;

public class Alex02 {

	public static void main(String[] args) {
		int a1 = 10, a2 = 3;
		int a3 = a1 / a2;
		System.out.println(a3);
		byte b1 = 10, b2 = 3;
		byte b3 = (byte)(b1 / b2);
		System.out.println(b3);
		byte b4 = 120 + 3; // int = byte + byte  byte, long, int => int
		byte b5 = 127;
		b5++;
		System.out.println(b5);
		b5--;
		System.out.println(b5);
		b5 += 5;
		System.out.println(b5);
		b5 -= 5;
		System.out.println(b5);
		// b5 = b5 + 4  =/= b5 += 4
		
	}

}
