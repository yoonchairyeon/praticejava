package com.day4;

import java.util.Scanner;

public class Pr3 {

	public static void main(String[] args) {
		/*
		 * 3. 1-2+3-4+5-6+7-8+9-10
		 * 
			결과 : -5
		 */
		Scanner sc = new Scanner(System.in);
		int n1=0; 
		
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0 ) {
				n1 = n1 - i;
			}else {
				n1 = n1 + i;
			}
		}
		System.out.printf("결과 : %d ", n1);
		
	}

}
