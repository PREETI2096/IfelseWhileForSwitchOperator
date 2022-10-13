package com.bridgelabz.loops;

import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
	    int rev = 0, rem;
		for( ;n >0 ;n /= 10)
		{
		rem = n%10;
		rev = (rev * 10 + rem);
		
		}
		if(temp == rev)
		System.out.println(rev+" is Polindrome");
		else
		System.out.println( rev + " is Not a Polindrome");
		
          }
	}
