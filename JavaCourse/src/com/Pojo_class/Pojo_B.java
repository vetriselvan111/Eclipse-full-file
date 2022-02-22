package com.Pojo_class;

public class Pojo_B {
  public static void main(String[] args) {
	  
	Pojo_A a = new Pojo_A();
	
	//  int age = a.getAge();  -------> Surya method
	
//  System.out.println("age:"  +age); -------> Surya method
	
	  System.out.println(a.getAge()); 
	  
	  System.out.println("new age:" +a.getAge());
	  
	  a.setAge(20); // age-20 is SET
	  
	  //int age2 = a.getAge();  -----> Surya method
	  
	 // System.out.println("After setter:" +age2); ----> surya method
	  
	  System.out.println(a.getAge());
	  
	  System.out.println("After setters:" +a.getAge());
	  
	  
	  
	 
}
}
