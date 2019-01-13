import java.util.Random;

public class deck extends franzBlatt{
	
	//Array fuer Kartenindex zum Mischen
	public void mischen() {
		
		Random rgen = new Random();  // Random number generator			
		
		//Array befuellen
		//for (int i = 0; i < super.card.length; i++) {
		//	this.cardIndent[i] = i;
		//}
		
		//Werte zufaellig anordnen
		//Quelle: https://www.programcreek.com/2012/02/java-method-to-shuffle-an-int-array-with-random-order/
		for (int i=0; i < super.karten.length; i++) {
		    int randomPosition = rgen.nextInt(super.karten.length);
		    card temp = super.karten[i];
		    super.karten[i] = super.karten[randomPosition];
		    super.karten[randomPosition] = temp;
		}
	}
}
