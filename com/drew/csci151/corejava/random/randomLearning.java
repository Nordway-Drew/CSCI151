package com.drew.csci151.corejava.random;

import java.util.Random;

public class randomLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Random rand = new Random();
		for (int i = 0; i < 10; i += 1) {
			System.out.println(rand.nextInt());
		}
	}

}
