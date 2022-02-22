package com.Constructor;

public class Task2_A extends Task2_B {
   public Task2_A() {
	  super(40);
	   System.out.println("Default Constructor");
   }
   public static void main(String[] args) {
	Task2_A A = new Task2_A();
	Task2_B B = new Task2_B();
	
}
}
