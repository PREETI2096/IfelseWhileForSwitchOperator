package com.bridgelabz.loops;

import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in); // user input
		int n = sc.nextInt();
		sc.close();
		
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of n natural numbers = " + sum);
	}


	}

