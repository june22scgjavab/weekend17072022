package com.infosys.collection.demos;

import java.util.HashMap;
import java.util.LinkedHashMap;
// Insertion order will be maintained
public class MapDemo4 {

	// key and value
	public static void main(String[] args) {
		HashMap<Integer,String> empDetails=new LinkedHashMap<>();
		empDetails.put(30, "John");
		empDetails.put(20, "John");
		empDetails.put(1, "Amit");
		empDetails.put(2, "John");
		empDetails.put(3, "Tony");
		empDetails.put(3,"Maya"); // the key 3 now will be having the new value Maya as it will replace the value Tony
		System.out.println(empDetails);

	}

}
