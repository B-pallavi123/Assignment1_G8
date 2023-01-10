package com.Examples;

import java.util.Scanner;

public class FibonacciSeries {

	static void Fibonacci() {
		try {
			System.out.println("enter the number of terms:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int n1 = 0, n2 = 1, ni = 0;
			System.out.println(n1);
			System.out.println(n2);
			for (int i = 2; i < n; i++) {
				ni = n1 + n2;
				System.out.println(ni);
				n1 = n2;
				n2 = ni;
			}
		} catch (Exception e) {
			System.out.println("enter the numerical values");
		} finally {
			System.out.println("This is fibonacci series program");
		}

	}

	public static void main(String[] args) {
		System.out.println("The first five terms in the fibonacci series is:");
		Fibonacci();

	}

}
