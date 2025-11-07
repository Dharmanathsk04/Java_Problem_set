package com.tka1_30_Oct2025_Practical_1;

public class Sum {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 12; i<=20; i++) {
			
			sum +=(i*i);
		}
		
		System.out.println("sum of squres from 12 to 20 = "+sum);
	}
}
