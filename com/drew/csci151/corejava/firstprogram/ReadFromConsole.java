package com.drew.csci151.corejava.firstprogram;

import java.util.Scanner;

// Simple program to use scanner for user input and print it back to the console
public class ReadFromConsole {

	public static void main(String[] args) {

		//create  scanner object
		Scanner input = new Scanner(System.in);
		//prompt user for input
		System.out.println("Enter value: ");
		//read from console
		String storedInput = input.nextLine();
		//output input
		System.out.println("Your input was: " + storedInput);
		//close scanner
		input.close();

	}

}