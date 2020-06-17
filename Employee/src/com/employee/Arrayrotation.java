package com.employee;

public class Arrayrotation {
public static void main(String[] args) {
	int[]ar= new int[]{1,2,3,4,5};
	int n=3;
	
	System.out.println("Original Array:");
	for (int i=0; i<ar.length; i++) {
		System.out.print(ar[i]+"");
	}
	
	
	for (int i=0; i<n; i++) {
		int j,last;
		last=ar[ar.length-1];
		
		for (j=ar.length-1; j>0; j--) {
			ar[j]=ar[j-1];
			
		}
		ar[0]=last;
				
	}
	System.out.println();
	
	
	System.out.println("Final Array:");
	for (int i=0; i<ar.length; i++) {
		System.out.print(ar[i]+"");
	}
}
}
