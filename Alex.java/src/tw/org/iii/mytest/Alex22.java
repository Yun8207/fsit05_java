package tw.org.iii.mytest;

public class Alex22 {

	public static void main(String[] args) throws Exception{
		/*TWID.checkID("aa");//1
		
		TWID id1 = new TWID();//2
		id1.m1("aaa");*/
		
//		String a = "A123456789";
//		if(a.matches("^[A-Z][12][0-9]{8}$")) { //正規表示式//regular expression
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		
		
		TWID id1 = new TWID();
		TWID id2 = new TWID(true);
		TWID id3 = new TWID(14);
		TWID id4 = new TWID(false, 17);
		TWID id5 = TWID.createTWID("A123456789");
		System.out.println(id1.getID()+id1.isMale());
		System.out.println(id2.getID()+id1.isMale());
		System.out.println(id3.getID());
		System.out.println(id4.getID());
		System.out.println(id5.getID());
		
		
		
//		if(TWID.checkID("A123456789")) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}

	}

}
