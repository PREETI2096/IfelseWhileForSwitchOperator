package com.bridgelabz.loops;

import java.util.Scanner;

public class Operator3Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for a : ");
	        int a = sc.nextInt();
		 
	        System.out.println("Enter value for b : ");
	        int b = sc.nextInt();

		System.out.println("Enter value for c : ");
	        int c = sc.nextInt();
		
	        sc.close();
		
		int delta = (b * b) - 4 * (a * c);
		int root1 = (-b + Math.abs(delta)) / (2 * a);
		int root2 = (-b - Math.abs(delta)) / (2 * a);
		
		System.out.println("Root 1 of X " + root1);
		System.out.println("Root 2 of X " + root2);

	}

}
