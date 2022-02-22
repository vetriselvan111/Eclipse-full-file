package com.Control_Statements;

public class Reverse_String1 {
 
	public static void main(String[] args) {
		
		String given ="Greens";
		
		String reverse = "";
		
		System.out.println(given.length());
		
		for (int  i= given.length()-1;i>=0;i--) {
			
			reverse= reverse+given.charAt(i);
		}
		System.out.println("Reverse String:"+reverse);
	}
}