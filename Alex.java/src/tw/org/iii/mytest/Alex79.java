package tw.org.iii.mytest;

public class Alex79 {

	public static void main(String[] args) {
		Alex791 obj1 = new Alex791("A");
		obj1.start();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {}
		
		Alex791 obj2 = new Alex791("B");
		obj2.start();
		
		//obj2.run();//can't be interrupt
		try {
			obj2.join(2000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("OK");
	}

}
class Alex791 extends Thread {
	String name;
	Alex791(String name){this.name = name;}
	@Override
	public void run() {
		try {
			for(int i=1; i<10; i++) {
				System.out.println(name + ":" + i);
//				if(i % 3 ==0) {
//					Alex791 obj2 = new Alex791(name+i);
//					obj2.start();
//				}else {
//					Thread.sleep(500);
//				}
				Thread.sleep(500);
			}
		}catch(Exception e) {
			
		}
	}
		
}