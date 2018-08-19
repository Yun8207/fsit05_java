package tw.org.iii.mytest;

public class Alex76 {
	
	public static void main(String[] args) {
		Alex761 t1 = new Alex761("a");
		Alex761 t2 = new Alex761("b");
		t1.start();
		t2.start();
		System.out.println("OK");
		try {
			Thread.sleep(3*1000);
		}catch(Exception e) {
			
		}
		System.out.println("wakeup");
		t1.run();
		t2.run();
	}

}
class Alex761 extends Thread {
	String name;
	Alex761(String name){this.name = name;}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
	}
}