package com.drew.csci151.corejava.firstprogram;

public class SimpleProgram {

	public static void main(String[] args) {
		// single line comment
		
		/*this is a 
		 * java doc
		 * comment
		 * */
		
		/*
		multi-line
		comment
		is here
		*/
		
		// print to console
		System.out.println("Hello");
		System.out.println("Hello2");
		System.out.print("Hello3");
		System.out.print("Hello4");
		System.out.println("Hello5");
		System.out.println("Hello6");
		
		
		
		/////////////////
		//  VARIABLES  //
		/////////////////
		
		// Text
		String str = "hello\nhello\nhello\thello";
		System.out.println("str = " + str);
		
		char c = 'a';
		System.out.println("c = " + c);
		
		
		// Number
		int i = 5; // whole numbers only
		System.out.println("int i = " + i);
		
		double d = 3.14;
		System.out.println("double d = " + d);
		
		float f = 2.108f;
		System.out.println("float f = " + f);
		
		// Boolean
		boolean b = false;
		System.out.println("boolean b = " + b);
		
		
		/////////////////
		//  CONSTANTS  //
		/////////////////
		
		final int num1 = 8;
		System.out.println(num1);
		// num1 = 3; // nope
		
		
		///////////////////////////
		// ORDER OF OPERATIONS  //
		//////////////////////////
		
		// parenthesis, div/multi, add/sub
		
		System.out.println(3 + 4 * 5); // 23
		
		System.out.println((3 + 4) * 5 ); // print 35
		
		// print numbers and strings
		
		System.out.println("Hello" + 4 * 2);
		System.out.println("Hello" + 4 + 2);
		System.out.println("Hello" + (4 + 2));

		System.out.printf("the tip");



	}

}
