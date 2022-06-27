package com.pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		A=0; B=0;
		while(sc.hasNext()){
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println((A+B));	
		}
		
		
	}
}