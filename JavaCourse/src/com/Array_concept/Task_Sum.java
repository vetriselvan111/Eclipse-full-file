package com.Array_concept;

public class Task_Sum {
     public static void main(String[] args) {
		int [] a = new int[] {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
				for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of the given array elements :" +sum);
		
	}
}
