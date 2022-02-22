package com.Constructor;

public class Student1 {
 public  Student1() {
	System.out.println("Default");
}
 public  Student1(int id) {
	 System.out.println("student id:" +id);
 }
 public  Student1 (String name) {
	 System.out.println("student name:" +name);
 }
 public  Student1 (String dept, char grade) {
	 System.out.println("student dept:" +dept);
	 System.out.println("student grade:" +grade);
 }
 public static void main(String[] args) {
	 Student1 s =new Student1();
	// Student1 s1 = new Student1(23);
	// Student1 s2 = new Student1("James");
	// Student1 s3= new Student1("ECE", 'A');
	 
}
}
