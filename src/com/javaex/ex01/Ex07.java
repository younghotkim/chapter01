package com.javaex.ex01;

public class Ex07 {

	//자동형변환1: 자동형변환 규칙을 알아야 자료형을 결정할 수 있다.
	
	public static void main(String[] args){
		
		double var01 = 2 + 3.5; //자로형을 알아야한다
		System.out.println(var01);
		
	//자동형변환2: (long + float)
		long var02 = 12345L;
		float var03 = 1.1f;
		System.out.println(var02+var03);//test> 실수(float)
		
		float result01 = var02 + var03;
		System.out.println(result01);
		
		System.out.println("---------------------");
		
		//////////////////////////////////////////
		
		//강제형변환
		
		int var04 = (int)3.14;
		System.out.println(var04);
		
		//강제형변환 - 확대변환
		byte var05 = 127;
		int result02 = (int)var05;
		System.out.println(result02);
		
		
		//축소변환
		
		int var06 = 10;
		byte result03 = (byte) var06;
		
		System.out.println(result03);
		
		//축소변환 비교
		
		int var07 = 10232132;
		byte result04 = (byte)var07;
		System.out.println(result04);
		
		//실수 >>> 정수 : 소수점 날림
		
		System.out.println("------------------");
		
		double var08 = 5.57;
		int result05 = (int)var08;
		System.out.println(result05);
		
		//정수 >>>> 실수 : 소수점 0으로 표현된다 m,e 사용방식
		
		int var09 = 7;
		double result06 = (double)var09;
		System.out.println(result06);
		
		
		//형변환 연습
		
		double v01 = 5/4;
		System.out.println(v01);  //1.0
		//기본값은 integer이다
		//5/4 > 1 > double 형으로 자동변환 1.0
		
		double v02 = (double)5/4;
		//double5 / 4 > double / integer > 1.25
		System.out.println(v02); //1.25
		
		
		double v03 = (double)4; //4.0
		System.out.println(v03);
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04); //1.25
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05); //2
		
		
		
		
		
		
	}
	
	
}
