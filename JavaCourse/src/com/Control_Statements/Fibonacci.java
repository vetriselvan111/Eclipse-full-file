package com.Control_Statements;

public class Fibonacci {
    
	public static void main(String[] args) {
		
		int a=0,b=1,c;
		
		System.out.print(a+", ");
		System.out.print(b+", ");
		
		for (int i = 0; i <=7; i++) {
			c=a+b;
			System.out.print(c+", ");
			a=b;
			b=c;
		}
	}
}
