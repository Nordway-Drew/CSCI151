package com.drew.csci151.corejava.flowcontrol;

public class If_else {

	public static void main(String[] args) {
//		if (condition1) {
//			// this code will execute if condition1 a strict true boolean
//		} else if (condition2) {
//			// this code will execute if condition2 a strict true boolean
//			// and condition1 is a strict false boolean
//		} else {
//			// this code will execute if neither condition1 or condition2
//			// are strict true booleans
//		}
		
		
		int x = 9;
		if (x>5) {
			// this code will execute if condition1 a strict true boolean
			System.out.println("x is > 5");
		} else if (x<5) {
			// this code will execute if condition2 a strict true boolean
			// and condition1 is a strict false boolean
			System.out.println("x is < 5");
		} else {
			// this code will execute if neither condition1 or condition2
			// are strict true booleans
			System.out.println("x is = 5");
		}

		
		// Nesting if statements can test conditions that are reliant on the
		// state of other conditions
		x = 55;
		if (x > 50) {
			if (x >= 60) {
				System.out.println("X is greater than 50 and 60");
				// this code will execute if condition1 and condition2 are
				// strict true booleans
			} else {
				System.out.println("X is greater than 50 but less than 60");
				// this code will execute if condition1 is a strict true
				// boolean, and condition2 is a strict false boolean
			}
		} else {
			System.out.println("X is less than 50");
			// this code will execute if condition1 is a strict false boolean,
			// but has no relationship to condition2

		//Conditionals: Logical Operators
		/*
		Logical operators can be used to check the conditions on primitive data types
		<  ➙ Less than
		>  ➙ Greater than
		<= ➙ Less than or equal to
		>= ➙ Greater than or equal to
		== ➙ Equal to (NOTE: This compares memory locations)
		!= ➙ Not equal to
		!  ➙ Not (reverses a boolean)
		&& ➙ And (True if Both booleans are true)
		|| ➙ Or (True if at least one boolean is true)
		^  ➙ XOR (True if one boolean is true and the other false)
		*/
		
			if (20<30) System.out.println("Less Than");
			if (20>30) System.out.println("");
			if (20<=30) System.out.println("");
			if (20>=30) System.out.println("");	
			if (20==30) System.out.println("");
			if (20!=30) System.out.println("");
			if (!false) System.out.println("");
			if (true && true) System.out.println("");
			if (true || false) System.out.println("");
			if (true ^ false) System.out.println("");
			
		
		
		
		}

}
}
