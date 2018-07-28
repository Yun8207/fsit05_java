package tw.org.iii.mytest;

public class Alex16 {

	public static void main(String[] args) {
		int dice = 0;
		int p1, p2, p3, p4, p5, p6, p0;
		p0 = p1 = p2 = p3 = p4 = p5 = p6 = 0;
		for(int i=0; i<100; i++) {
			dice = (int)(Math.random()*6)+1;
			switch(dice) {
			case 1: p1++; break;
			case 2: p2++; break;
			case 3: p3++; break;
			case 4: p4++; break;
			case 5: p5++; break;
			case 6: p6++; break;
			default: p0++;
			}
			
		}
		if (p0==0) {
			System.out.println("p1 " + p1 + "times");
			System.out.println("p2 " + p2 + "times");
			System.out.println("p3 " + p3 + "times");
			System.out.println("p4 " + p4 + "times");
			System.out.println("p5 " + p5 + "times");
			System.out.println("p6 " + p6 + "times");
		
		}
	}

}
