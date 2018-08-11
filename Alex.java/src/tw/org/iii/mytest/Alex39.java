package tw.org.iii.mytest;

public class Alex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alex391 obj1 = new Alex391();
		Alex391.Alex392 obj2 = obj1.new Alex392();
		obj2.m1();
		Alex391.Alex393 obj3 = new Alex391.Alex393();
		obj3.m1();

	}
}
class Alex391{
	private int a = 10;
	class Alex392{
		Alex391 m1() {
			System.out.println("Alex391:Alex392:m1()");
			return Alex391.this;
		}
	}
	static class Alex393 {
		void m1() {
			
		}
	}
}

