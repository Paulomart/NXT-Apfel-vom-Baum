package cool.paul.ball;

import lejos.nxt.Motor;

public class Main {

	
	public static void main(String[] args) {
		Motor.A.setSpeed(10);
		Motor.B.setSpeed(10);
		// out of the box
		Motor.A.rotate(-100, true);
		Motor.B.rotate(-100, false);
		Motor.A.setSpeed(200);
		Motor.B.setSpeed(200);
		Motor.A.rotate(-500, true);
		Motor.B.rotate(-500, false);
		// turn
		right90();
		// 
		Motor.A.rotate(-2100, true);
		Motor.B.rotate(-2100, false);
		
		
		
		Motor.C.setSpeed(50);
		Motor.C.rotate(100);
		Motor.C.rotate(-100);
		
	}
	

	
	public static void right90() {
		Motor.A.rotate(320, true);
		Motor.B.rotate(-320, false);
	}
}
