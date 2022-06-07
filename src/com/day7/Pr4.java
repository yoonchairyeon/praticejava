package com.day7;

import java.util.Scanner;

class St{
	int dan;
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력?(1~9) ");
		dan = sc.nextInt();
	}
	
	public void print(){
		for(int i = 1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", dan,i,(dan*i));
		}
	}
}

public class Pr4 {

	public static void main(String[] args) {
		St s = new St();
		s.input();
		s.print();

	}

}
