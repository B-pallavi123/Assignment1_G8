package com.javaExceptionExample;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("enter a number1:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter a number2");
		Scanner scn = new Scanner(System.in);
		int b = sc.nextInt();
		int div = 0, mul = 0;
		try {
			div = a / b;
			mul = a * b;
		} catch (ArithmeticException e) {
			System.out.println("divide by zero");

		} catch (Exception e) {
			System.out.println("i am an exception");
		} finally {
			System.out.println("i am always executed");

		}
		
		System.out.println("product is " + mul);



	}

}
