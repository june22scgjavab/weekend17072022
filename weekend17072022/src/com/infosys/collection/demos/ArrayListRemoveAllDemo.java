package com.infosys.collection.demos;
import java.util.ArrayList;
// boolean removeAll( Collection collection)

public class ArrayListRemoveAllDemo {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		ArrayList<String> namesToRemove=new ArrayList<String>();
		names.add("Anand");
		names.add("Ashish");
		names.add("Sunder");
		names.add("Gita");
		names.add("Ashish");
		System.out.println("Before remove ");
		System.out.println(names);
		// Remove basically goes for deleting the first occurance
		names.remove("Ashish");
		System.out.println("After remove");
		System.out.println(names);
		
		  namesToRemove.add("Ashish"); //namesToRemove.add("Gita");
		  namesToRemove.add("Gita");
		  
		  System.out.println("The names list before removal");
		  System.out.println(names); System.out.println("The names to remove");
		  System.out.println(namesToRemove);
		  
		  names.removeAll(namesToRemove); 
		  System.out.println("After removal");
		  System.out.println(names);
		  
		 
	}

}
