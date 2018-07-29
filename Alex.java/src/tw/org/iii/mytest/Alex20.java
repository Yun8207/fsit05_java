package tw.org.iii.mytest;

public class Alex20 {

	static public void main(String[] alex) {
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1.getSpeed());
		for(int i=0;i<8;i++) {
			b1.upSpeed();
		}
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		for(int i=0;i<6;i++) {
			b1.downSpeed();
		}
		System.out.println(b1.getSpeed());
		

	}

}
