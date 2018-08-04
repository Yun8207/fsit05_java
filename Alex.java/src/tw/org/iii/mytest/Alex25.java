package tw.org.iii.mytest;

public class Alex25 {

	public static void main(String[] args) {
		Alex251 b1 = new Alex251(2);
		//Alex251 b2 = New Alex251();
		Alex252 b2 = new Alex252();
		
		Alex251 b3 = new Alex251(2);
		
		System.out.println(b1.equals(b3));// same as == except in String() 
		System.out.println(b1 == b3);
		System.out.println(b1.isSame(b3));
	}

}

class Alex251 {
	private int a;
	//Alex251(){
		
	//}

	Alex251(int a){
		//super(); hidden
		this.a = a;
		System.out.println("Alex251()");
	}
	
	public int getA() {return a;}
	
	public boolean equals(Object obj) {
		return ((Alex251)obj).getA() == a;
	}
	
	public boolean isSame(Alex251 obj) {
		return ((Alex251)obj).getA() == a;
	}
	
	
}

class Alex252 extends Alex251 {
	Alex252(){
		//super();
		super(3);
	}
}

class Alex253 extends Alex252 {
	Alex253(){
		
	}
}