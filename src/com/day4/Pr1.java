package com.day4;

public class Pr1 {
	public static void main(String[] args) {
		/*
		 * 1. (1)+(1+2)+(1+2+3)+...+(1+2+3+...+10)
		결과 : 220
		
		 */
		
		int n=0,s1=0,s2=0;
		
		while(n<10) {
			n++;
			s1+=n;
			s2+=s1;
		}
			
		System.out.println("결과 : " + s2);
		
	}
}
