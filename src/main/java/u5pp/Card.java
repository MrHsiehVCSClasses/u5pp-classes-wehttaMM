package u5pp;

/**
 *
 */
public class Card {
	public String value = "2";
	public String suit ="clubs";
	public Card() {

	}

	/**
	 *
	 * @param suit
	 */
	public Card(String suit) {
		String checkSuit = "";
		checkSuit = suit.toLowerCase();
		if ((checkSuit.equals("clubs")) || (checkSuit.equals("diamonds")) 
				|| (checkSuit.equals("hearts")) || (checkSuit.equals("spades"))) {
			this.suit = checkSuit;
		}
		else {
			this.suit = "clubs";
		}
	}

	/**
	 *Card
	 * @param suit
	 * @param value
	 */
	public Card(String suit, String value){
		String checkSuit;
		checkSuit = suit.toLowerCase();
		if ((checkSuit.equals("clubs")) || (checkSuit.equals("diamonds")) 
				|| (checkSuit.equals("hearts")) || (checkSuit.equals("spades"))) {
			this.suit = checkSuit;
		}
		else {
			this.suit = "clubs";
		}
		String checkValue = value.toLowerCase();
		if ((checkValue.equals("2")) || (checkValue.equals("3")) 
				|| (checkValue.equals("4")) || (checkValue.equals("5")) 
				|| (checkValue.equals("6")) || (checkValue.equals("7")) 
				|| (checkValue.equals("8")) || (checkValue.equals("9")) 
				|| (checkValue.equals("10")) || (checkValue.equals("jack")) 
				|| (checkValue.equals("queen")) || (checkValue.equals("king")) 
				|| (checkValue.equals("ace"))) {
			this.value = checkValue;
		}

	}

	/**
	 *
	 * @return
	 */
	public String getValue() {
		return this.value;
	}

	/**
	 *
	 * @return
	 */
	public String getSuit() {
		return this.suit;
	}

	/**
	 *
	 * @return
	 */
	public String toString() {
		return "The " + this.value + " of " + this.suit;
	}

	/**
	 *
	 * @param c
	 * @return
	 */
	public boolean equals(Card c) {
		if ((this.value.equals(c.value)) && (this.suit.equals(c.suit))) {
			return true;
		}
		else {return false;}
	}

	/**
	 *
	 * @param suit
	 */
	public void changeSuit(String suit) {
		String checkSuit="";
		checkSuit = suit.toLowerCase();
		// checkSuit is clubs or diamonds
		if ((checkSuit.equals("clubs")) || (checkSuit.equals("diamonds")) 
				|| (checkSuit.equals("hearts")) || (checkSuit.equals("spades"))) {
			this.suit = checkSuit;
		}	
	}

	/**
	 *
	 * @param value
	 */
	public void changeValue(String value) {
		String checkValue ="";
		checkValue = value.toLowerCase();
		if ((checkValue.equals("2")) || (checkValue.equals("3")) 
				|| (checkValue.equals("4")) || (checkValue.equals("5")) 
				|| (checkValue.equals("6")) || (checkValue.equals("7")) 
				|| (checkValue.equals("8")) || (checkValue.equals("9")) 
				|| (checkValue.equals("10")) || (checkValue.equals("jack")) 
				|| (checkValue.equals("queen")) || (checkValue.equals("king")) 
				|| (checkValue.equals("ace"))) {
			this.value = checkValue;
		}
	}
}
