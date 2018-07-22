package tw.org.iii.mytest;

public class Alex07 {

	public static void main(String[] args) {
		int score = (int)(Math.random() *101);
			System.out.println(score);
			
		if (score >=90) {	
			System.out.println("A");
		}else if (score >=80) {
			System.out.println("B");
			score = 58;
		}else if (score >=70) {
			System.out.println("C");
		}else if (score >=60) {
			System.out.println("D");
		}else {
			System.out.println("FAIL");
		}
		
		System.out.println(score);
	}
}
		
	

