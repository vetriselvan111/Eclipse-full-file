package com.Constructor;

	public class Student3 {
		 public  Student3() {
			System.out.println("Default");
		}
		 public  Student3(int id) {
			 System.out.println("student id:" +id);
		 }
		 public  Student3 (String name) {
			 System.out.println("student name:" +name);
		 }
		 public  Student3 (String dept, char grade) {
			 System.out.println("student dept:" +dept);
			 System.out.println("student grade:" +grade);
		 }
		 public static void main(String[] args) throws Throwable
		 
		 {
			 Student3 s = new Student3();
			 Student3 s1 = new Student3(23);
			 Student3 s2 = new Student3("James");
			 Student3 s3= new Student3("ECE", 'A');
			 
			//s.finalize();
			//s1.finalize();
			//s2.finalize();
		//	s3.finalize();
		
			 
			 
		}
		}
	

