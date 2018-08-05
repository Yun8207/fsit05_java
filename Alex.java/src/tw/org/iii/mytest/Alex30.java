package tw.org.iii.mytest;

public class Alex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alex302 obj1 = new Alex302();
		byte b1 = 2;
		obj1.m1(2);
		obj1.m1((byte)2);
		Alex301 obj2 = new Alex301();
		obj1.m1(new int[] {1,2,3});
		
	}

}
class Alex301{
	int m1(int a) {
		System.out.println("A1");
		return 1;
	}
//	void sayYa(String[] names) {
//		for (String name: names) {
//			System.out.println(name + ", Ya!");
//		}
//	}
	void m1(int a, int b) {
		System.out.println("A2");
	}
	
	
	void m1(int...as) {   //Non-limited Variable
		System.out.println("A3");
	}
	
//	void m1(int[] names) {
//		System.out.println("A4");
//	}
	
}

class Alex302 extends Alex301 {
	String m1(byte a){
		System.out.println("B");
		return "a";
	}
	void m1(int[] names) {
		System.out.println("A4");
	}
	
	
}

