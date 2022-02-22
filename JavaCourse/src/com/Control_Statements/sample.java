package com.Control_Statements;

public class sample {
  public static void main(String[] args) {
	 int  count =0 , sum =0;
	for (int i = 1; i <= 20; i++) {
		if(i % 2==1) {
		
		 System.out.println(i);  
		 
		 
		 
		count= count+i;
		
		}
		
	} 
	
	System.out.println(count);
	
	System.out.println("   ");
	
	for (int j = 1; j < 20; j++) {
		if(j%2==0) {
			System.out.println(j);
			sum=sum+j;
		}
	}
	
	System.out.println(sum);

  }
}