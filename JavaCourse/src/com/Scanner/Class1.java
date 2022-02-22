package com.Scanner;

import java.util.Scanner;

public class Class1 {
public static void main (String[] args) {
Scanner c = new Scanner(System.in);

 System.out.println("Enter the Employee id");
 int a = c.nextInt();
 System.out.println(a);
 
 System.out.println("Enter the Employee Name");
  c.nextLine();
 String b = c.nextLine();
 System.out.println(b);
 
 System.out.println("Enter the Employee Email id");
 String d = c.nextLine();
 System.out.println(d);
 
 System.out.println("Enter the Employee Phone number");
 long e = c.nextLong();
 System.out.println(e);
 
 System.out.println("Enter the Employee salary");
 int f = c.nextInt();
 System.out.println(f);
 
 System.out.println("Enter the Employee Gender");
 String g = c.next();
 System.out.println(g);
 
 System.out.println("Enter the Employee City");
 String h = c.next();
 System.out.println(h);
}
}


