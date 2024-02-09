package com.drew.csci151.corejava.classesandobjects;
/**
 *  This program simulates the rolling of dice.
 */

public class DiceDemo
{
   public static void main(String[] args)
   {
      final int DIE1_SIDES = 6;  // Number of sides for die #1
      final int DIE2_SIDES = 6;  // Number of sides for die #2
      
      // Create two instances of the Die class.
      Die die1 = new Die(DIE1_SIDES);
      Die die2 = new Die(DIE2_SIDES);
      
      // Display initial information.
      System.out.println("Let's roll the dice...");
                         
      // Roll the dice.
    
      die1.roll();
      die2.roll();
         
      // Display the values of the dice.
      System.out.println(die1.getValue() + " " + 
                         die2.getValue());
   }
}