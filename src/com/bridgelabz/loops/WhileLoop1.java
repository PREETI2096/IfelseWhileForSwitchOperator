package com.bridgelabz.loops;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in); //Taking user input
		int a = sc.nextInt();
		sc.close();
		
		int i = 0;
		while (i <= a) {
			 sum = sum + i;
			i++;
		}
		System.out.println("Sum of given number = " + sum);
		}

	}
