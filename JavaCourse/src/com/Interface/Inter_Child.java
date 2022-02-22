package com.Interface;

public class Inter_Child implements Interface1 , Interface2{
     @Override
    public void person3() {
    	System.out.println("Headache");
    	}
     
     @Override
    public void person4() {
    	 System.out.println("Cold");
    	}
      
     @Override
    public void person1() {
    	System.out.println("Fever");
    }
      
     @Override
    public void person2() {
    	System.out.println("Covid");
    	
    }
     
     public static void main(String[] args) {
		Inter_Child i = new Inter_Child();
		i.person1();
		i.person2();
		i.person3();
		i.person4();
	}

	}

