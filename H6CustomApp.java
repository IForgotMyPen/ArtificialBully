///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           descriptive title of the program making use of this file
// Course:          course number, term, and year
//
// Author:          your name
// Email:           your @wisc.edu email address
// Lecturer's Name: name of your lecturer
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples (REMOVE in your code - unless Jane Doe helped you and you helped John Doe accordingly):
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
///////////////////////////////// REFLECTION ///////////////////////////////////
//
// 1. What specific errors did you have when you were developing this program? TODO
// 2. How did you resolve these errors? TODO
// 3. What was the hardest part of this assignment for you? TODO
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;
import java.util.Random;

public class H6CustomApp {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Random randGen = new Random();

        String userInput;
        int randVal;
        char modifiedInput;
        boolean validInput = false;

        do {
            System.out.println("Say something!");
            if (input.hasNext()) {

                userInput = input.nextLine();
                if (!userInput.isEmpty()) {
                    validInput = true;
                    for (int i = 0; i < userInput.length(); i++) {
                        randVal = randGen.nextInt(2);
                        if (randVal == 0) {
                            modifiedInput = userInput.toUpperCase().charAt(i);
                        } else {
                            modifiedInput = userInput.toLowerCase().charAt(i);
                        }
                        System.out.print(modifiedInput);
                    }
                } else {
                    System.out.println("Not talking, huh?");
                    continue;
                }
                System.out.println();
                System.out.println("Yeah!! That's what you sound like, idiot!");
            } else {
                System.out.println();
                System.out.println("What?? Got nothing to say to me, punk?");
            }
        } while (!validInput && input.hasNext());

        input.close();
    }
}