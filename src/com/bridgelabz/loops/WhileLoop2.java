package com.bridgelabz.loops;
import java.util.Scanner;
public class WhileLoop2 {

	public static void main(String[] args) {
          int rev = 0, rem = 0;
		
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in); //taking user input
		int a = sc.nextInt();
		sc.close();
		
		while(a > 0) {
			 rem = a % 10;
		     rev = rev * 10 + rem;
		     a = a / 10;
		}
			System.out.print("Reversed number is:" +rev);	

	}

	}

