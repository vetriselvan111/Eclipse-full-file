package com.Abstraction;

public class Sample2 extends Sample1 {

	@Override
	public void Amount() {
		System.out.println("enter amount 45000");
		
	}
     public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.ticketNo(2345);
		s.ticketSerial("est2345");
		s.Amount();
	}
}
