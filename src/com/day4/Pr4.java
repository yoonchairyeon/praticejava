package com.day4;

public class Pr4 {

	public static void main(String[] args) {
		/*
		 * 
		4. 1에서 100까지의 수중 3의 배수의 갯수
			3의 배수의 개수 : 33
		 */
		int count=0;
		for (int i=1 ; i<=100; i++) {
			if(i%3==0) {
				count++;
			}
		}
		System.out.println("3의 배수의 개수 : " + count);
	}

}
