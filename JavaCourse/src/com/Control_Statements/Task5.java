package com.Control_Statements;

public class Task5 {  // to print odd numbers SUM
 public static void main(String[] args) {
	int sum =0;
	for (int i = 1; i <=100; i++) {
		if (i % 2!=0) {
			sum = sum+i;
		}
	}
	System.out.println("The given odd numbers sum is: " +sum);
}
}
