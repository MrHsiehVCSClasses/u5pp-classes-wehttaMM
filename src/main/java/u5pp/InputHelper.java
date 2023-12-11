package u5pp;

import java.util.Scanner;

public class InputHelper {
	public Scanner input;
	public String a;
	public int num;
	
	public InputHelper(Scanner scanner) {
		this.input = scanner;
	}

	/**
	 *
	 * @param prompt
	 * @return
	 */
	public boolean getYesNoInput(String prompt) {
		System.out.println(prompt);
		this.a = input.nextLine().toLowerCase();
		if (this.a.startsWith("n")) {
			System.out.println("working");
		}
		while (!((this.a.startsWith("y")) || (a.startsWith("n")))){
			System.out.println("Invalid input- try again");
			System.out.println("please answer '(y)es' or '(n)o'");
			if(this.a.startsWith("y")){
				return true;
			}
		}
		if (this.a.startsWith("n")) {
			return false;
		}
		else {
			return false;
		}
		 
	}

	/**
	 *
	 * @param prompt
	 * @param min
	 * @param max
	 * @return
	 */
	public  int getIntegerInput(String prompt, int min, int max) {
		System.out.println(prompt);
		this.num = this.input.nextInt();
		while ((this.num < min) || (this.num > max)) {
			if (this.num < min) {
				System.out.println("Invalid input - too low, please try again");
			}
			else {
				System.out.println("Invalid input - too high, please try again");
			}
			this.num = this.input.nextInt();
		}
		return this.num;
	}






}


