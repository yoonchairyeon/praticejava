package com.day3;

import java.util.Scanner;

public class Pr4 {

	//년도를 입력받고, 윤년인지 아닌지를 출력.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su = 0;
		String str;
		
		System.out.print("지금은 몇년인가? ");
		su = sc.nextInt();
		
		str = su % 4 == 0 && su % 100 != 0 || su % 400 == 0 ? "윤년" : "평년";
		//  1. (su를 4로 나눈 나머지가 0이고 su를 100으로 나눈 나머지가 0이 아닌 것) 
		// 또는 (su를 400으로 나눈 나머지가 0인 경우) 가 true면 윤년이고 false면 평년
		System.out.println(su + " : " + str);
	}

}
