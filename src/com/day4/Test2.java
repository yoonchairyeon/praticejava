package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		//수를 입력받아 1에서부터 입력받은 수까지의 합계를 구한다.
		
		Scanner sc = new Scanner(System.in);
		
		int su,sum = 0;
		char ch;
		
		while(true) {//무한루프.
			do {
				System.out.print("수 입력? ");
				su = sc.nextInt();
			}while(su<1 || su>5000);
			
			sum=0;
			for(int i=1; i<=su; i++) {
				sum += i;
			}
			System.out.println("1 ~ " + su + "까지의 합: " + sum);
			
			System.out.print("계속할래?[Y/N]"); //y,Y,n,N,1,A,아뇨 
			ch = (char) System.in.read();
			
			if(ch !='y' &&  ch!='Y') {
				//중지. 양쪽의 조건이 !=(같지않다) 이면 연산자 &&를 써야함. ||쓰면 실행이 안된다.
				System.out.println("프로그램 종료!!!!!!!");
				break;
				//break는 while, do!while, for, switch에만 사용할 수 있다.
			}
			
			
		}
	}

}
