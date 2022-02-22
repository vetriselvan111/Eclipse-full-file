package com.Method_Overriding;

public class BankInfo {
 public void savings (String name) {
 System.out.println("Savings Amount:" + name);
 }
public void fixed (String name) {
	 System.out.println("Fixed Amount:" + name);
	 }
public void Deposit (String name) {
	 System.out.println("Deposit Amount:" + name);
	 }
public static void main(String[] args) {
	BankInfo b = new BankInfo ();
	b.savings("Ten thousand");
	b.fixed("Ten thousand");
	b.Deposit("starting from Ten thousand");
}
}