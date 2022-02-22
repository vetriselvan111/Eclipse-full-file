package com.Constructor;

public class Task1 {
 
	public Task1 () {
		this (12);
		System.out.println("Default");
		
	}
	public Task1 (int id) {
		this ("JAVA");
		System.out.println(id);
		
	}
	public Task1 (String name) {
		this(235.432f);
		System.out.println(name);
		
	}
	public Task1 (float sal) {
		
		System.out.println(sal);
	}
	
	public static void main(String[] args) {
		Task1 T = new Task1();
	}
}
