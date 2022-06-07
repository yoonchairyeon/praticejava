package com.day7;

import java.io.IOException;
import java.util.Scanner;

class Ba {
	int num1,num2;
	char oper;
	int result = 0;
	
	public void input() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째수? ");
		num1 = sc.nextInt();
		
		System.out.print("두번째수? ");
		num2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/]? ");//+
		oper = (char)System.in.read();
	}
	
	public int cnt() {
		switch(oper) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default :
			System.out.println("연산 불가!!!!");
		}
		return result;
	}
	
	public void print(int result) {
		System.out.printf("%d %c %d = %d", num1,oper,num2,result);
	}
}


public class Pr2 {
	public static void main(String[] args) throws IOException {
		
		Ba b = new Ba();
		
		b.input();
		int sum = b.cnt();
		b.print(sum);
		
	}

}
