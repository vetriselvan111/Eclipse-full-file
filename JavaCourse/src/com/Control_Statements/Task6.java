package com.Control_Statements;

public class Task6 { // to print Even numbers count
   public static void main(String[] args) {
	   int even = 0;
	   for (int i = 1; i <=100; i++) {
		if(i % 2 ==0) {
			even++;
		}
	}
	   System.out.println("the given Even numbers count is:" + even);
   }
}

   
   
