package com.Control_Statements;

public class ReverseNumber {
   public static void main(String[] args) {
	int a=12345,i,j=0;
	while(a>0) {
		i= a %10;
		j=(j*10)+i;
		a=a/10;
	}
	System.out.println("Reverse number is:" +j);
}
}
