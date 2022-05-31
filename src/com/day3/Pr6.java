package com.day3;

import java.util.Scanner;

public class Pr6 {

	/*
	 * 이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
	-모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
	-한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
	-평균이 60점 미만이면 불합격
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		int sum,avg = 0;
		String name;
		
		System.out.print("이름? ");
		name = sc.next();
		System.out.print("세과목의 점수는? ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sum = a+b+c;
		avg = (a+b+c)/3;
		
		if((a>=40 && b>=40 && c>=40) && avg >=60) {
			System.out.printf("총점 : %d, 평균 : %d, 판정 : 합격.", sum, avg);
		}else if((a<40 || b<40||c<40) && avg >=60) {
			System.out.println("과락!");
		}else if(avg <60) {
			System.out.println("불합격!");
		}
		
		
		
	}
}
