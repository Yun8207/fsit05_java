package tw.org.iii.mytest;

public class Alex33 {

	public static void main(String[] args) {
		//Alex331.m2();
		//Alex331 obj1 = new Alex331();
		Alex332 obj2 = new Alex332();
		Alex332 obj3 = new Alex332();

	}

}
class Alex331{
	{System.out.println("Alex331{}");}
	static {System.out.println("Alex331{static}");}
	Alex331(){System.out.println("Alex331()");}
	void m1() {System.out.println("Alex331:m1()");}
	static void m2() {System.out.println("ALex331:m2()");}
}
class Alex332 extends Alex331{
	{System.out.println("Alex332{}");}
	static {System.out.println("Alex332{static}");}
	Alex332(){System.out.println("Alex332()");}
	void m1() {System.out.println("Alex332:m1()");}
	static void m2() {System.out.println("Alex332:m2()");}
}