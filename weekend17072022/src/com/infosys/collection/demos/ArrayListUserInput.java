package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.Scanner;
// User Input in a list
public class ArrayListUserInput {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<String>();
		String reply="";
		String name="";
		do
		{
		System.out.println("Enter the name");
		name=scanner.next();
		names.add(name);
		System.out.println("Do you want to continue?");
		reply=scanner.next();
		}while(reply.equalsIgnoreCase("yes"));
	  System.out.println("Entered name is");
	  for(String nm : names)
	  {
		  System.out.println(nm);
	  }
	
	}

}
