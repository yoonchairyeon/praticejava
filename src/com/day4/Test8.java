package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		char oper;
		
		System.out.print("첫번째수? ");
		num1 = sc.nextInt();
		
		System.out.print("두번째수? ");
		num2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/]? ");//+
		oper = (char)System.in.read();
		
		int result = 0;
		
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
		System.out.printf("%d %c %d = %d", num1,oper,num2,result);
	}

}
