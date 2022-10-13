package com.bridgelabz.loops;
import java.util.Scanner;
public class Operator1MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for a : ");
	        int a = sc.nextInt();
		 
	        System.out.println("Enter value for b : ");
	        int b = sc.nextInt();

		System.out.println("Enter value for c : ");
	        int c = sc.nextInt();
		
	        sc.close();

	        int w = a + b * c;
		int x = c + a / b;
		int y = a % b + c;
	 	int z = a * b + c;
		
	        System.out.println("value of first equation (a + b * c) : " + w);
		System.out.println("value of second equaton (c + a / b) : " + x);
		System.out.println("value of third equatoon (a % b + c) : " + y);
		System.out.println("value of fouth equation (a * b + c) : " + z);

	 	if( w > x && w > y && w > z){
	 	System.out.println("Maximum = " + w);
		}
		
		else if(x > w && x > y && x > z){
		System.out.println("Maximum = " + x);
		}

		else if(y > w && y > x && y > z){
		System.out.println("Maximum = " + y);
		}

	        else{
		System.out.println("Maximum = " + z);
		}

	        if( w < x && w < y && w < z){
	 	System.out.println("Minimum = " + w);
		}
		
		else if(x < w && x < y && x < z){
		System.out.println("Minimum = " + x);
		}

		else if(y < w && y < x && y < z){
		System.out.println("Minimum = " + y);
		}

	        else{
		System.out.println("Maximum = " + z);
	}
	}
}

