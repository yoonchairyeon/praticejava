package com.score5;

import java.util.Scanner;


public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Score ob = new Score();

		int ch;
		while(true) {
			do {
				System.out.print("1.입력 2.출력 3.저장 4.종료 => ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
			case 1: ob.input(); break;
			case 2: ob.print(); break;
			case 3: ob.saveFile(); break;
			default:
				ob.saveFile();
				System.out.println("=========================");
				System.exit(0);
				
			}	
		}	
	}
}
