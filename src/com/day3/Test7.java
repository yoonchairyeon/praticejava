package com.day3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// 3개의 수를 입력받아 작은 수에서 큰수 순으로 정렬하기.
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3;
		int temp = 0;
		System.out.println("3개의 숫자 입력하라.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 > num2 ) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}if(num1 > num3) {
			temp = num3;
			num3 = num1;
			num1 = temp;
		} if(num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		} 
		System.out.printf("%d %d %d", num1,num2,num3);
	}
}
