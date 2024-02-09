package com.drew.csci151.corejava.strings;

public class StringExample {
	public class StringsExample {

		public static void main(String[] args) {
			
			String str = "123456";
			
			System.out.println("str.charAt(3) = " + str.charAt(3));
			
			// first parameter: index to start
			// second parameter: index to end before
			System.out.println("str.substring(1,4) = " 
					+ str.substring(1,4));
			System.out.println("str.substring(1) = " 
					+ str.substring(1));
			
			System.out.println("str.length() = " + str.length());
			
			String str2 = "   dkfjsl lsfjd 	jfldskj			  ";
			System.out.println("str2.trim() = |" + str2.trim() + "|");
			
			System.out.println("str + str2 = " + str + str2);
			System.out.println("str.concat(str2) = " + str.concat(str2));
			System.out.println("str = " + str);
			
			
			// comparing strings: equals()
			String strA = "Hello";
			String strB = "Hello";
			
			if(strA == strB) {
				System.out.println("strA equals strB");
			}
			else {
				System.out.println("strA doesn't equal strB");
			}
			
			String strC = "Hi";
			String strD = new String("Hi");
			
			if(strC == strD) {
				System.out.println("strC equals strD");
			}
			else {
				System.out.println("strC doesn't equal strD");
			}
			
			if(strC.equals(strD)) {
				System.out.println("strC actually equals strD");
			}
			else {
				System.out.println("strC doesn't really equal strD");
			}

		}

	}

}
