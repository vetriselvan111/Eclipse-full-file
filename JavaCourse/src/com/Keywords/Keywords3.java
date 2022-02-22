package com.Keywords;

public class Keywords3 extends Keywords2 {
   int a = 45;
   public void test () {
	   int a = 30;
	   System.out.println("Local Variable :" +a);
	   System.out.println("Class variable :" + this.a);
	   System.out.println("Parent class variable :" + super.speed);
   }
   public static void main(String[] args) {
	Keywords3 k = new Keywords3();
	k.test();
}
}
