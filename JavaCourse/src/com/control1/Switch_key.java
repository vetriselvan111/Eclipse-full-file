package com.control1;

import java.util.Scanner;

public class Switch_key {
 public static void main(String[] args) {
	 for(int j = 1;j <=8; j++) {
	 System.out.println("Enter the Number...");
	 Scanner sc = new Scanner(System.in);
	  int i = sc.nextInt();
	  switch (i) {
	 case 1:
		 System.out.println("SUNDAY");
		 break;
	 case 2:
		 System.out.println("MONDAY");
		 break;
	 case 3:
		 System.out.println("TUESDAY");
		 break;
	 case 4:
		 System.out.println("WEDNESDAY");
		 break;
	 case 5:
		 System.out.println("THURSDAY");
		 break;
	 case 6:
		 System.out.println("FRIDAY");
		 break;
	 case 7:
		 System.out.println("SATURDAY");
		 break;
		 
		 default:
			 System.out.println("Invalid");
			 break;
	 }
	 
}
}
}
