package tw.org.iii.mytest;

public class Alex15 {

	public static void main(String[] args) {
		/* Array
		1. Type
		2. Length 
		*/
		int[] a;
		a = new int[4];
		for (int i=0; i<a.length; i++) {
			a[i]= (int)(Math.random()*10);
			System.out.println(a[i]);
		}
		int[] b = new int[3];
		int[] c = new int[] {1,2,3,4,5};
		for (int i=0; i<c.length; i++) {
			//c[i]= (int)(Math.random()*10);
			System.out.println(c[i]);
		}
		int[] d = {1,2,3,4,5};
		for (int i=0; i<d.length; i++) {
			//d[i]= (int)(Math.random()*10);
			System.out.println(d[i]);
		}
		
		int[] e;
		int[] f;
		e = new int[] {1,2,3,4,5};
		//f = {1,2,3,4,5};
		
	}

}
