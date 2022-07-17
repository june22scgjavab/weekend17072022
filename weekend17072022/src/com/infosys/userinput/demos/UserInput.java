package com.infosys.userinput.demos;

import java.util.Scanner;

// Scanner is predefined class
// String is a predefined class
// System is a predined class
// To import package related to a class
// use ctrl+shift+o
// System is a class and in is an object of 
// InputStream class
// We are creating an object of Scanner
// while creating the object of scanner
// we are passing within the constructor
// the object of InputStream ( in )
// This in object is representing the standard input device
// which is usually keyboard
// STANDARD OUTPUT DEVICE--- >  Monitor/Screen
// STANDARD ERROR DEVICE ----> Monitor/Screen
// STANDARD INPUT DEVICE -----> The keyboard
public class UserInput {

	public static void main(String[] args) {
		int num;
		float f;
	// Predefined classes/classes which are part of Java API cannot be written in smallcase
		//	string str;
	   Scanner scanner=new Scanner(System.in);
       System.out.println("Enter a number");
       num=scanner.nextInt();
       System.out.println("Enter a float value");
       f=scanner.nextFloat();
       System.out.println("The entered values");
       System.out.println("The number is "+num);
       System.out.println("The float value is "+f);
       scanner.close(); // the association between the input device
       //and scanner object which he had while creating the scanner object,
       // with scanner.close() we are de associating that relationship 
       
		
	}

}
