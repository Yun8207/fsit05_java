package tw.org.iii.mytest;

public class Alex42 {
	public static void main(String[] args) {
		m1();
	}
	
	static void m1() {
		int a = 10, b = 0;
		try {
			System.out.println(a/ b);
		}catch (Exception e) {
			System.out.println("OK");//only run when have exception
			return;
		}finally {
			System.out.println("OK2");//always run
		}
		//System.out.println("OK3");
	}
}
