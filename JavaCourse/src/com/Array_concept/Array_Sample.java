package com.Array_concept;

public class Array_Sample {
   public static void main(String[] args) {
		 // datatype variablename [] = new datatype[length];
	  int a[] = new int[10]; // array declaration
	   a[0]=10;        // a[] = {10,20,30,40,50,0,0,0,0,0}
	   a[1]=20;
	   a[2]=30;
	   a[3]=40;
	   a[4]=50;
	   a[4]=30; // duplicate index
	  System.out.println(a[4]); // to get a particular value
	    
	   String b[]= new String[4];
	   b[0]= "vetri";
	  b[1]= "tamil";
	   b[2]= "lingesh";
	   b[3]= "surendar";
	   System.out.println(b[0]);
	    
	   int l1 = a.length;  // to find length of array a.lenth+ ctrl 2 to get type
	   System.out.println(l1);
	   
	    int l2 = b.length; // to find length array 
	   System.out.println(l2);
	   
	   for (int i = 0; i < a.length; i++) { //to get all values in an array
		   System.out.println(a[i]);
   }
}
}
		   
		   
		    		 
					
				
				
			