import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.utility.Delay;

public class IRChecker extends Thread {
	private EV3IRSensor infraredSensor;
	private Shapes shapes;
	private Letters letters;
	private Motors motors;
	
	private int radius = 40;
	private int smoothness = 5;
	private int size = 750;
	private int letterSize = 450;
	private int angle = 180;
	private int delay = 250;
	
	private int kirjainValinta = 1;
	
	public IRChecker(EV3IRSensor sensor, Shapes shapes, Letters letters, Motors motors){
		this.infraredSensor = sensor;
		this.shapes = shapes;
		this.letters = letters;
		this.motors = motors;
	}
	
	public void run(){//RemoteCommand(#) on kanava 0-3 remotecommand on säätimen nappi 1-11, 9 varattu
		// hakee napin ja katsoo onko nappia painettu
		try {
			boolean running = true;
			while (running) {
				if (infraredSensor.getRemoteCommand(0) != 0) {
					int painike = infraredSensor.getRemoteCommand(0);
					switch(painike) {
						// ylös vasen nappi, robotista pois = forward
						case 1:
							while (painike == infraredSensor.getRemoteCommand(0)) {
								motors.goForward();
							}
							break;
						
						// alas vasen nappi, robottiin päin = backward
						case 2:
							while (painike == infraredSensor.getRemoteCommand(0)) {
								motors.goBackward();
							}
							break;
							
						// oikea ylös nappi, robotista oikealle = right
						case 3:
							while (painike == infraredSensor.getRemoteCommand(0)) {
								motors.goLeft();
							}
							break;
							
						// oikea alas nappi, robotista vasemmalle = left
						case 4:
							while (painike == infraredSensor.getRemoteCommand(0)) {
								motors.goRight();
							}
							break;
					}
					
					motors.stop();
				} else if (infraredSensor.getRemoteCommand(1) != 0) {
					switch(infraredSensor.getRemoteCommand(1)) {
						// vasen ylös, kolmio
						case 1:
							shapes.kolmio(size);
							break;
							
						// vasen alas, neliö
						case 2:
							shapes.nelio(size);
							break;
							
						// oikea ylös, salmiakki
						case 3:
							shapes.salmiakki(size);
							break;
							
						// oikea alas, ympyrä
						case 4:
							shapes.ympyra(radius, smoothness);
							break;
					}
				} else if (infraredSensor.getRemoteCommand(2) != 0) {
					switch(infraredSensor.getRemoteCommand(2)) {
						// vasen ylös, nosta valintaa
						case 1:
							kirjainValinta++;
							if (kirjainValinta > 26) {
								kirjainValinta = 1;
							}
							Delay.msDelay(delay);
							break;
							
						// vasen alas, vähennä valintaa
						case 2:
							kirjainValinta--;
							if (kirjainValinta < 1) {
								kirjainValinta = 26;
							}
							Delay.msDelay(delay);
							break;
							
						// oikea ylös, piirrä kirjain
						case 3:
							letters.drawLetter(kirjainValinta, letterSize);
							break;
							
						// oikea alas, siirrä kirjoituskohtaa
						case 4:
							motors.lift();
							motors.rotate(angle, angle);
							motors.lower();
							break;
					}
				} else {
					while (Button.DOWN.isDown()) {
						motors.goForward();
					}
					motors.stop();
					while (Button.UP.isDown()) {
						motors.goBackward();
					}
					motors.stop();
					while (Button.RIGHT.isDown()) {
						motors.goLeft();
					}
					motors.stop();
					while (Button.LEFT.isDown()) {
						motors.goRight();
					}
					motors.stop();
					if (Button.ENTER.isDown()) {
						running = false;
					}
				}
				
				LCD.clear();
				// tekstit tähän
				LCD.drawString("Kanava 0: Manuaali", 0, 0);
				LCD.drawString("Kanava 1: Kuviot", 0, 1);
				LCD.drawString("Kanava 2: Kirjaimet", 0, 2);
				String teksti = "";
				// tarkista mikä kirjain nyt valittuna
				switch(kirjainValinta) {
					case 1: teksti = "A"; break;
					case 2: teksti = "B"; break;
					case 3: teksti = "C"; break;
					case 4: teksti = "D"; break;
					case 5: teksti = "E"; break;
					case 6: teksti = "F"; break;
					case 7: teksti = "G"; break;
					case 8: teksti = "H"; break;
					case 9: teksti = "I"; break;
					case 10: teksti = "J"; break;
					case 11: teksti = "K"; break;
					case 12: teksti = "L"; break;
					case 13: teksti = "M"; break;
					case 14: teksti = "N"; break;
					case 15: teksti = "O"; break;
					case 16: teksti = "P"; break;
					case 17: teksti = "Q"; break;
					case 18: teksti = "R"; break;
					case 19: teksti = "S"; break;
					case 20: teksti = "T"; break;
					case 21: teksti = "U"; break;
					case 22: teksti = "V"; break;
					case 23: teksti = "W"; break;
					case 24: teksti = "X"; break;
					case 25: teksti = "Y"; break;
					case 26: teksti = "Z"; break;
				}
				LCD.drawString(teksti, 0, 3);
				LCD.refresh();
			}
		} catch (Exception e) {
			// aaaaaaaaaaaa
		}
	}
}