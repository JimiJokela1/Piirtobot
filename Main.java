import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

// forward -> käsi liikkuu oikealle
// backward -> käsi liikkuu vasemmalle

public class Main {
	static Motors motors;
	static PenController penController;
	static Shapes shapes;
	static Letters letters;
	static IRChecker irs;
	static EV3IRSensor irSensor;
	
	public static void main(String[] args) {
		
		init();
		irs.start();
		
		while (true) {
			// rikkoo loopin ohjelman lopetettaessa
			if (Button.ENTER.isDown()) {
				break;
			}
		}
		
		//motors.resetPosition();
		LCD.clear();
		motors.close();
		irSensor.close();
	}
	
	static void init() {
		motors = new Motors();
		penController = new PenController(motors);
		shapes = new Shapes(penController);
		letters = new Letters(penController);
		irSensor = new EV3IRSensor(SensorPort.S1);
		irs = new IRChecker(irSensor, shapes, letters, motors);
	}
}