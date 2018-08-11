package P2;

import P1.Alex01;
public class Alex03 extends Alex01 {
	int m1() { //can't override another package's void method
		return 1; 
	}
	
	protected void m2() {  //protected- can override by same package and extending method
		
	}
}
