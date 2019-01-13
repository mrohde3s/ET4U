
public class franzBlatt {

	public final card[] karten = {
			new card("Pik-7", 7),
			new card("Pik-8", 8),
			new card("Pik-9", 9),
			new card("Pik-10", 10),
			new card("Pik-Bube", 10),
			new card("Pik-Dame", 10),
			new card("Pik-Koenig", 10),
			new card("Pik-Ass", 11),
			new card("Kreuz-7", 7),
			new card("Kreuz-8", 8),
			new card("Kreuz-9", 9),
			new card("Kreuz-10", 10),
			new card("Kreuz-Bube", 10),
			new card("Kreuz-Dame", 10),
			new card("Kreuz-Koenig", 10),
			new card("Kreuz-Ass", 11),
			new card("Herz-7", 7),
			new card("Herz-8", 8),
			new card("Herz-9", 9),
			new card("Herz-10", 10),
			new card("Herz-Bube", 10),
			new card("Herz-Dame", 10),
			new card("Herz-Koenig", 10),
			new card("Herz-Ass", 11),
			new card("Karo-7", 7),
			new card("Karo-8", 8),
			new card("Karo-9", 9),
			new card("Karo-10", 10),
			new card("Karo-Bube", 10),
			new card("Karo-Dame", 10),
			new card("Karo-Koenig", 10),
			new card("Karo-Ass", 11),
	};//Array mit Spielkarten
	
	public class card{
		
		String name;
		int punkte;//Punkte, die die Karte im Spiel bringt
		
		public card (String name, int punkte) {
			this.name = name;
			this.punkte = punkte;
		}
		
	}
	/*
	public class Pik_7 {
		static final int value = 7;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 0;//Identifier fuer Mischen etc.
	}
	public class Pik_8 {
		static final int value = 8;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 1;//Identifier fuer Mischen etc.
	}
	public class Pik_9 {
		static final int value = 9;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 2;//Identifier fuer Mischen etc.
	}
	public class Pik_10 {
		static final int value = 10;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 3;//Identifier fuer Mischen etc.
	}
	public class Pik_Bube {
		static final int value = 10;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 4;//Identifier fuer Mischen etc.
	}
	public class Pik_Dame {
		static final int value = 10;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 5;//Identifier fuer Mischen etc.
	}
	public class Pik_Koenig {
		static final int value = 10;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 6;//Identifier fuer Mischen etc.
	}
	public class Pik_Ass {
		static final int value = 11;
		static final String symbol = "Pik";
		static final String color = "bk";
		static final int ident = 7;//Identifier fuer Mischen etc.
	}
	//============================
	public class Kreuz_7 {
		static final int value = 7;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 8;//Identifier fuer Mischen etc.
	}
	public class Kreuz_8 {
		static final int value = 8;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 9;//Identifier fuer Mischen etc.
	}
	public class Kreuz_9 {
		static final int value = 9;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 10;//Identifier fuer Mischen etc.
	}
	public class Kreuz_10 {
		static final int value = 10;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 11;//Identifier fuer Mischen etc.
	}
	public class Kreuz_Bube {
		static final int value = 10;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 12;//Identifier fuer Mischen etc.
	}
	public class Kreuz_Dame {
		static final int value = 10;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 13;//Identifier fuer Mischen etc.
	}
	public class Kreuz_Koenig {
		static final int value = 10;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 14;//Identifier fuer Mischen etc.
	}
	public class Kreuz_Ass {
		static final int value = 11;
		static final String symbol = "Kreuz";
		static final String color = "bk";
		static final int ident = 15;//Identifier fuer Mischen etc.
	}
	//================================
	public class Herz_7 {
		static final int value = 7;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 16;//Identifier fuer Mischen etc.
	}
	public class Herz_8 {
		static final int value = 8;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 17;//Identifier fuer Mischen etc.
	}
	public class Herz_9 {
		static final int value = 9;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 18;//Identifier fuer Mischen etc.
	}
	public class Herz_10 {
		static final int value = 10;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 19;//Identifier fuer Mischen etc.
	}
	public class Herz_Bube {
		static final int value = 10;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 20;//Identifier fuer Mischen etc.
	}
	public class Herz_Dame {
		static final int value = 10;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 21;//Identifier fuer Mischen etc.
	}
	public class Herz_Koenig {
		static final int value = 10;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 22;//Identifier fuer Mischen etc.
	}
	public class Herz_Ass {
		static final int value = 11;
		static final String symbol = "Herz";
		static final String color = "rd";
		static final int ident = 23;//Identifier fuer Mischen etc.
	}
	//================================
	public class Karo_7 {
		static final int value = 7;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 24;//Identifier fuer Mischen etc.
	}
	public class Karo_8 {
		static final int value = 8;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 25;//Identifier fuer Mischen etc.
	}
	public class Karo_9 {
		static final int value = 9;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 26;//Identifier fuer Mischen etc.
	}
	public class Karo_10 {
		static final int value = 10;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 27;//Identifier fuer Mischen etc.
	}
	public class Karo_Bube {
		static final int value = 10;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 28;//Identifier fuer Mischen etc.
	}
	public class Karo_Dame {
		static final int value = 10;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 29;//Identifier fuer Mischen etc.
	}
	public class Karo_Koenig {
		static final int value = 10;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 30;//Identifier fuer Mischen etc.
	}
	public class Karo_Ass {
		static final int value = 11;
		static final String symbol = "Karo";
		static final String color = "rd";
		static final int ident = 31;//Identifier fuer Mischen etc.
	}
	
	public returnCard(int cardIdent) {
		switch (cardIdent) {
			case 0: return new Pik_7();
			case 1: return new Pik_8();
			case 2: return new Pik_9();
			case 3: return new Pik_10();
			case 4: return new Pik_Bube();
			case 5: return new Pik_Dame();
			case 6: return new Pik_Koenig();
			case 7: return new Pik_Ass();
			case 8: return new Kreuz_7();
			case 9: return new Kreuz_8();
			case 10: return new Kreuz_9();
			case 11: return new Kreuz_10();
			case 12: return new Kreuz_Bube();
			case 13: return new Kreuz_Dame();
			case 14: return new Kreuz_Koenig();
			case 15: return new Kreuz_Ass();
			case 16: return new Herz_7();
			case 17: return new Herz_8();
			case 18: return new Herz_9();
			case 19: return new Herz_10();
			case 20: return new Herz_Bube();
			case 21: return new Herz_Dame();
			case 22: return new Herz_Koenig();
			case 23: return new Herz_Ass();
			case 24: return new Karo_7();
			case 25: return new Karo_8();
			case 26: return new Karo_9();
			case 27: return new Karo_10();
			case 28: return new Karo_Bube();
			case 29: return new Karo_Dame();
			case 30: return new Karo_Koenig();
			case 31: return new Karo_Ass();
		}
	}*/
}
