package com.Control_Statements;

import java.util.Scanner;

public class Task2 {
 public static void main(String[] args) {
	 System.out.println("Enter your age:" );
	 Scanner sc =new Scanner(System.in);
	 int a = sc.nextInt();
	 if (a>=18) {
		 System.out.println("Eligeble to vote");
	 }
	 else {
		 System.out.println("Not Eligeble to vote");
	 }
		 
}
}
