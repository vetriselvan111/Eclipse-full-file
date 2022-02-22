package com.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Methods {
  public static void main(String[] args) {
	Set<Object> s = new HashSet<>();
	  s.add(null);
	  s.add("java");
	  s.add(10);
	  s.add(20);
	  s.add(30);
	  s.add("Greens");
	  s.add("java");
	  s.add(null);
	   System.out.println(s);
	   
	   int size = s.size();
	   System.out.println(size);
	   
	   s.remove(20);
	   System.out.println(s);
	   
	   boolean contains = s.contains(20);
	   System.out.println(contains);
	   
	  // s.clear();
	  // System.out.println(s);
	   
	   Set<Object> s1 = new LinkedHashSet<>();
	    s1.add("Tech");
	    s1.add(30);
	    s1.add("Greens");
	    s1.add(null);
	    s1.add(30);
	    s1.add(null);
	    System.out.println(s1);
	   System.out.println(s);
	    
	    s1.addAll(s);
	    System.out.println(s1);
	    
	   s1.retainAll(s);
	    System.out.println(s1);
	    
	    s1.removeAll(s);
	    System.out.println(s1);
	    
	    
	   // Set<Integer> s2 = new TreeSet<>();
	   //   s2.add(80);
	   //   s2.add(10);
	   //   s2.add(20);
	    // System.out.println(s2);
	    
	    
	    
}
  
}
