package com.infosys.collection.demos;

import java.util.ArrayList;

public class ArrayListRetainsAll {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		ArrayList<String> namesToRetainAll=new ArrayList<String>();
		names.add("Anand");
		names.add("Ashish");
		names.add("Sunder");
		names.add("Gita");
		names.add("Ashish");
	System.out.println("Before deleting");
	System.out.println(names);
	    namesToRetainAll.add("Gita");
	    namesToRetainAll.add("Sunder");
	  System.out.println("After deleting");  
	    names.retainAll(namesToRetainAll);
	    System.out.println(names);
	  
	    
	}

}
