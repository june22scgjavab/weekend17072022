package com.infosys.collection.demos;

import java.util.ArrayList;
// Convert from ArrayList to String array

// <T>T[] toArray( T array[])

public class ArrayListToArrayConversion {
public static void main(String str[])
{
	ArrayList<String> names=new ArrayList<String>();
	names.add("Anand");
	names.add("Ashish");
	names.add("Sunder");
	names.add("Gita");
	names.add("Ashish");
	
	String namesArray[]=new String[names.size()];
	
	names.toArray(namesArray);
	
	for(String name : namesArray)
	{
		System.out.println(name);
	}
}
}
