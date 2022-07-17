package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.List;

// As ArrayList is implementing List so 
// it is possible that we create a reference variable
// of List type ( which is an interface and allow it
// to store the reference of ArrayList
// This approach is preferable one to make the
// code flexible and loosely coupled code
// Loosely coupled code means , if we are making
// a change in one part of the code , rest of the code
// is least affected
public class ListArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //ArrayList<String> list=new ArrayList<String>();
      
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Ashok");
		list.add("Soham");
		for(String name : list)
		{
			System.out.println(name);
		}
	}

}
