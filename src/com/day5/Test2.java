package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 배열로 만년달력 만들기.
		
		Scanner sc = new Scanner(System.in);
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int y,m,nalsu,i,week;
		
		//년도 물어보기!
		do {
			System.out.print("몇 년도의 달력을 원하는가. "); //2022
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
		
		//1년 1월 1일 부터 (y-1)년 12월 31일까지의 날 수를 계산한다.
		nalsu = (y-1) * 365 + (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		//and(&&) = -, or(||) = +
		
		//int yy = (y-1) / 4 - (y-1) / 100 + (y-1) / 400;
		//System.out.println(nalsu);
		//System.out.println(yy);
		
		//(m-1)월 까지의 날수
		//월		:  1  2  3  4  5  6  7  8  9  10 11 12
		//months: {31,28,31,30,31,30,31,31,30,31,30,31};
		//index: 	0  1  2  3  4  5  6  7  8 9  10 11
		for(i=0; i<m-1; i++) {
			nalsu += months[i];
		}
		
		//System.out.println(nalsu);
		
		//m월 1일의 날수
		nalsu +=1; //nalsu = nalsu + 1;
		
		week = nalsu % 7;
		
		//System.out.println(week);
		//			\n = 2바이트 띄어쓰기 하나당 = 1바이트!
		System.out.println();
		System.out.println("   일  월   화  수  목   금   토 ");
		System.out.println("-----------------------------------");
		
		//특정요일부터 시작하도록 공백을 지정한다.
		for(i=0; i<week; i++) {
			System.out.print("    "); //공백 4칸 지정!
		}
		
		//해당 월의 날짜 출력
		for(i=1; i<=months[m-1]; i++) {
			
			System.out.printf("%4d",i);
			
			week ++;
			if(week % 7 == 0)
				System.out.println();
			
		}
		if(week % 7 != 0)
			System.out.println();
		System.out.println("-----------------------------------");
		
		
		
		
		
	}

}
