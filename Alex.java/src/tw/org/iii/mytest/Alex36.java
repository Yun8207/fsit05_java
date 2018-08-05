package tw.org.iii.mytest;

public class Alex36 {

	public static void main(String[] args) {
		Alex363 obj1 = new Alex363();
		Alex362 obj2 = new Alex363();

	}

}
interface Alex362 {
	void m1();
	void m2();			//interface is public and abstract
}

class Alex363 implements Alex362 {
	public void m1() {} 
	public void m2() {}
	void m3() {}
}
class Alex364 implements Alex362{
	public void m1() {}
	public void m2() {}
}