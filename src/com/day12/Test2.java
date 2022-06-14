package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 만년달력 
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y,m,i,week;
		
		do {
			System.out.print("년도? ");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("월? ");
			m = sc.nextInt();
		}while(m<1 || m>12);
		
		cal.set(y, m-1,1);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		//System.out.println(week);
		
		//출력
		
		int lastDay = cal.getActualMaximum(Calendar.DATE);
		
		System.out.printf("-----------%d년 %d월---------------",y,m);
		System.out.println("\n   일    월    화    수    목   금   토 ");
		
		for(i=1; i<week; i++) {
			System.out.print("     ");
		}
		
		for(i=1; i<=lastDay; i++) {
			System.out.printf("%5d", i);
			
			week++;
			
			if(week % 7 ==1) {
				System.out.println();
			}
		}
		if(week %7 !=1) {
			System.out.println();
		}
		
		
	}

}
