package com.prime;

public class Prime {

	public static void main(String srgs[]) {
		int n = 11, count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count = count + 1;
			}
		}
		
		if (count == 0) {
			System.out.println("Given number is a prime number");
		} else {
			System.out.println("Given number is not a prime number");
		}

	}

}
