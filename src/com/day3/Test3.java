package com.day3;

import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		char ch,result;
		
		//ch = 'a'; //97이라는 ASCII 값 들어감. 
		//System.out.println(ch);
		//System.out.println(Integer.toString(ch)); //97
		
		System.out.print("한개의 문자? ");//abcy
		ch = (char) System.in.read();
	
		result = ch >= 65 && ch <=90 ? (char)(ch+32):
			(ch >='a' && ch <='z' ? (char)(ch -32) : ch);
		System.out.println(ch + ":" + result);
		
	}

}
		//ch는 오로지 한개의 문자만 넣ㅇ르 수 있다.
		//ch = "a"; 문자 넣을 때 무조건 '작은 따옴표 용해야함
		//ch = 'a'; -> o 
		//ch = 'abcd';
		// ch = '가; -> o
