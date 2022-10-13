package com.bridgelabz.loops;
import java.util.Scanner;
public class SwitchCase1 {
		static void CheckVowelOrConsonant(char ch) {
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		System.out.println(ch + " is vowel");
		break ;
		default:
		 System.out.println( ch +" is consonant : " );
		 }
	    }

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any character : ");
			char ch = sc.next().charAt(0);
			if((ch >= 'a' && ch <= 'z' )||(ch >= 'A' && ch <= 'Z')) {
				CheckVowelOrConsonant(ch);
				}
			else
			 System.out.println(ch +" is not an alphabet");
			}
		}
		