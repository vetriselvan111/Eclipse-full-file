package com.Method_Overriding;

public class AxisBank extends BankInfo {
@Override
public void Deposit (String name) {
	super.Deposit("starting from Ten thousand");
	System.out.println("Ten thousand");
}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.Deposit(" Ten thousand");
}
}
