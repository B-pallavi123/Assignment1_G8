package com.innerclass;

public class LocalInnerClass {
	
	public void resultsOfSubjects() {
		
		class Maths{
			void result1() {
				System.out.println("i got 99 out of 100 in maths subject");
			}
		}
		class English{
			void result2() {
				System.out.println("i got 95 out of 100 in english subject");
			}
		}
		class Social{
			void result3() {
				System.out.println("i got 96 out of 100 in social subject");
			}
		}
		Maths m =new Maths();
		m.result1();
		
		English e=new English();
		e.result2();
		
		Social s=new Social();
		s.result3();
	}
	public static void main(String args[]) {
		LocalInnerClass li = new LocalInnerClass();
		li.resultsOfSubjects();
		
		
	}

}
