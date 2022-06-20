package com.day16;

import java.util.InputMismatchException;
import java.util.Scanner;

//Exception 클래스(예외처리)
// try - catch 문 

public class Test1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num1,num2,result;
	
	String oper;
	
	try {
		
		System.out.print("두개의 수? ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.print("연산자? ");
		oper = sc.next();
		
		result = 0;
		if(oper.equals("+")) {
			//oper = string이므로 equals로 비교!
			result = num1 + num2;
		}else if(oper.equals("-")) {
			result = num1 - num2;
		}else if(oper.equals("*")) {
			result = num1 * num2;
		}else if(oper.equals("/")) {
			result = num1 / num2;
		}
		
		System.out.printf("%d %s %d = %d \n",num1,oper,num2,result);
	} catch(InputMismatchException e) {
		System.out.println(e.toString()); //많이 사용!
		System.out.println("정수를 입력하세요!");
	}catch(ArithmeticException e) {
		System.out.println("0으로 나눌 수 없습니다.");
	}catch(Exception e) { //exception : 제일 먼저 나오면 나머지 예외처리 못함!
		//e.printStackTrace();
		System.out.println("그 밖의 에러!");
	}
	}
}
