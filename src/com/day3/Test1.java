package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int num1, num2; //초기화 해도 되고 안해도 된다.. 노란 밑줄이 생기는 건 아직 사용 안했다는 뜻.
		
		System.out.print("첫번째 수? "); //ex)100
		num1 = Integer.parseInt(br.readLine());
				
		System.out.print("두번째 수? "); //ex)200
		num2 = Integer.parseInt(br.readLine());
				
		System.out.printf("%d + %d = %d\t",num1,num2,(num1+num2)); 
		//\t : tab해줌, \n: enter => 이 둘을 묶어서 정규화 표현식이라고 한다.
		
		System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2)); 
		System.out.printf("%d * %d = %d\t",num1,num2,(num1*num2)); 
		System.out.printf("%d / %d = %d\n",num1,num2,num1/num2); //몫 구하기.
		System.out.printf("\t\t%d %% %d = %d\n",num1,num2,num1%num2); //나머지 구하기!
		
		//부등호 : >, >=, <, <=, ==
		//숫자를 부등호로 비교하면 true or false 문자 생성.
		System.out.println("num1 > num2 : " + (num1>num2)); //true or false => boolean 논리형.

	}
}
