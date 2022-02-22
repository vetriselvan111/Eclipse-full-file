package com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; 

public class List_Methods {
  public static void main(String[] args) {
	List<Object>li=new ArrayList<>(); // Syntax
	
	// Adding Elements
	 li.add(10);
	 li.add("java");
	 li.add(30);
	 li.add(40);
	 li.add(40);
	 li.add(30);
	 li.add(30); 
	 System.out.println(li);
	 
	 // Inserting a value
	 
	 li.add(3,70);
	 System.out.println("\nNew add: \n" +li);
	 
	 // size of list (length of list)
	 
	 int size = li.size();
	 System.out.println("\n" + size);
	 
	 // to get a particular value by passing index
	 
	 Object i = li.get(2);
	 System.out.println("\n" + i);
	 
	 // to replace a value in a list
	 
	 li.set(1, 20);
	 System.out.println("\n"+li);
	 
	 // to remove a particular value
	 
	 li.remove(4);
	 System.out.println("\n"+li);
	 
	 // to find index of value
	 
	 int indexOf = li.indexOf(30);
	 System.out.println("\n"+indexOf);
	 
     int lastIndexOf = li.lastIndexOf(30);
     System.out.println("\n"+lastIndexOf);
     
	 // to find the given value in the list or not
     
	 boolean contains = li.contains("java");
	 System.out.println("\n"+contains);
	 
	// li.clear();
	// System.out.println(li);
	 
	 List<Object>li1=new LinkedList<>();
	 
	 li1.add("java");
	 li1.add(10);
	 li1.add("Greens");
	 li1.add('a');
	 System.out.println(li1);
	 System.out.println(li);
	 
	 li.addAll(li1);
	 System.out.println("\n"+li);
	 
	 li.retainAll(li1);
	 System.out.println("\n"+li);
	 
	 
	 
	 //li.removeAll(li1);
	// System.out.println("\n"+li);
	 
}
  
}
