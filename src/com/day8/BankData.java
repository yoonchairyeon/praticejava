package com.day8;

import java.util.Scanner;

public class BankData {
	
	int customer;
	Bank[] ban;
	//고객이름, (은행 이름 )잔고, 잔고합계, 잔고 순위.
	
	Scanner sc = new Scanner(System.in);

	//고객 몇명인지 입력받기.
	public void set() {
		do {
			System.out.print("고객 수? ");
			customer = sc.nextInt();
		}while(customer <1);
		
		ban = new Bank[customer];
	}
	
	public void input() {
		String[] title = {"하나", "우리", "신한"};
		
		for(int i =0; i<customer; i ++) {
			ban[i] = new Bank();
			
			System.out.print("고객의 이름은? ");
			ban[i].name = sc.next();
			
			for(int j =0; j<customer; j++) {
				System.out.print(title[j] +"은행 잔고는? ");
				ban[i].bankbalance[j] = sc.nextInt();
				ban[i].tot += ban[i].bankbalance[j];
			}	
		}
	}
	
	public void ranking() {
		int i,j;
		
		//rank 초기화!
		for(i=0; i<customer; i++) {
			ban[i].rank = 1;
		}
		
		//selection sort
		for(i=0; i<customer-1; i++) {
			for(j=i+1; j<customer; j++) {
				if(ban[i].tot> ban[j].tot)
					ban[j].rank++;
				else if(ban[i].tot < ban[j].tot)
					ban[i].rank++;
			}
		}
	}
	
	public void print() {
			System.out.println("\t고객"+ "   하나"+ "   우리"+ "   신한"+"   총합" + "   순위");
		for(int i=0; i<customer; i++) {
			System.out.printf("%5s 고객님 ", ban[i].name);
			for(int j=0; j<customer; j++) {
				System.out.printf("%4d원", ban[i].bankbalance[j]);
			}
			System.out.printf("%6d원", ban[i].tot);
			System.out.printf("%4d", ban[i].rank);
			System.out.println();
		}
	}
	
}
/*
 * 자신이 갖고 있는 은행계좌
은행이름

리콜라

신한은행 국민은행 하나은행

은행별 잔고, 은행들잔고 합계, 순서
*/