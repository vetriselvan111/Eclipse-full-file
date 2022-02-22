package com.Method_Overriding;

public class Boy extends Marriage {

    @Override
    	public void girlName() {
    		// TODO Auto-generated method stub
    		super.girlName();
    	}
    private void boyname() {
System.out.println("gautham");
	}
   

public static void main(String[] args) {
	Boy b = new Boy();
	b.girlName();
	b.boyname();
	
}
}
     