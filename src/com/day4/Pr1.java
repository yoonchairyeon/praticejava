package com.day4;

public class Pr1 {
	public static void main(String[] args) {
		/*
		 * 1. (1)+(1+2)+(1+2+3)+...+(1+2+3+...+10)
		결과 : 22
		 */
		int i,j = 0;
		
		for(i=1; i<=10; i++) {
			for(j=1; j<=i; j++) {
			}
		}
		System.out.printf("결과 : %d",i+j);
	}
}
