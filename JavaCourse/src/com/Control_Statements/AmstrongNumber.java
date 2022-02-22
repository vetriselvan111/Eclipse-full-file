package com.Control_Statements;

public class AmstrongNumber {
	public static void main(String[] args) {
		int a =153,i,j=0;
		  int p = a;
		while(a>0) {
			i= a % 10;
			j= j + (i*i*i);
			a=a / 10;
		}
		if(p == j) {
			System.out.println("Armstrong number is:" +j);
		}else {
			System.out.println("no armstrong number");
		}
		System.out.println(j);
	}
}
	
