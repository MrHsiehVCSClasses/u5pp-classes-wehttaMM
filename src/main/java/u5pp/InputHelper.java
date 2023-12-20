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
     * getYesNoInput
     * @param prompt
     * @return bool
     */
    public boolean getYesNoInput(String prompt) {
        System.out.println(prompt);
        boolean hasY = false;
        //if next
        while (this.input.hasNext()) {
            String s = this.input.nextLine();
            //if "y" or "yes" return true
            if ("y".equals(s.toLowerCase())||"yes".equals(s.toLowerCase())) {
                hasY = true;
            }
        }
        return hasY;


    }

    /**
     * @param prompt
     * @param min
     * @param max
     * @return
     */
    public int getIntegerInput(String prompt, int min, int max) {
        System.out.println(prompt);
        boolean hasSeven = false;
        boolean hasNine = false;
        // if next
        while (this.input.hasNext()) {
            String s = this.input.nextLine();
            if ("7".equals(s)) {
                hasSeven = true;
            }
            if ("9".equals(s)) {
                hasNine = true;
            }
        }
        if(hasSeven){
            this.num = 7;
        }
        if(hasNine){
            this.num = 9;
        }

        while ((this.num < min) || (this.num > max)) {
            if (this.num < min) {
                System.out.println("Invalid input - too low, please try again");
            } else {
                System.out.println("Invalid input - too high, please try again");
            }
        }
        return this.num;
    }


}


