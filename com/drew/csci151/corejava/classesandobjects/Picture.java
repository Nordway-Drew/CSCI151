package com.drew.csci151.corejava.classesandobjects;

//Class
public class Picture {

	// Attributes
	private int length;
	private int width;
	private double contrast;
	private String title;

	// Constructor
	// Default
	public Picture() {
		super();
		this.length = -1;
		this.width = -1;
		this.contrast = -1;
		this.title = "";
	}

	// With Arguments
	public Picture(int length, int width, double contrast, String title) {
		super();
		// if we wanted to construct pictures only lager than 10 otherwise set default 10
//		if (length < 10) {
//			this.length = 10;
//		} else {
//			this.length = length;
//		}
		this.length = length;
		this.width = width;
		this.contrast = contrast;
		this.title = title;
	}

	public Picture(int length, int width, double contrast) {
		super();
		this.length = length;
		this.width = width;
		this.contrast = contrast;

	}

	// Methods

	@Override
	public String toString() {
		return "Picture [length=" + length + ", width=" + width + ", contrast=" + contrast + ", title=" + title + "]";
	}

	// Method to be overridden later
	public void move() {
		System.out.println("The animal moves.");
	}

	// Getters and Setters

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the contrast
	 */
	public double getContrast() {
		return contrast;
	}

	/**
	 * @param contrast the contrast to set
	 */
	public void setContrast(double contrast) {
		this.contrast = contrast;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
