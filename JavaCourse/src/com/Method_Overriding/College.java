package com.Method_Overriding;

public class College extends University {
   @Override
public void ug(int year) {
	super.ug(year);
	
}
	  @Override
		public void pg(String year) {
			super.pg(year);
			System.out.println(year);
		}
	  public static void main(String[] args) {
		College c = new College();
		c.ug(3);
		c.pg("4");
	}
	  
	  
   }

