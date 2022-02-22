package com.Abstraction;

public class Details1 extends Details {
  @Override
public void password() {
	    System.out.println("Vetri@123");
}
  public static void main(String[] args) {
	Details1 d = new Details1();
	d.username();
	d.mailid();
	d.password();
}
}
