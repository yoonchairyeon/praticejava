package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 반복문(for, while, do ~ while)
		
		Scanner sc = new Scanner(System.in);
		
		int dan;
		System.out.print("단 입력? ");
		dan = sc.nextInt();
		
		//for(초기값;최대값;증가값){}
		for(int i = 1; i<=9; i++) { //i = i +1
			//System.out.println( dan + " * " + i + " = " + (dan*i));
			System.out.printf("%d * %d = %d \n", dan,i,(dan*i));
		}
		
		System.out.println("----------------------------");
		
		//초기값
		//while(최대값){증가값}
		int j = 1;
		while(j<=9) {
			System.out.println(dan + " * " + j + " = " + (dan*j));
			j++;
		}
		
		System.out.println("----------------------------");
		
		//초기값
		//do{증가값}while(최대값)
		//do while문에 조건이 맞지 않아서 한 번은 출력 된다.
		int k =1;
		do {
			k++;
			System.out.println(dan + " * " + k + " = " + (dan*k));
		}while(k<9);
		//for문 많이 씀~!
		//while 문을 몇 번 반복해야되는지 모를 때 사용한다. DB에서 데이터 불러올 때 잘 모르겠으면 걍 while문 쓰기.
	}

}
