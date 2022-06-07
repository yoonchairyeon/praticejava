package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Pr2 {

	public static void main(String[] args) {
		/* 
		 	1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
  			1:가위, 2:바위, 3:보
  			1:가위, 2:바위, 3:보 ?1
			컴퓨터 :보 사람 :가위
			당신이 이겼습니다!
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		String[] s = {"가위", "바위", "보"};
		int com, user;
		com = rd.nextInt(3) ;// + 1
		
		System.out.println(s[com]); //com -1
		
		do {
			System.out.print("1:가위, 2:바위, 3:보 ? ");
			user = sc.nextInt() - 1;
		}while(user<0 || user>2);
		System.out.println("사람 : " + s[user] + ", 컴퓨터: " + s[com]);
		String result = " ";
		
		/*
		 result = "무승부!";
		 if((user ==1 &&com ==3) || (user>com && !(com ==1 && user ==3))) {
			result = "사람이 이겼습니다!";
		}
		if((user ==3 &&com ==1) || (user<com && !(com ==3 && user ==1))) {
			result = "컴퓨터가 이겼습니다!";
		}
		 */
		
		if(com == user)
			result = "무승부!";
		else if((user+2)%3==com)
			result = "사람이 이겼습니다!";
		else
			result = "컴퓨터가 이겼습니다!";
		System.out.println("결과 : " + result);
	}
}
