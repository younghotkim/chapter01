package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무 시간: ");
		
		int t = sc.nextInt();
		
		if(t<=8) {
			System.out.println("10000원");
		}
		
		else {
			System.out.println("12000원");
		}
		
		sc.close();

	}

}
