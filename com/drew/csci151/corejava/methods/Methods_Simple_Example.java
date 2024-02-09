package com.drew.csci151.corejava.methods;

public class Methods_Simple_Example {

	public static void main(String[] args) {
		// Call the method 'addNumbers' and pass 10 and 20 as parameters
		int sum = addNumbers(10, 20);

		// Print the sum
		System.out.println("The sum is: " + sum);

		// Call the method 'sayHello' with the name 'John'
		sayHello("John");
	}

	// Method to add two numbers
	public static int addNumbers(int num1, int num2) {
		int result = num1 + num2; // Add the two numbers
		return result; // Return the result
	}

	// Method to display a greeting message
	public static void sayHello(String name) {
		System.out.println("Hello, " + name + "!");
	}

}