package tw.org.iii.mytest;

public class Alex27 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		String str1 = new String("Alex");
		System.out.println(str1);
		Alex271 obj1 = new Alex271();
		System.out.println(obj1);
		Alex271 obj2 = new Alex271();
		System.out.println(obj2);
		System.out.println(obj1 == obj2);
		

	}

}

class Alex271{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Alex";
	}
}
