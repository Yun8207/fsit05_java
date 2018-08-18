package tw.org.iii.mytest;

public class Alex70 {

	public static void main(String[] args) {
		int a  = 10;
		Integer b = new Integer(10);
		Integer c = new Integer("10");
		Integer d = 10; //auto-boxing
		//System.out.println(b+4);//unwrapper => auto-unboxing
		System.out.println(d+6);
		
		System.out.println(a==b);//compare value or object
		System.out.println(b.equals(a));//compare value

	}

}
