package tw.org.iii.mytest;

public class Alex21 {

	public static void main(String[] args) {
		Bike b1, b2;
		b1 = new Bike();
		System.out.println(b1.getSpeed());
		b2 = new Bike(1.4);
		System.out.println(b2.getSpeed());
		b1.upSpeed(4);
		b1.upSpeed(4);
		b1.upSpeed(4);
		b1.upSpeed(4);
		System.out.println(b1.getSpeed());
	}

}
