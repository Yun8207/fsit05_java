package tw.org.iii.mytest;

public class Alex37 {

	public static void main(String[] args) {
		

	}

}

interface Alex371 {
	void m1();
}
interface Alex372 {
	void m2();
}

interface Alex373 extends Alex371, Alex372 {
	void m3();
}

class Alex374 implements Alex373{
	public void m1() {}
	public void m2() {}
	public void m3() {}
}