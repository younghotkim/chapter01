package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		
		int[] arrayA = new int[3];
		
		arrayA[0] = 3;
		arrayA[1] = 6;
		arrayA[2] = 9;
		
		for (int i=0; i<arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		
		System.out.println("==================");
		
		int[] arrayB = arrayA;
		
		for (int i=0; i<arrayB.length; i++) {
			System.out.println(arrayB[i]);
		}
		
		//arrayA[1] : 6-->100 으로 값 변경
		//arrayA[1] 변경확인      arrayA[1] 동일하게 변경확인
		
		System.out.println("------------------");
		
		arrayA[1] = 100;
		
		for (int i=0; i<arrayA.length; i++) {
			System.out.println(arrayA[i]);
		}
		
		for (int i=0; i<arrayB.length; i++) {
			System.out.println(arrayB[i]);
		}
		
		

	}

}
