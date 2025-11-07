package com.tka1_30_Oct2025_Practical_1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the base number:");
		int base = sc.nextInt();
		
		System.out.println("enter the exponent:");
		int exponent = sc.nextInt();
		
		
		long result = 1;
		
		for(int i = 1; i<=exponent; i++) {
			
			result = result*base;
		}
		
		System.out.println(base+"raised to the power"+exponent+"="+result);
	}
}
