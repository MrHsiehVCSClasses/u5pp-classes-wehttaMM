package u5pp;

import java.util.Random;

public class Dice {
	public int numSides = 6; //numSides
	public int currentSide = 1; //currentSide
	public String color = "green"; //color
	
	public Dice() {

	}

	/**
	 *
	 * @param numSides
	 */
	public Dice(int numSides) {
		this.numSides = numSides;
	}

	/**
	 *
	 * @param numSides
	 * @param currentSide
	 */
	public Dice(int numSides, int currentSide) {
		this.numSides = numSides;
		this.currentSide = currentSide;
		//If the current number is greater than the total number of faces, reset to 1
		if (currentSide > numSides) {
			this.currentSide = 1;
		}
	}

	/**
	 *
	 * @param numSides
	 * @param currentSide
	 * @param color
	 */
	public Dice(int numSides, int currentSide, String color) {
		this.numSides = numSides;
		this.currentSide = currentSide;
		this.color = color;
		//If the current number is greater than the total number of faces, reset to 1
		if (currentSide > numSides) {
			this.currentSide = 1;
		}
	}

	/**
	 *
	 * @return numSides
	 */
	public int getSides() {
		return this.numSides;
	}

	/**
	 *
	 * @return currentSide
	 */
	public int getCurrentSide() {
		return this.currentSide;
	}

	/**
	 *
	 * @return color
	 */
	public String getColor() {
		return this.color;
	}

	/**
	 *
	 * @return String
	 */
	public String toString() {
		return "The " + color + " " + numSides+"-sided dice is showing " + getCurrentSide();
	}

	/**
	 *
	 * @param d
	 * @return bool
	 */
	public boolean equals(Dice d) {
		if (d.getCurrentSide() == this.currentSide) {
			return true;
		}
		else {return false;}
	}

	/**
	 *
	 * @return int
	 */
	public int roll() {
		int currentSide = new Random().nextInt(this.numSides)+1;
		return currentSide;
	}

	/**
	 *
	 * @param num
	 */
	public void changeSide(int num){
		if ((num >= 1) && (num <= this.numSides)) {
			this.currentSide = num;
		}
	}

	/**
	 *
	 * @param color
	 */
	public void changeColor(String color) {
		this.color = color;
	}

	/**
	 *
	 * @param num
	 */
	public void changeNumSides(int num) {
		this.numSides = num;
	}
	
}
