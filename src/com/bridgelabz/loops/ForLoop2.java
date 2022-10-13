package com.bridgelabz.loops;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		int rev= 0, rem=0;
		
		System.out.println("Enter any number ");
		Scanner sc = new Scanner(System.in);   
		
		for ( int n = sc.nextInt(); n>0; n=n/10) {
			 rem= n%10;
			rev= rev*10+ rem;
		}
			
		System.out.print("Reversed number is: " + rev);	

	}

}
