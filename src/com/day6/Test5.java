package com.day6;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//index : 01234567890123
		//jumin : 주민번
		//chk	: 234567 892345
		
		//합 = (9*2) + (0*3) + ~ + (2*5)
		//합 = 11-(합%11)
		//합 = 합%10
		//합 == 6
		
		String jumin;
		int[] chk = {2,3,4,5,6,7,8,9,2,3,4,5};
		int i,tot,su;
		System.out.print("주민번호[xxxxxx-xxxxxxx]? ");
		jumin = sc.next();
		
		if(jumin.length()!=14) {
			System.out.println("입력 오류!!");
			return; //stop
		}
		
		tot = 0;
		for(i=0; i<12; i++) {
			if(i >= 6) { //주민번호 뒷자리 비교!
				tot += chk[i] * Integer.parseInt(jumin.substring(i+1,i+2));
			}else { //생년월일 비교!
				tot += chk[i] * Integer.parseInt(jumin.substring(i,i+1));
			}
		}
		su = 11 - tot % 11;
		su = su % 10;
		
		if(su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("대한민국 국민입니다!");
		}else {
			System.out.println("누구세요.");
		}
	}
}


/*
 		String str = "seoul korea";
		//index :     01234567890
		
		System.out.println(str.substring(0,3));//seo 0,1,2번 출력!
		System.out.println(str.substring(6,8));//ko 6,7번 출력!
		System.out.println(str.substring(6)); //k부터 끝까지!
 */

