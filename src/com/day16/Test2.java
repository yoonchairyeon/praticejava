package com.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static String getOper() throws Exception{
		
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
				
		String oper = "";
		
		try {
			System.out.print("연산자? ");
			oper = br.readLine();
			
			if(!oper.equals("+") && !oper.equals("-") && 
					!oper.equals("*") && !oper.equals("/")) {
				//양쪽이 부정이면 &&
				//사용자 정의 에러 
				
				//try cath 안에 코딩해줘야 한다!
				//throws에서 Exception처리를 해줘야 한다.
				throw new Exception("연산자 입력 오류!!!!!!!");
			}
				
			
		}catch(IOException e) {
			System.out.println("입력 에러!");
		}
		return oper;	
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
		
		int num1,num2,result;
		String oper;
		
		try {
			System.out.print("첫번째 수? ");
			num1 = Integer.parseInt(br.readLine());
			
			System.out.print("두번째 수? ");
			num2 = Integer.parseInt(br.readLine());
			
			oper = Test2.getOper();
			
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
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
