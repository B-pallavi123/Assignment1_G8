package com.innerclass;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Sports s=new Sports() {

			@Override
			public void Cricket() {
				System.out.println("Virat Kohli");
				// TODO Auto-generated method stub
				
			}

			@Override
			public void Football() {
				System.out.println("Christiyano Ronaldo");
				// TODO Auto-generated method stub
				
			}
	
        	  
          };
          s.Cricket();
          s.Football();
	}

}
