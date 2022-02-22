package com.Method_Overriding;

public class Ktm extends Bike {
   @Override
public void cost(float rs) {
	super.cost(rs);
	System.out.println(rs);
}
   @Override
	public void speed(int km) {
	    super.speed(km);
	    System.out.println(km);
	}
   public static void main(String[] args) {
	    Ktm k = new Ktm();
	    k.cost(132234.45f);
	   k.speed(145);
}
}


