package com.day4;

public class Test6 {

	public static void main(String[] args) {
		//별짓기 나비모양,마름모 모양.
		int i,j;
		for(i=1; i<=5; i++) {	

			for(j=1; j<= 5-i ; j++) {
				System.out.print(" "); //공백한칸.
			}
			
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for(i=5; i>=1; i--) {

			for(j=1; j<= 5 ; j++) {
				System.out.print(" "); //공백한칸.
			}
			
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(i=1; i<=5; i++) {	

			for(j=1; j<= 5-i ; j++) {
				System.out.print(" "); //공백한칸.
			}
			
			for(j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=5; i>=1; i--) {			
			for(j=1; j<= 5-i ; j++) {
				System.out.print(" "); 
			}
			for(j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
