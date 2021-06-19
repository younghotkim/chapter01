package com.javaex.ex05;

	//java Ex11
	// java Ex11 i am Kim young ha

	// java String[] args = new String[5];
	
public class Ex11 {

	

	public static void main(String[] args) {
		
		if(args.length>0) {
			
			if(args.equals("-version")) { // Ex11 -version
				System.out.println("Ex11 버전: 3.4343");
			}
			
			else if(args[0].equals("-help")) { //Ex11 -help
				System.out.println("도움말 입니다.");
				System.out.println("-version]: 버전 정보를 확인할 수 있습니다.");
				System.out.println("-help]: 도움말을 볼 수 있습니다.");
			}
		
			
		}	else { // Ex11 i am kim young ha
			
			for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		}
	}

}
