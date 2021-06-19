package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		//두 배열이 같은지 판단
		
		int[] arrayA = new int[3];
		
		arrayA[0] = 10;
		arrayA[1] = 20;
		arrayA[2] = 70;
		

		int[] arrayB = new int[3];
		
		arrayB[0] = 10;
		arrayB[1] = 70;
		arrayB[2] = 30;
		//arrayB[3] = 40;
		
		//배열A   배열B 같은지 판단 --> 배열의 갯수가 같아야 한다. 값이 순서가 같아야 한다.
		
		
		if (arrayA.length == arrayB.length) { //배열의 갯수가 같다
			//첫번째 부터 값 비교
			
			//비교
			
			for (int i=0; i<arrayA.length; i++) {
			
				if (arrayA[i] != arrayB[i]) {
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}
				
			
		} 
		
		else { //배열의 크기가 다르다
					System.out.println("배열의 크기가 다릅니다.");
	
		}
			
	}	
	
	

			
			
			
					

		
		
		
		
		
		
	}


