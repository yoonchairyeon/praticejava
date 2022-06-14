package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 오늘을 기준으로 x일 후 2022년 6월 15일 수요일 
		//년도? 2022
		//월? 6
		//일? 14
		//며칠후? 100
		//만난날 : 2022년 6월 14일 화요일 
		//100일 후 : 2022년 9월 10일 토요일 
		
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		String[] weeks = {"일","월","화","수","목","금","토"};
		
		int y,m,d,w,week;
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		do {
			System.out.print("년도? ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월? ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		do {
			System.out.print("일? ");
			d = sc.nextInt();
		}while(d<1 || d>31);
		
		
		System.out.print("며칠 후? ");
		week = sc.nextInt();
		
		
		System.out.println("만난 날 : "+ y + "년 " + m + "월 " + d + "일 " + weeks[w-1] + "요일 ");
		
		cal.set(y,m-1, d);
		System.out.println(week+ "일 후 : "+ y + "년 " + m + "월 " + d + "일 " + weeks[w-1] + "요일 ");
	
	}

}
