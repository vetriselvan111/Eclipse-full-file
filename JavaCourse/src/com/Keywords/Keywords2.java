package com.Keywords;

public class Keywords2 {
   final int speed =100;
  public  void speed () {
	    //speed =50;
	  System.out.println(speed);
  }
  public final void sample () {
	  System.out.println("Hello World");
  }
  public static void main(String[] args) {
	Keywords2 k = new Keywords2();
	k.sample();
	k.speed();
}
}

