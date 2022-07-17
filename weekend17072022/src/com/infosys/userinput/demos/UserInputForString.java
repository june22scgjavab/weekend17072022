package com.infosys.userinput.demos;

import java.util.Scanner;

public class UserInputForString {

	public static void main(String[] args) {

   Scanner scanner=new Scanner(System.in);
	String firstName;
	String middleName;
	String lastName;
	String designation;
	
	System.out.println("Enter the firstname");
	firstName=scanner.next();
	System.out.println("Enter the middlename");
	middleName=scanner.next();
	System.out.println("Enter the lastname");
	lastName=scanner.next();
	System.out.println("Enter the designation");
	designation=scanner.next();
	System.out.println("The details are:");
	System.out.println("FIRSTNAME :"+firstName);
	System.out.println("MIDDLENAME :"+middleName);
	System.out.println("LASTNAME :"+lastName);
	System.out.println("DESIGNATION :"+designation);
	
	}
	

}
