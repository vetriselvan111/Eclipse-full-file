package com.String;

public class String_Concepts {
  public static void main(String[] args) {
	String s = "Welcome to java";
	System.out.println(s);
	int length = s.length();
	System.out.println(length); // length starts from 1
	
	boolean equals = s.equals("welcome to java");
	System.out.println(equals); // to check the given string is equal to original 
	
	boolean equalsIgnoreCase = s.equalsIgnoreCase("Welcome to Java");
	System.out.println(equalsIgnoreCase); // ignore the case sensitive
	
	String upperCase = s.toUpperCase();
	System.out.println(upperCase); // to view the string line in upperCase
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase); // to view the string in lowerCase
	
	boolean startsWith = s.startsWith("w");
	System.out.println(startsWith); // to check the first letter in the string
	
	boolean endsWith = s.endsWith("Ava");
	System.out.println(endsWith); // to check the last letter in the string
	
	boolean contains = s.contains("to j"); //to check the given string in same sequentley
	System.out.println(contains);
	
	int indexOf = s.indexOf('o');
	System.out.println(indexOf); // to check index number for the given string word

	int lastIndexOf = s.lastIndexOf('a');
	System.out.println(lastIndexOf); // to check index no for the given last word
	
	char charAt = s.charAt(7);
	System.out.println(charAt); // to view the 7 letter or position in the string 
	
	String replace = s.replace("java", "Python");
	System.out.println(replace); // to replace the given string into new string
	
	String substring1 = s.substring(9); // to fetch one position in that string	
	System.out.println(substring1);
	
	String substring2 = s.substring(9, 13); // to fetch particular position in that string
	System.out.println(substring2);
	
	boolean empty = s.isEmpty(); // to check whether the given string is empty
	System.out.println(empty);
	
	String trim = s.trim(); // to remove unwanted space from that string
	System.out.println(trim);
	
}
}
