package tw.org.iii.mytest;
//import except java.lang

public class Bike {
	private double speed;//public protected "null" private
	
	Bike(){
		speed = 0;
	}
	
	Bike(double speed){
		this.speed = speed;
	}
	
	void upSpeed() {
		speed = speed==0?1:speed*1.4;
	}
	
	void upSpeed(int gear) {
		speed = speed==0?1:speed*1.2+gear*2;
	}

	void downSpeed() {
		speed = speed<=0.5?0:speed*0.6;
	}
	
	double getSpeed() {
		return speed;
	}
}
