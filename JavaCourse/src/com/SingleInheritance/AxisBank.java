package com.SingleInheritance;

public class AxisBank extends BankInfo {
  public void deposit() {
	  System.out.println("Deposit amount starting from:Ten thousand");
  }
   public static void main(String[] args) {
	 AxisBank a = new AxisBank();
	 a.saving();
	 a.fixed();
	 a.deposit();
}
}
