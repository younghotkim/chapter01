package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무 시간: ");
		
		int t = sc.nextInt();
		
		if(t<=8) {
			System.out.print("임금은 " + t*10000 + "원 입니다.");
		}
		
		else {
			System.out.println("임금은 " + (80000+(t-8)*12000) + "원 입니다.");
		}
		
		/* int = sum
		 * 
		 * iF(t > 8) {
		 * sum = 80000 + (t-8)*12000
		 * Sytem.out.println(sum);
		 * 
		 * else {
		 * 	sum = t*10000
		 * Sysout(sun);
		 * 
		 */
		
		sc.close();

	}

}
