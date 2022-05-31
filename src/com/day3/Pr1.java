package com.day3;

import java.util.Scanner;

public class Pr1 {
	
	//정수를 입력 받아서 짝수, 홀수를 구별해서 출력.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;	//정수형 변수 a 선언.
		
		System.out.print("정수를 입력해라 : "); 
		a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수");
		}
		else if(a %2 ==1) {
			System.out.println("홀수");
		}
		
	}
}
