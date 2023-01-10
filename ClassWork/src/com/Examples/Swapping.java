package com.Examples;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		try {
			System.out.println("enter a first number a:");
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			System.out.println("enter a second number b:");
			Scanner scn = new Scanner(System.in);
			b = scn.nextInt();
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("After swapping without using 3rd variable a and b values are:");
			System.out.println("the a value is " + a);
			System.out.println("the b value is " + b);

		}

		catch (Exception e) {
			System.out.println("enter numerical values");
		} finally {
			System.out.println("the swapping program is completed");
		}

	}
}
