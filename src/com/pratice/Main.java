package com.pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i,j;
		for(i=N; i>=1; i--) {
			for(j=1; j<= N-i ; j++) {
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}


/*
 v <= (a - b)*n
 
*/