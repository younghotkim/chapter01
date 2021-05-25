package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		//대입연산자
		System.out.println("대입연산자-----------");
		
		int a = 7;
		int b = 2;
		
		System.out.println(a);
		System.out.println(b);
		
		//산술연산자
		
		System.out.println("산술연산자------------");
		
		System.out.println(a+b);
		System.out.println(a-b);

		System.out.println(a*b);

		System.out.println(a/b);
		System.out.println(a%b);
		
		//산술 연산자 / %
		System.out.println("산술연산자 % --------------");
		System.out.println(11.0 / 2.0);
		System.out.println(11.0 % 2.0);
		
		//부호 연산자
		
		System.out.println("부호연산자---------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		var = -var; //이미 int값이 출력돼서 또 쓸 필요없이 var만 대입해줌
		
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println(var);
		
		//증가, 감소 연산자
		
		System.out.println("증,감연산자 앞-----------------");
		
		System.out.println(a); // a-->7
		System.out.println(++a);
		
		//a의 값이 변했을까?
		System.out.println(a);
		//변했다!
		
		
		
		System.out.println(b); // b-->2
		System.out.println(--b); //b의 값은 변했을까?
		System.out.println(b); // 변했다!
		
		System.out.println("증,감연산자 뒤-----------");
		System.out.println(a); //a --> 9
		System.out.println(a++); //
		System.out.println(a); //다음번에 찍어내면 변한게 나온다!
		
		/*일의 우선순위 차이! 앞에 붙으면 연산먼저 실행하고 그다음 출력
		 * 뒤에 붙으면 출력하고 그다음 연산이라 우리눈에 안보임*/
		
		
		System.out.println(b); //b --> 1
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println(a++ * 10-7);
		System.out.println(a);
		System.out.println(a*10);
		
		System.out.println(b);
		System.out.println(++b*10);
		System.out.println(b);
	

	}

}
