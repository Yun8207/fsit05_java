package tw.org.iii.mytest;

public class Alex17 {

	public static void main(String[] args) {
		int p[] = new int[7];
		
		for (int i= 0; i<100; i++) {
			int dice = (int)(Math.random()*9)+1;
			if (dice>=1 && dice <=9) {
				p[dice>=7?dice-3:dice]++;
			}else {
				p[0]++;
			}
		}
		if (p[0]==0) {
			for (int i =1; i<p.length; i++) {
				System.out.println(i +"point" + p[i] + "times");
			}
		}else {
			System.out.println("XX");
		}

	}

}
