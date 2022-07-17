package com.infosys.collection.demos;

import java.util.ArrayList;
import java.util.Scanner;

public class FromStringToArray{

  public static void main(String str[]){

   String names="";
   Scanner scanner=new Scanner(System.in);
   ArrayList<String> list=new ArrayList<String>();
   System.out.println("Enter the names separated with ;");
   names=scanner.next();
   String array[]=names.split(";");
   for(String name : array )
     {
          list.add(name);
     }
   for(String s : list)
    {
       System.out.println(s);
    }
 }

  }
  