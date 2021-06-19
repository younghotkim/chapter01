package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		
		// 세부 문법
		
		
		int[] intArray = new int[3];
				
				intArray[0] = 1;
				intArray[1] = 3;
				intArray[2] = 78;
				
				
				for(int i=0; i<intArray.length; i++) {
					System.out.println(intArray[i]);
				}
		
		
		System.out.println("=================");
		
		
		int[] array = new int[] {22, 99, 7};
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
