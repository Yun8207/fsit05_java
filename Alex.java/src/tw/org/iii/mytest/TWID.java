package tw.org.iii.mytest;

public class TWID {
	private String id;
	
	
	TWID(){
		
	}
	
	TWID(boolean isMale){
		
	}
	
	TWID(int area){
		
	}
	
	TWID(boolean isMale, int area){
		
	}
	
	TWID(String id){
		this.id = id;
	}
	
	static TWID createTWID(String id) {
		if(checkID(id)) {
			return new TWID(id);
		}else {
			return null;
		}
	}
	
//	static boolean checkID(String id) {
//		String c1 = id.substring(0, 1);
//		String c2 = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
//		String c3 = id.substring(1,2);
//		String c4 = "1234567890";
//		int pos = c2.indexOf(c1);
//		//int pos2 = id.substring(2,10);
//		if(pos>=0 && (c3 == "1"||c3 == "2")&& id.length() ==10) {
//		return true;
//		}else {
//			return false;
//		}
//		
//		
//	}
	
	static boolean checkID(String id) {
		boolean isRight = false;
		if (id.matches("^[A-Z][12][0-9]{8}$")) {
			String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int n12 = letters.indexOf(id.charAt(0)) +10;
			int n1 = n12/10;
			int n2 = n12%10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			int sum = n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
			isRight = sum % 10 ==0;
		}
		return isRight;
	}
	
	
	
	/*boolean m1(String id) {
		System.out.println("OK"); //2
		return true;
	}*/
}
