package com.drew.csci151.corejava.classesandobjects;

//Class runner
public class PictureRunner {

	public static void main(String[] args) {

		// Class Declaration
		Picture art;

		// Object Initialization & show constructors
		art = new Picture();
		Picture art2 = new Picture(7, 8, 2.3, "Good Art Pic");
		Picture art3 = new Picture(2, 3, 1.3);
		
		// Show messages and methods
		art.setLength(8);		
		art.setContrast(5.5);
		
		// Use getters and toString to print to console
		System.out.println(art.getLength());
		System.out.println(art2.getLength());
		System.out.println(art3.getLength());
		System.out.println(art.toString());

	}

}
