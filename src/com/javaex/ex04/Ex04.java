package com.javaex.ex04;



public class Ex04 {

	public static void main(String[] args) {
		
		
		
		int sum = 0;
		
	
	
		for ( int i=1; i<=10; i++) {
			
			
			
			
			sum = sum + i; 
			
			
			
			System.out.println(i + "까지의 합은" + sum);
			
			/* 
			 
			 기본값 0
			 
			 sum = sum + i
			 
			 01: 0 + 1
			 02: 0 + 1 + 2
			 03: 0 + 1 + 2 + 3 (2회까지의 합 + 3)
			 ...
			 06: (5회까지의 합) + 6
			
			
			
			*/
		}
		
		
		
		
		
		
	}

}
