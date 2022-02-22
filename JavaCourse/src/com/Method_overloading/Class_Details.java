package com.Method_overloading;

public class Class_Details {
  public void student(int id) {
	  System.out.println("Enter student id:" + id);
  }
	  public void student (String name) {
		  System.out.println("Enter student name:" + name);
	  }
	  public void student (String dept, char grade) {
		  System.out.println("Enter student dept:" + dept);
		  System.out.println("Enter student grade: "+ grade);
	    }
	  public static void main(String[] args) {
		Class_Details c = new Class_Details();
		c.student("james");
		c.student("ECE",'A');
		c.student(23456);
	}
}
