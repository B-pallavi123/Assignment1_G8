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

		else {
			System.out.println("Given number is not a palindrome");
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("enter atleat 3 digit number: ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			palindrome(num);

		}

		catch (Exception e) {
			System.out.println(e + "enter a valid number not a string");
		}
	}

}
