package com.javaex.ex01;

public class Ex06 {
	
	public static void main (String[] args) {
		
		double pi = 3.14;
		
		double result01=5*5*pi;
		
		System.out.println(result01);
		
		pi = 3.14159265358979323;
		double result02 = 5*5*pi;
		System.out.println(result02);
		
		
		//상수로 정의한 경우
		
		final double PI = 3.14;
		double result03=5*5*PI;
		System.out.println(result03);
		
//		PI = 3.14159265358979323;
//		double result04=5*5*PI;
//	    System.out.println(result04);
//		
//		
	}

}
