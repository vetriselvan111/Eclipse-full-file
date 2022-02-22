package com.Scanner;

import java.util.Scanner;

public class Class3 {
  public static void main(String[] args) {
	 Scanner s = new Scanner (System.in);
	 System.out.println("Enter name:");
	 s.nextLine();
	 String a = s.nextLine();
	 System.out.println(a);
	 
	 System.out.println("Enter id:");
	 int b = s.nextInt();
	 System.out.println(b);
	 
	 System.out.println("Enter phone:");
	 long c = s.nextLong();
	 System.out.println(c);
	 
	 System.out.println("Enter sec: ");
	 String d = s.next();
	 System.out.println(d);
	 
	 System.out.println("Enter float");
	 float e = s.nextFloat();
	 System.out.println(e);
	 
	 
}
}
