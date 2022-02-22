package com.Scanner;

import java.util.Scanner;

public class Class2 {
public static void main(String[] args) {
	Scanner c = new Scanner (System.in);
	System.out.println("Enter student id");
	int id = c.nextInt();
	System.out.println(id);
	
	System.out.println("Enter student name");
	c.nextLine();
	String Name = c.nextLine();
	System.out.println(Name);
	
	System.out.println("Enter Mark1");
	int Mark1 = c.nextInt();
	System.out.println(Mark1);
	
	System.out.println("Enter Mark2");
	int Mark2 = c.nextInt();
	System.out.println(Mark2);
	
	System.out.println("Enter Mark3");
	int Mark3 = c.nextInt();
	System.out.println(Mark3);
	
	System.out.println("Enter Mark4");
	int Mark4 = c.nextInt();
	System.out.println(Mark4);
	
	System.out.println("Enter Mark5");
	int Mark5 = c.nextInt();
	System.out.println(Mark5);
	
    int Total = Mark1+Mark2+Mark3+Mark4+Mark5;
    System.out.println("Total no of Marks:" + Total);
	
    float Average = Total / 5 ;
    System.out.println("Average:" + Average);
   
}

}
