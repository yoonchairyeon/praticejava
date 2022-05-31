package com.day3;

import java.util.Scanner;

public class Pr2 {

	//두 개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;	//정수형 변수 a,b선언.
		
		System.out.print("정수를 입력해라 : "); 
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a > b) {
			System.out.printf("큰 숫자: %d 작은 숫자: %d",a, b);
		}
		else if(b>=a) {
			System.out.printf("큰 숫자 %d 작은 숫자 %d", b, a);
		}

	}

}
