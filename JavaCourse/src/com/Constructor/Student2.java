package com.Constructor;

public class Student2 {
                            // CHAIN CONSTRUCTOR
	public Student2() {
		this("watson");
		System.out.println("Default");
	}

	public Student2(int id) {
		 this("ECE", 'A');
		System.out.println("student id:" + id);
	}

	public Student2(String name) {
	   this(34);
		
		System.out.println("student name:" + name);
	}

	public Student2(String dept, char grade) {
		
		System.out.println("student dept:" + dept);
		System.out.println("student grade:" + grade);
	}

	public static void main(String[] args) {
		Student2 s = new Student2("ECE",'A');
		
	}
}


