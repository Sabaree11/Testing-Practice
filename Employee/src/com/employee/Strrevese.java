package com.employee;

public class Strrevese {
	public static void main(String[] args) {
		String str="Welcome to Java";
		String reverse= new StringBuffer(str).reverse().toString();
		System.out.println("Reverse String: "+reverse);
	}

}
