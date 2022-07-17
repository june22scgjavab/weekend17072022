package com.infosys.userinput.demos;

import java.util.Scanner;

public class UserInputForStringWithSpace {

	public static void main(String[] args) {
		
		String name;
		Scanner scanner=new Scanner(System.in);
     System.out.println("Enter the name");
     //name=scanner.next(); // next wont take space
     // if you give space it considers the end for the 
     // input
     name=scanner.nextLine();
     System.out.println("Entered name is ");
     System.out.println(name);
	}

}
