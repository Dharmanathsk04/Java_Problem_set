package com.tka1_30_Oct2025_Practical_1;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many terms you want :");
		
		int n = sc.nextInt();
		
		int frist = 0, second = 1, next;
		
	   System.out.println("fibonacci Series :");
	   
	   for(int i = 1; i<=n; i++) {
		   
		   
		   System.out.print(frist+" ");
		   next = frist + second;
		   
		   frist = second;
		   second = next;
	   }
	   
	   sc.close();
	}
}
