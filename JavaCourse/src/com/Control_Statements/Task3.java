package com.Control_Statements;

import java.util.Scanner;

public class Task3 { // to check whether the given number is odd or even
   public static void main(String[] args) {
	System.out.println("Enter the number:");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
			if (a % 2==0) {
				System.out.println("The given number is even");
			}
			else {
				System.out.println("The given number is odd");
			}
}
}
