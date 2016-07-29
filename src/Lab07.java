
//TASK
//Write a program that will recognize invalid inputs when the user requests information about students in a class
//
//WHAT WILL THE APPLICATION DO?
//1. Provide information about students in a class
//2. Prompt the user to ask about a particular student
//3. Give proper responses according to user-submitted information
//4. Ask if user would like to learn about another student
//
//BUILD SPECIFICATIONS
//1. Account for invalid user input with exceptions
//2. Try to incorporate IndexOutOfBoundsException and IllegalArgumentException
//
//HINTS
//1. Make it easy for the user -- tell them what information is available
//2. Murach's Beginning Java - Chapters 6 and 16
//
//EXTENDED CHALLENGES
//Create other exceptions and catch those, too.

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
//be sure to give this a variable name when using

public class Lab07 {
	public static void main(String[] args) {
		// open scanner + close
		Scanner scan1 = new Scanner(System.in);

		// declare & initialize variables
		int studentNum = 0;
		int printStudentNum = 0;
		String learnMore = "yes";
		String homeTown = "hometown";
		String favFood = "favorite food";
		String favColor = "favorite color";
		String favAnimal = "favorite animal";

		// set additional parameters
		boolean play = true;

		// declare and instantiate arrays
		// String[ ] firstName = new String[firstName];

		// place student data into an array
		String[] firstName = { "Adam", "Beverly", "Chris", "David", "Eleanor", "Fiona" };
		String[] lastName = { "Arnold", "Barnes", "Carrington", "Davis", "Ellis", "Fields" };
		String[] homeTownInfo = { "Allentown, PA", "Boston, MA", "Chicago, IL", "Detroit, MI", "Eden Prairie, MN",
				"Fairfax, VA" };
		String[] favFoodInfo = { "Apples", "Bread", "Crab Legs", "Donuts", "Eggs", "Fish" };
		String[] favColorInfo = { "Aqua", "Burnt Sienna", "Charcoal", "Dandelion Yellow", "Emerald", "Fuschia" };
		String[] favAnimalInfo = { "Aarvark", "Bison", "Cat", "Dog", "Elephant", "Fox" };


		// address user and request input
		// use garbage line because you'll be switching data types later
		System.out.print(
				"Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-20): ");
		printStudentNum = scan1.nextInt();
		scan1.nextLine();
		studentNum = printStudentNum - 1;

		// opportunity to throw IndexOutOfBounds exception here
		while ((studentNum < 0) || (studentNum > 20)) {
			System.out.println("That student does not exist. Please try again. (enter a number 1-20): ");
			break;
		}

		while ((studentNum >= 0) && (studentNum <= 20)) {
			System.out.println(
					"Student " + printStudentNum + " is " + firstName[studentNum] + " " + lastName[studentNum] + ".");
			break;
		}

		//for(!learnMore.equalsIgnoreCase("exit"); ; ) {
		// for(play = true; studentNum < studentNum +1; ) {
		//for (int i = 0; i < firstName.length; i++) {
			// while (play) {
		System.out.println("What would you like to know about " + firstName[studentNum] + "? You can enter " + "\"hometown\""
							+ ", " + "favorite food\"" + ", " + "favorite color\"" + " or " + "favorite animal\"");
		learnMore = scan1.nextLine();

			if (learnMore.equalsIgnoreCase("hometown")) {
				System.out.print(firstName[studentNum] + " is from " + homeTownInfo[studentNum] + ". ");
				System.out.println(" What more would you like to know about " + firstName[studentNum] + "?");
				learnMore = scan1.nextLine();
			} else if (learnMore.equalsIgnoreCase("favorite food")) {
				System.out.print(favFoodInfo[studentNum] + "reall's favorite food is " + favFoodInfo[studentNum] + ". ");
				System.out.println("What else would you like to know about " + firstName[studentNum] + "?");
				learnMore = scan1.nextLine();
			} else if (learnMore.equalsIgnoreCase("favorite color")) {
				System.out.println(firstName[studentNum] + "'s favorite color is " + favColorInfo[studentNum] + ". ");
				System.out.println("Is there anyting else you'd like to know about " + firstName[studentNum] + "?");
				learnMore = scan1.nextLine();
			} else if (learnMore.equalsIgnoreCase("favorite animal")) {
				System.out.print(firstName[studentNum] + "'s favorite animal is the " + favAnimalInfo[studentNum] + ". ");
				System.out.println("Sounds like " + firstName[studentNum]
						+ " is a pretty interesting person. What more would you like to know about "
						+ firstName[studentNum] + "?");
				learnMore = scan1.nextLine();
			} else {
				System.out.println("I don't have that information. Please try again.");
			}

		System.out.println("Would you like to learn more about " + firstName[studentNum] + "? (yes or no)");

			if (learnMore.equalsIgnoreCase("yes")) {
				play = scan1.nextBoolean();
				scan1.nextLine();
				continue;
			} else {
				System.out.println("Would you like to learn about another student? (yes or no)");
				if (learnMore.equalsIgnoreCase("yes")) {
					play = scan1.nextBoolean();
					scan1.nextLine();
					continue;
				} else {
					System.out.println("Goodbye!");
					play = false;
				}

				if (learnMore.equalsIgnoreCase("yes")) {
					continue;
				} else {
					System.out.println("Goodbye!");
					play = false;
				}
				scan1.close();
			}
		}
	}
}

/******************************************************************************
 * /*Scanner scan = new Scanner(System.in);
 * 
 * try{ System.out.print("Please enter an number: "); int input =
 * scan.nextInt(); System.out.println(input); } catch(InputMismatchException e)
 * { System.out.println("You must enter a valid number! Contact Help Desk.");
 * //The example below allows users to reference the exception type when
 * reaching out to help desk //System.out.println("You must enter a valid
 * number! Contact Help Desk " + e);
 * 
 * }
 * 
 * scan.close();
 * 
 * }
 */
