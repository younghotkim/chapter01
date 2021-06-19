package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
				
		System.out.println("숫자를 입력하세요. [ 0이면 종료]");
		
		int num;
		int sum =0;
		
		
		num = sc.nextInt();	
		sum = sum + num;
		System.out.println("합계: " + sum);
		
		//반복시작
		
		while(num != 0) {
			num=sc.nextInt();
			sum = sum+num;
			System.out.println("합계 " + sum);
		}
		//반복 끝
		
		System.out.println("종료");
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}


			