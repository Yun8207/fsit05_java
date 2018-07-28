package tw.org.iii.mytest;

public class Alex100 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i=1; i<=100; i++) {
			boolean isPrime = true;
			for (int j=2; j<i; j++) {
				if (i % j == 0) {
					//caught
					isPrime = false;
					break;
				}
			}
			
			System.out.print(i + (isPrime?"*":" ") + "  \t");
			if(i % 10 ==0) System.out.println();
		}
		System.out.println(System.currentTimeMillis() -start);
	}

}
