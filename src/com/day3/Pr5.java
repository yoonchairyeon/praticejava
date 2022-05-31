package com.day3;

import java.util.Scanner;

public class Pr5 {
	
	/*
	 단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.
	할인율은 다음과 같습니다.
	10개 이상 -> 10%
	20개 이상 -> 15%
	30개 이상 -> 20%
	판매금액을 계산해봅니다.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		float b,sum;
		
		System.out.print("구입 수량 : ");
		a = sc.nextInt();
		
		if(10 <= a && a <=19) {
			sum = (float) ((15800 * a) * 0.9);
			System.out.printf("판매총금액: %.0f원 ",sum);
		}
		else if(20 <= a && a<=29) {
			sum = (float) ((15800 * a) * 0.85);
			System.out.printf("판매총금액: %.0f원 ",sum);
		}
		else if(30 <= a) {
			sum = (float) ((15800 * a) * 0.8);
			System.out.printf("판매총금액: %.0f원 ",sum);
		}

	}

}
