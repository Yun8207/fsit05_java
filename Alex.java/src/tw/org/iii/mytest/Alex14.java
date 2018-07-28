package tw.org.iii.mytest;

public class Alex14 {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("---");
		
		
		
		alex: // for while do ......while 
		for (int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(i + j >=10) {
					break alex;
				}
				System.out.println(i + ":" + j);
			}
			
			
		}
	}

}
