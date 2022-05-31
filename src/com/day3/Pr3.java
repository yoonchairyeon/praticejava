package com.day3;

import java.util.Scanner;

public class Pr3 {
	
	//네 개의 정수를 입력 받고, 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력.(if문 이용)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,temp; //a < b < c < d 순으로 크기.
		
		System.out.print("네 개의 정수를 입력해라 : "); 
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if(a>b) {
			temp = a;
			a = b;
			b = temp;
		}
		if(c>d) {
			temp = c;
			c = d;
			d = temp;
		}
		if(b>d) {
			temp = b;
			b = d;
			d = temp;
		}
		if(a>c) {
			temp = a;
			a = c;
			c = temp;
		}
		System.out.printf("큰 숫자: %d 작은 숫자: %d",d,a);
		
	}

}
