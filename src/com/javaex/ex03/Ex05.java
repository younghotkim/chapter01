package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int t = sc.nextInt();
		
		if(t<=8) {
			System.out.print("임금은 " + t*10000 + "원 입니다.");
		}
		
		else {
			System.out.print("임금은" + (80000+(t-8)*15000) + "원 입니다.");
		}
		
		
		sc.close();

	}

}
