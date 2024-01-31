package com.drew.csci151.corejava.flowcontrol;

public class Switch {

	public static void main(String[] args) {

		// Note the break statements. Without them, the switch
		// will execute all code following the matching condition

		//Switch using int condition
		int i = 39;
		switch (i) {
		case 30:
			// code
			System.out.println("Case 30");
			break;
		case 31:
			// code
			System.out.println("Case 31");
			break;

		default:
			// This code will run if neither
			// condition1 or condition2 is met
			System.out.println("This is the default");

		}
		//Switch using char condition
		char c = 'b';
		switch (c) {
		case 'a':
			System.out.println("Case a");
			break;
		case 'b':
			System.out.println("Case b");
			break;
		case 'c':
			System.out.println("Case c");
			break;
		case 'd':
			System.out.println("Case d");
			break;
		default:
			System.out.println("This is the default");

		}

	}

}
