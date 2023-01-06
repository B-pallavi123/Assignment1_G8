package com.javaExceptionExample;

import java.util.Scanner;

public class Palindrome {

	static void palindrome(int a) throws Exception {
		int n, reverse = 0, last_digit;
		n = a;
		while (a > 0) {
			last_digit = a % 10;
			reverse = reverse * 10 + last_digit;
			a = a / 10;
		}
		if (n == reverse && n!=0) {
			System.out.println("Given number is palindrome");
		}
		else if(a==0) {
			throw new Exception("enter a number greater than zero");
			
		}

		else {
			System.out.println("Given number is not a palindrome");
		}
	}

	public static void main(String[] args) throws Exception {
		
			System.out.println("enter atleat 3 digit number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			palindrome(num);

		

	
	}

}
