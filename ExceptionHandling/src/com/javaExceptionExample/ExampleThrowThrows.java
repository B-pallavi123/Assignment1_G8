package com.javaExceptionExample;

import java.util.Scanner;

public class ExampleThrowThrows {

	public static void main(String[] args) throws Exception {
		System.out.println("enter a number:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 2 != 0) {
			throw new Exception("it is a odd number \n so enter a even number");
		}

		else {
			System.out.println(a + " is divisible by 2");
		}

	}

}
