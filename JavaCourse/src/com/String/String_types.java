package com.String;

public class String_types {
 public static void main(String[] args) {
	String s1 = " Greens ";
	String s2 = " Greens" ;
	System.out.println("== Immutable ==");
    int r1 = System.identityHashCode(s1);
    System.out.println(r1);
    
    int r2 = System.identityHashCode(s2);
    System.out.println(r2);
    
    String concat = s1.concat(s2);
    System.out.println(concat);
    
    int memory1 = System.identityHashCode(concat);
    System.out.println(memory1);
    
    StringBuffer s3 = new StringBuffer("Technologies");
    StringBuffer s4 = new StringBuffer("Technologies");
    System.out.println(" == Mutable ==");
    
    int r3 = System.identityHashCode(s3);
    System.out.println(r3);
    
    int r4 = System.identityHashCode(s4);
    System.out.println(r4);
    
    StringBuffer append = s4.append(s3);
    System.out.println(append);
    
    int memory4 = System.identityHashCode(append);
    System.out.println(memory4);
    
}
}
