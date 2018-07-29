package tw.org.iii.mytest;

public class Alex22 {

	public static void main(String[] args) {
		/*TWID.checkID("aa");//1
		
		TWID id1 = new TWID();//2
		id1.m1("aaa");*/
		
//		String a = "A123456789";
//		if(a.matches("^[A-Z][12][0-9]{8}$")) { //正規表示式//regular expression
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		
		
		if(TWID.checkID("A123456789")) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}

	}

}
