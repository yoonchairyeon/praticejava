package com.day4;

import java.util.Scanner;

public class Pr5 {

	public static void main(String[] args) {
		/*
		 * 5. 두수를 입력받아 적은 수에서 큰수까지의 합
			1~100 까지의 합 : 5050
		 */
		Scanner sc = new Scanner(System.in);
		int a,b,sum1 = 0, sum2 = 0;
		System.out.print("두 수를 입력하라 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			System.out.printf("%d ~ %d 까지의 합 : ",b,a);
			for(int i=b; i<=a; i++) {
				sum1 += i;
			}
			System.out.printf("%d", sum1);
			 
		} 
		else {
			System.out.printf("%d ~ %d 까지의 합 : ",a,b);
			for(int i=a; i<=b; i++) {
				sum2 += i ;
			}
			System.out.printf("%d", sum2);
		}

	}

}
