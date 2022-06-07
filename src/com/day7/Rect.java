package com.day7;

import java.util.Scanner;

public class Rect {
	
	int w,h; //전역변수, instance 변수(복도라고 생각하면 된다) 초기값이 0으로 자동 존재.
	
	public void input() {
	
		Scanner sc = new Scanner(System.in);
		//int w,h; // 지역변수는 초기화 시키지 않으면 쓰레기값이 존재함.
		
		System.out.print("가로? "); //10
		w = sc.nextInt();
		System.out.print("세로? "); //20
		h = sc.nextInt();
		
		// return; -> void에는 안써줌!
	}
	
	//넓이 구하기!
	public int area() {
		
		int result;
		
		result = w * h;
		
		return result;
	}
	
	//둘레 구하기!
	public int length() {
		
		return (w+h)*2;
	}
	
	//출력하기!
	public void print(int a, int l){
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + l);
	}
}
