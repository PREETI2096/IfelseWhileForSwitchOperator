package com.bridgelabz.loops;
import java.util.Scanner;
public class Operator4Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // user input
		System.out.println("Enter the value of x");
		int x = sc.nextInt();
		
	 	System.out.println("Enter the value of y");
		int y = sc.nextInt();
		
		sc.close(); // closing scanner object

		double distance = Math.pow(( x*x + y*y ), 0.5);
		
		System.out.println("Distance = " +distance);
		}

	}

