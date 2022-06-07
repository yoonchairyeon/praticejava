package com.day7;

import java.util.Scanner;

class Hap{
	int su, sum; //초기값 항상 0으로 지정되어 있다!
	
	//숫자 입력하기.
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력? ");
		su = sc.nextInt();
	}
	
	//연산하기.
	public int cnt() {
		for(int i =1; i<=su; i++) {
			sum += i;
		}
		return sum;
	}
	
	//출력하기.
	public void print(int result) {
		System.out.println("1부터 " + su + "까지의 합 : "+ result);
	}
}


public class Test3 {

	public static void main(String[] args) {
		Hap h = new Hap();
		
		h.input();
		int sum = h.cnt();
		h.print(sum);
		

	}

}
