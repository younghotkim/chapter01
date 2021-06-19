package com.javaex.ex04;

import java.util.Scanner;

public class Ex11_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("숫자를 입력하세요. [ 0이면 종료]");
		
		int num;
		int sum =0;
		
		while(true) {
			
			num = sc.nextInt();
			sum = sum+num;
			System.out.println("합계: " + sum);
			
			if(num==0) {
				break;
			}
			
			
			
		}
		
		
		System.out.println("종료");
		
		
		
		sc.close();
		
	}

}


			