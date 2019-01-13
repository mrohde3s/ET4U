import java.util.Random;

public class deck extends spielkarten{
	
	//Array fuer Kartenindex zum Mischen
	int[] cardIndent = new int[super.NumOfCards];
	
	public void mischen() {
		
		Random rgen = new Random();  // Random number generator			
		
		//Array befuellen
		for (int i = 0; i < this.cardIndent.length; i++) {
			this.cardIndent[i] = i;
		}
		
		//Werte zufaellig anordnen
		//Quelle: https://www.programcreek.com/2012/02/java-method-to-shuffle-an-int-array-with-random-order/
		for (int i=0; i < this.cardIndent.length; i++) {
		    int randomPosition = rgen.nextInt(this.cardIndent.length);
		    int temp = cardIndent[i];
		    this.cardIndent[i] = this.cardIndent[randomPosition];
		    this.cardIndent[randomPosition] = temp;
		}
	}
}
