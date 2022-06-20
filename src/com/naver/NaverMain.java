package com.naver;

import java.util.Scanner;

public class NaverMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Naver ob = new NaverImpl();
		
		int ch;
		while(true) {
			do {
				System.out.print("1.회원가입 2.회원전체출력 3.아이디검색 "
						+ "4.종료 \n");
				System.out.print(": ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
				case 1: ob.input(); break;
				case 2: ob.print(); break;
				case 3: ob.findId();break;
				default:
					System.out.println("회원가입시스템을 종료합니다.");
					System.exit(0);
					
			}
		}
	}

}
