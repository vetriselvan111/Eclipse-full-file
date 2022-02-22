package com.Method_overloading;

public class Employee_Details {
  public void Empid (String name) {
	  System.out.println("Employee Name: " + name);
  }
  public void Empid (char grade ,String Dept) {
	  System.out.println("Employee Grade:" + grade);
	  System.out.println("Employee Dept :" + Dept );
  }
  public static void main(String[] args) {
	Employee_Details e = new Employee_Details();
	 e.Empid("Vetri");
	 e.Empid('A', "Mechanical");
}
}
