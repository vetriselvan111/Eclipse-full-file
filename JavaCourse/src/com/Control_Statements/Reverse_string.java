package com.Control_Statements;

public class Reverse_string {

	public static void main(String[] args) {
		
		String given = "Greens technologies at porur"; // String Word Initialized
		
		String reversed = "";   // Output String initialized as Null
		
		String[] split = given.split(" "); // given word was split by split() method & return type is String Array[]
	
		
		System.out.println(split.length); // Checked  word Length
		
		for (int i=split.length-1;i>=0;i--) { // For loop used for reverse Iteration
			
			reversed = reversed+split[i]+" "; // stored the reverse string word.
			
		}
		System.out.println("Reverse String is:"+ reversed); // print the output reversed string
	}
}
