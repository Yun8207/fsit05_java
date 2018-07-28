package tw.org.iii.mytest;

public class Alex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 3;
		if (a-- >= 10 && ++b <= 3) {
			System.out.println("OK:a =" + a + ";b =" + b);
		}else {
			System.out.println("XX:a =" + a + ";b =" + b);
		}
		System.out.println(3 ^ 2); // 1/1=0 1/0=1 0/0=0 01 = 1
		System.out.println(3 & 2); //10 = 2
		System.out.println(3 | 2); //11 = 3
		
		if(a < 10) {
			System.out.println("III");
		}
	}

}
