package com.bridgelabz.loops;

import java.util.Scanner;

public class Operator2SpringSeason {

	public static void main(String[] args) {
		int d,  m;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Day");
		d = sc.nextInt();
		
		System.out.println("Enter Month");
		m = sc.nextInt();
		
		sc.close();
		
	        if ((m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20)) {
		System.out.println("true");
		} else {
		System.out.println("false");
		}

	}

}
