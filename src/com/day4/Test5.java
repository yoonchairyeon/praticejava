package com.day4;

public class Test5 {

	public static void main(String[] args) {
		// 다중 for문. 구구단 만들기.
		
		for(int i=2; i<=9; i++) {
			System.out.println(i + "단!");
			System.out.println();
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
			System.out.println("----------------");
			System.out.println();
		}
	}

}
