package com.infosys.collection.demos;

import java.util.ArrayList;

// Object set(int index, Object ob);
public class ArrayListSetValue {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Anand");
		names.add("Ashish");
		names.add("Sunder");
		names.add("Gita");
		names.add("Ashish");
		System.out.println("Before set!!!");
		System.out.println(names);
		names.set(3,"DXC");
		System.out.println("After set!!!!");
		System.out.println(names);
		
	}

}
