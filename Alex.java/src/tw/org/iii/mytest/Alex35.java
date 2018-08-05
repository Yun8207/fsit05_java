package tw.org.iii.mytest;

public class Alex35 {

	public static void main(String[] args) {
		Shape s1 = new Circle();
		Shape s2 = new Rectangle();
		m2(s1);
		m2(s2);

	}
	
	static void m2(Shape s) {
		System.out.println(s.calArea());
	}

}
abstract class Shape {
	void setName() {}
	abstract double calLength();
	abstract double calArea();
}
class Circle extends Shape {
	double calLength() {
		return 1.0;
	}
	double calArea() {
		return 1.0;
	}
}

class Rectangle extends Shape {
	double calLength() {
		return 2.0;
	}
	double calArea() {
		return 2.0;
	}
}

final class Alex351 {
	
}
//class Brad352 extends Brad351 {
//	
//}