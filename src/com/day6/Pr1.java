package com.day6;

import java.util.Random;
import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		/*
		  1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
   		   (3번안에 알아맞추지 못하면 발생된 난수를 출력)
		 */
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] num = new int[3];
		int i,n = 0;
		String s = " ";
		int a = rd.nextInt(10)+1;
		
		for(i=0; i<3; i++) {
			System.out.print("정수입력?[" + (i+1) + "번째기회] : ");
			num[i] = sc.nextInt(); 
			
			if(num[i]!=a) {
				System.out.println("틀렸어요!!");
			}else if(num[i]==a) {
				System.out.println("맞았어요!!");
			}
		}
		System.out.println("정답은 " + a + "입니다.");
			
		System.out.print("계속할래?[Y/N] : " + s);
		s = sc.next();

	}

}

/*
 예)
정수입력?[1번째기회] : 3
틀렸어요!!
정수입력?[2번째기회] : 5
틀렸어요!!
정수입력?[3번째기회] : 7
틀렸어요!!

정답은 2입니다

계속할래?[Y/N] : 
 */
