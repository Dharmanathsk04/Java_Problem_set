package com.tka1_30_Oct2025_Practical_1;

public class Product_cube {

	public static void main(String[] args) {
		
		long product = 1;
		
		
		for(int i = 1; i<=10; i++) {
			
			product *= (i*i*i);
		}
		
		System.out.println("product of cubes from 1 to 10 ="+product);
		
	}
}
