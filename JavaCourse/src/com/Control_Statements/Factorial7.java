package com.Control_Statements;

import java.util.Scanner;
                    // Factorial numbers
public class Factorial7 {
 public static void main(String[] args) {
	int fact = 1;
	System.out.println("Enter the Number: ");
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	for(int i=1;i<=5;i++) {
		fact=fact*i;
	}
	System.out.println("the given factorial numbers values is :" +fact);
}
}
