package com.Examples;

import java.util.Scanner;

public class MagicNumbers {

	static void Magic() {
		try {
			int sum = 0, last_digit, last_digit_1, sum_1 = 0, num;

			System.out.println("Enter a number:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			num = n;
			while (n > 0) {
				last_digit = n % 10;
				sum = sum + last_digit;
				n = n / 10;
			}
			while (sum > 0) {
				last_digit_1 = sum % 10;
				sum_1 = sum_1 + last_digit_1;
				sum = sum / 10;
			}
			if (sum_1 == 1) {
				System.out.println(num + " is a MAGIC NUMBER");
			} else {
				System.out.println(num + " is not a MAGIC NUMBER");
			}
		} catch (Exception e) {
			System.out.println("enter nuerical values");
		} finally {
			System.out.println("This is magic numbers program");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magic();

	}

}
