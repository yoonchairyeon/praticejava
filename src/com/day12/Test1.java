package com.day12;

import java.util.Calendar;

public class Test1 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//Calendar now1 = new GregorianCalendar();//UPCAST
		
		int y = now.get(Calendar.YEAR);//년 
		int m = now.get(Calendar.MONTH)+1; // 월(0~11)
		int d = now.get(Calendar.DATE);//일 
		int w = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7)
		
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.println(y + "년 " + m + "월 " + d + "일 " + week[w-1]);
		
		//말일 
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay + ":" + endDay);
		System.out.printf("%tF ",now); //날짜!
		System.out.printf("%tT\n",now); //시간!
		
		now.set(2023,10-1,10);
		
		y = now.get(Calendar.YEAR);//년 
		m = now.get(Calendar.MONTH)+1; // 월(0~11)
		d = now.get(Calendar.DATE);//일 
		w = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7)
		System.out.println(y + "년 " + m + "월 " + d + "일 " + week[w-1]);
	}

}
