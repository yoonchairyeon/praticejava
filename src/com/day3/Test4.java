package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {
	public static void main(String[] args) throws IOException {
		
		//제어문.
		//if,반복문(for, while, do~while), switch문.
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int num;
		String str = ""; //null로 초기
		
		System.out.print("수 입력? "); //50
		num = Integer.parseInt(br.readLine());
		
		//단일 if문.
		//if(조건식){작업} => 조건식이 true이면 작업 실행 아니면 작업 실행 안함.
		/*
		if (num % 2 == 0) {
			str = "짝수";
		} 
		if(num % 2 != 0) {
			str = "홀수";
		}
		*/
		
		//if ~else => str을 초기화 안해줘도 상관 없다.
		
		if(num %2 ==0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		
		
		
		
		System.out.println(num + ":" + str);
		
	}
}
