package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
// asList is a method of Arrays which helps
// in converting from array to List
public class ConvertingFromArrayToList {

	public static void main(String[] args) {
		
		 String names="";
		   Scanner scanner=new Scanner(System.in);
		   ArrayList<String> list=new ArrayList<String>();
		   System.out.println("Enter the names separated with ;");
		   names=scanner.next();
		   String array[]=names.split(";");
		   List<String> nameList=Arrays.asList(array);
          for(String nm : nameList)
          {
        	  System.out.println(nm);
          }
		   
	}

}
