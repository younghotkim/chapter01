package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {


		int[] no = new int[8];   //갯수  ex) 6-->8
		
		//방갯수 변경될때 for문에서 갯수 부분을 변경 해줘야 함
	
		for (int i=0; i<8; i++) {
			no[i] = (int)(Math.random()*45)+1;
		}
		
		
		
		for (int i=0; i<no.length; i++) { // >>> i<8
			
			System.out.println(no[i]);
		}
		
			System.out.println("==============================");

		for (int i=0; i<6; i++) {  //<<갯수 수정을 안해도 오류가 안남 .6개만 출력.
				
			System.out.println(no[i]);	
			
			
			System.out.println("==========================");
			
			System.out.println(no.length);
			
			
			
			
		}
	
	}

}