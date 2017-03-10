/**
 * Piirt‰‰ eri kirjaimia
 * @author anttijuj
 *
 */

public class Letters {
	private PenController penController;
	
	public Letters(PenController penController) {
		this.penController = penController;
	}

/**
 * Piirt‰‰ yhden annetun kirjaimen alkaen suunnilleen kirjaimen alaosasta tietyll‰ koolla
 * @param letter String, "a", "b", "c", ..., "x", "y", "z"
 * @param size float, kirjaimen koko (yhden liikkeen aika, hyv‰ size noin 50-1000)
 */
	
	public void drawLetter(int letterNumber, float size) {
		float mp = 35;
		switch(letterNumber) {
			case 1:
				penController.drawLine("eteen", size);
				penController.drawLine("oikea", size / 2);
				penController.drawLine("taakse", size);
				penController.drawLine("eteen", size / 2);
				penController.drawLine("vasen", size / 2);
				break;
				
			case 2:
				penController.drawLine("eteen", size);
				penController.drawCurve(1, 0, (size / mp), 5);
				penController.drawCurve(2, 0, (size / mp), 5);
				penController.drawCurve(1, 0, (size / mp), 5);
				penController.drawCurve(2, 0, (size / mp), 5);
				break;
				
			case 3:
				penController.drawCurve(3, 0, (size / mp) * 2, 5);
				penController.drawCurve(0, 0, (size / mp) * 2, 5);
				break;
				
			case 4:
				penController.drawLine("eteen", size);
				penController.drawCurve(1, 0, (size / mp) * 2, 5);
				penController.drawCurve(2, 0, (size / mp) * 2, 5);
				break;
				
			case 5:
				penController.drawLine("vasen", size / 2);
				penController.drawLine("eteen", size / 2);
				penController.drawLine("oikea", size / 2);
				penController.drawLine("vasen", size / 2);
				penController.drawLine("eteen", size / 2);
				penController.drawLine("oikea", size / 2);
				break;
				
			case 6:
				penController.drawLine("eteen", size / 2);
				penController.drawLine("oikea", size / 2);
				penController.drawLine("vasen", size / 2);
				penController.drawLine("eteen", size / 2);
				penController.drawLine("oikea", size / 2);
				break;
				
			case 7:
				penController.drawLine("eteen", size / 2);
				penController.drawLine("vasen", size / 4);
				penController.drawLine("oikea", size / 4);
				penController.drawLine("taakse", size / 2);
				penController.drawCurve(3, 0, (size / mp) * 2, 5);
				penController.drawCurve(0, 0, (size / mp) * 2, 5);
				break;
				
			case 8:
				penController.drawLine("eteen", size);
				penController.drawLine("taakse", size / 2);
				penController.drawLine("oikea", size / 2);
				penController.drawLine("eteen", size / 2);
				penController.drawLine("taakse", size);
				break;
				
			case 9:
				penController.drawLine("eteen", size);
				break;
				
			case 10:
				penController.drawCurve(2, 1, (size / mp), 5);
				penController.drawCurve(1, 1, (size / mp), 5);
				penController.drawLine("eteen", size / 1.5);
				break;
				
			case 11:
				penController.drawLine("eteen", size);
				penController.drawLine("taakse", size / 2);
				penController.drawLine("etuoikea", size / 2);
				penController.drawLine("takavasen", size / 2);
				penController.drawLine("takaoikea", size / 2);
				break;
				
			case 12:
				penController.drawLine("taakse", size);
				penController.drawLine("oikea", size / 2);
				break;
				
			case 13:
				penController.drawLine("eteen", size);
				penController.drawLine("takaoikea", size / 2);
				penController.drawLine("etuoikea", size / 2);
				penController.drawLine("taakse", size);
				break;
				
			case 14:
				penController.drawLine("eteen", size);
				penController.drawLine("takaoikea", size * 1.4);
				penController.drawLine("eteen", size);
				break;
				
			case 15:
				penController.drawCurve(3, 0, (size / mp) * 2, 5);
				penController.drawCurve(0, 0, (size / mp) * 2, 5);
				penController.drawCurve(1, 0, (size / mp) * 2, 5);
				penController.drawCurve(2, 0, (size / mp) * 2, 5);
				break;
				
			case 16:
				penController.drawLine("eteen", size);
				penController.drawCurve(1, 0, (size / mp), 5);
				penController.drawCurve(2, 0, (size / mp), 5);
				break;
				
			case 17:
				penController.drawCurve(3, 0, (size / mp) * 2, 5);
				penController.drawCurve(0, 0, (size / mp) * 2, 5);
				penController.drawCurve(1, 0, (size / mp) * 2, 5);
				penController.drawCurve(2, 0, (size / mp) * 2, 5);
				penController.drawLine("takaoikea", size / 4);
				break;
				
			case 18:
				penController.drawLine("eteen", size);
				penController.drawCurve(1, 0, (size / mp), 5);
				penController.drawCurve(2, 0, (size / mp), 5);
				penController.drawLine("takaoikea", size / 1.4);
				break;
				
			case 19:
				penController.drawCurve(3, 0, (size / mp) * 2, 5);
				penController.drawCurve(2, 1, (size / mp) * 2, 5);
				penController.drawCurve(1, 1, (size / mp) * 2, 5);
				penController.drawCurve(0, 1, (size / mp) * 2, 5);
				penController.drawCurve(3, 0, (size / mp) * 2, 5);
				penController.drawCurve(0, 0, (size / mp) * 2, 5);
				penController.drawCurve(1, 0, (size / mp) * 2, 5);
				break;
				
			case 20:
				penController.drawLine("eteen", size);
				penController.drawLine("vasen", size / 2);
				penController.drawLine("oikea", size);
				break;
				
			case 21:
				penController.drawLine("eteen", size / 2);
				penController.drawLine("taakse", size / 2);
				penController.drawCurve(2, 0, (size / mp) * 2, 5);
				penController.drawCurve(3, 0, (size / mp) * 2, 5);
				penController.drawLine("eteen", size / 2);
				break;
				
			case 22:
				penController.drawLine("takaoikea", size * 1.4);
				penController.drawLine("etuoikea", size * 1.4);
				break;
				
			case 23:
				penController.drawLine("takaoikea", size * 1.4);
				penController.drawLine("etuoikea", size / 1.4);
				penController.drawLine("takaoikea", size / 1.4);
				penController.drawLine("etuoikea", size * 1.4);
				break;
				
			case 24:
				penController.drawLine("takaoikea", size * 1.4);
				penController.drawLine("etuvasen", size / 1.4);
				penController.drawLine("takavasen", size / 1.4);
				penController.drawLine("etuoikea", size * 1.4);
				break;
				
			case 25:
				penController.drawLine("eteen", size / 2);
				penController.drawLine("etuvasen", size / 1.4);
				penController.drawLine("takaoikea", size / 1.4);
				penController.drawLine("etuoikea", size / 1.4);
				break;
				
			case 26:
				penController.drawLine("vasen", size / 2);
				penController.drawLine("etuoikea", size * 1.4);
				penController.drawLine("vasen", size / 2);
				break;
		}
	}
}