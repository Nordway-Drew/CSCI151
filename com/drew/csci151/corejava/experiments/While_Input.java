package com.drew.csci151.corejava.experiments;

import java.util.Scanner;

public class While_Input {

	public static void main(String[] args) {

//		Scanner Input = new Scanner(System.in);
//		int counter = 1;
//		while (counter < 10) {
//			System.out.println("Enter a value, if its less then 10 ill ask again: ");
//
//			// will work unless the input is not an int, if not int program will stop
//			//counter = Input.nextInt();
//
//			System.out.println("What number did i entered: " + counter);
//		}
//
//		Input.close();

		Scanner input = new Scanner(System.in);
		int counter = 1;
		while (counter < 10) {
			System.out.println("Enter a value, if its less then 10 I'll ask again: ");

			// Check if the next input is an integer
			if (input.hasNextInt()) {
				counter = input.nextInt(); // If it is an int, read it
			} else {
				System.out.println("That's not a valid number. Please enter a valid integer.");
				input.next(); // Consume the invalid input and prompt again
				continue; // Skip the rest of the loop and prompt again
			}

			System.out.println("What number did I enter: " + counter);
		}

		input.close();

	}

}
