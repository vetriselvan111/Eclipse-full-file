package com.Method_overloading;

import java.math.BigInteger;

public class Greens_Tech {
  public void greensOmr (String name,String Branch) {
	System.out.println("Enter the Institute name :" + name);
   	System.out.println("Enter the Branch :" + Branch);
  }
	public void greensOmr(int No,String Address  ) {
		System.out.println("Enter the Door No :" + No);
		System.out.println("Enter the Address:" + Address);
	}
    public void greensOmr (String location) {
    	System.out.println("Enter the location :" + location);	
    }
    public void greensOmr (long PhoneNo) {
    	System.out.println("Enter the Phone No:" + PhoneNo);
    }
    public static void main(String[] args) {
		Greens_Tech greens = new Greens_Tech();
		greens.greensOmr("GREENS TECHNOLOGIES", "OMR");
		greens.greensOmr(92, "Thoraipakkam");
		greens.greensOmr("Chennai ");
	    greens.greensOmr(9566143619l);
}
}