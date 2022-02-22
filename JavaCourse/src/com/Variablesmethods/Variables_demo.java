package com.Variablesmethods;

public class Variables_demo {
  final int age =12 ;
   
  
   public void method1() {
	
	   int age = 4;
	   
	   System.out.println(age);

}
   public void method2() {
	   int age=11;
	   
	   System.out.println(age);
   }
   public static void main(String[] args) {
	Variables_demo v = new Variables_demo();
	v.method1();
	v.method2();
	System.out.println(v.age);
	
	   
}
}

