package com.day4;

import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		/*
		 * 2. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합
	짝수합 : 2550
	홀수합 : 2500
	합 : 5050
		 */
		Scanner sc = new Scanner(System.in);
		int n,sum1 = 0,sum2=0,sum3=0;
		
		for(n=2; n<=100; n+=2) {
			sum2 += n;
		}
		System.out.println("짝수의 합: " + sum2);
		
		for(n=1; n<=100; n+=2) {
			sum1 += n;
		}
		System.out.println("홀수의 합: " + sum1);
		
		
		
		for(n=1; n<=100; n++) {
			sum3 += n;
		}
		System.out.println("전체의 합: " + sum3);
	}

}
