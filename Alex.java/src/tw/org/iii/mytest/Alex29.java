package tw.org.iii.mytest;

public class Alex29 {

	public static void main(String[] args) {
		Alex291 obj1 = new Alex291();
		obj1.m1();
		Alex291 obj2 = new Alex292();
		obj2.m1();
		Alex292 obj3 = (Alex292)obj2;
		obj3.m1();
		obj3.m2();
		System.out.println(obj2 == obj3);
		
		if (obj1 instanceof Alex292) {
			Alex292 obj4 = (Alex292)obj1;// => RuntimeException
		}else {
			System.out.println("XX");
		}
		Alex294 obj5 = new Alex294();
		//Alex292 obj6 = (Brad292)obj5; => compile error
	}

}
class Alex291{
	void m1(){System.out.println("Alex291:m1()");}}
class Alex292 extends Alex291{
	void m1(){System.out.println("Alex292:m1()");}
	void m2(){}}
class Alex293 extends Alex292{void m3(){}}
class Alex294{}