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
		
		switch(oper) {
		case '+':
			//System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
			System.out.printf("%d %c %d = %d", num1,oper,num2,(num1+num2));
			break;
		case '-':
			//System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
			System.out.printf("%d %c %d = %d", num1,oper,num2,(num1-num2));
			break;
		case '*':
			//System.out.println(num1 + " * " + num2 + " = " +(num1*num2));
			System.out.printf("%d %c %d = %d", num1,oper,num2,(num1*num2));
			break;
		case '/':
			//System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
			System.out.printf("%d %c %d = %d", num1,oper,num2,(num1/num2));
			break;
		default :
			System.out.println("연산 불가!!!!");
		}
		
	}

}
