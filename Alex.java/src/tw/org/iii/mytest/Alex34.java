package tw.org.iii.mytest;

public class Alex34 {

	public static void main(String[] args) {
		Alex341 obj1 = new Alex342();
		Alex341 obj2 = new Alex343();
		obj1.m2();
		obj2.m2();
	}

}
abstract class Alex341{
	void m1() {System.out.println("Alex341:m1");}
	abstract void m2();
}
class Alex342 extends Alex341 {
	void m2() {System.out.println("Alex342:m2");}
}
class Alex343 extends Alex341 {
	void m2() {System.out.println("Alex343:m2");}
}
