package com.Method_overloading;

public class Phone {
   public void PhoneInfo(String name) {
	System.out.println("Phone name: "+ name);

}
   public void PhoneInfo(char type) {
	   System.out.println("phone:"+type);
   }
   public void PhoneInfo(int speed) {
	   System.out.println("Ram:"+speed);
   } 
   public void PhoneInfo(String pixel , float clarity) {
   System.out.println("Camera : "+pixel);
   System.out.println("pixel:"+clarity);
   }
   public void PhoneInfo(long Imei) {
   System.out.println("Imei Number:"+Imei);
   }
   
   public static void main(String[] args) {
	Phone p = new Phone();
	p.PhoneInfo("Realme");
	p.PhoneInfo('C');
	p.PhoneInfo(6);
	p.PhoneInfo("8 Mega", 48.2f);
	p.PhoneInfo(123456789l);
	
	
}
   
}




   
   
