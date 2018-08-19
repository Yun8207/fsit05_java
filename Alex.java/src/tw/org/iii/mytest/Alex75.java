package tw.org.iii.mytest;

import java.util.Timer;
import java.util.TimerTask;

public class Alex75 {

	public static void main(String[] args) {
		Timer timer = new Timer(false);
		MyTask myTask = new MyTask();
		//StopTimer stopTimer = new StopTimer(timer);
		timer.schedule(myTask, 3*1000, 1*1000);
		//timer.schedule(stopTimer, 10*1000);
		System.out.println("here");
		//timer.cancel();
		

	}

}
class MyTask extends TimerTask {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("OK");
	}

}

class StopTimer extends TimerTask{
	Timer timer;
	StopTimer(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		System.exit(0);
		
	}
	
}