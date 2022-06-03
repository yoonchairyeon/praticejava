package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//배열 : 같은 형끼리만 가능함. int는 int, float는 float, string은 string!
		//int[] num = new int[5];
					//new =복사다.
		int num[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(num.length +"개의 정수를 입력하라. ");
		
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		
		
		//num[5] = 60;
		
		System.out.println("배열의 개수 : " + num.length + "개!");
		
		for(int i=0; i<=4; i++) {
			System.out.println("배열 num[" + i + "]: " +num[i]);
		}
		
		/*
		System.out.println("num[1]: " +num[1]);
		System.out.println("num[2]: " +num[2]);
		System.out.println("num[3]: " +num[3]);
		System.out.println("num[4]: " +num[4]);
		*/
		//System.out.println("num[5]: " +num[5]);
		
		num[3] = 400;
		System.out.println("num[3]: " +num[3]);
		
		int su = num[1];
		System.out.println(su + ":" + num[1]);
		
		num[4] = num[0] + num[1];
		System.out.println("num[4]: " + num[4]);
		
		
	}

}
