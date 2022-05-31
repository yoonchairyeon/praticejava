package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int su = 0; //su의 값 0으로 초기화.
		
		System.out.print("수 입력? ");
		su = Integer.parseInt(br.readLine());
		
		String str;
		
		//삼항연산자(조건 ? 조건의 값이 true : 조건의 값이 false)
		str = su % 2 == 0 ? "짝수" : "홀수";
		str = su > 0 ? "양수" : (su < 0) ? "음수" : "0!";		
		
		//조건연산자.
		//A && B (A and B) : A,B 둘다 true 일 때 true 반환, 둘 중 하나라도 false면 false
		//A || B (A or B) : A 또는 B 둘 중에 하나만 true이면 true,둘 다 true면 true 둘 다 false면 false
		str = su % 4 == 0 && su % 100 != 0 || su % 400 == 0 ? "윤년" : "평년";
		System.out.println(su + " : " + str);	
	}
}
