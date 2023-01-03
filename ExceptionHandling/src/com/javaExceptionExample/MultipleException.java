package com.javaExceptionExample;

import java.util.Scanner;

public class MultipleException {

	public static void main(String[] args) {
		
		try {
		
		System.out.println("enter a num1:");
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		     try {
		    	 if(a%2==0) {
		    		 System.out.println(a+"is a even number");
		    	 }
		     }
		     catch(Exception e) {
		    	 System.out.println(e);
		    	 
		     }
		     finally {
		    	 System.out.println("it is inner finally block-1");
		    	 
		     }
		     try {
		    	 if(a%2!=0) {
		    		 System.out.println(a+"is a odd number");
		    	 }
		     }
		     catch(Exception e) {
		    	 System.out.println(e);
		    
		     }
		     finally {
		    	 System.out.println("it is inner finally block-2");
		     }
		
	}
		catch(Exception e) {
			System.out.println("enter a number");
			
		}
		finally {
			System.out.println("program is completed");
		}
		

}

}