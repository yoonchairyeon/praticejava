package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 년(y), 월(m), 일(d)
		//입력 받아 2022년 6월 2일 목요일 이 나오도록!!
		
		Scanner sc = new Scanner(System.in);
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String a[] = {"일요일", "월요일" ,"화요일" ,"수요일", "목요일", "금요일", "토요일" };
		int y,m,d,nalsu,i,week;
		
		
		//년도 물어보기!
		do {
			System.out.print("몇 년? "); //2022
			y = sc.nextInt();
		}while(y<1);
		
		//월 물어보기!
		do {
			System.out.print("월은? ");
			m = sc.nextInt();
		}while(m<1 || m > 12);
		
		//y년이 윤년인지 아닌지 확인하기!
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			months[1] = 29;
		}
		
		//일 물어보기!
		do {
			System.out.print("일은? ");
			d = sc.nextInt();
		}while(d<1 || d> months[m-1]);
		
		//1년 1월 1일 부터 (y-1)년 12월 31일까지의 날 수를 계산한다.
		nalsu = (y-1) * 365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		
		for(i=0; i<m-1; i++) {
			nalsu += months[i];
		}
		
		nalsu += d;
		week = nalsu % 7;		
		
		System.out.printf("%d년 %d월 %d일 %s",y,m,d,a[week]);
		
		
		
	}
}
