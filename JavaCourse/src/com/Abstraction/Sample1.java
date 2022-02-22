package com.Abstraction;

public abstract class Sample1 {
    public void ticketNo(int No) {
    	System.out.println("Enter ticket no:" + No);
    }
    public void ticketSerial(String serial) {
    	System.out.println("Enter the Serial:" +serial);
    }
    public abstract void Amount(); // Signature part
    	
    }

