package com.day9;

import java.util.Scanner;

public class Score {
	int inwon;
	String pan;
	String[] title = {"국어", "영어", "수학"};
	Record[] rec;

	Scanner sc = new Scanner(System.in);
	
	public void set() {
		
		do {
			System.out.print("인원수? ");
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10);
		
		rec = new Record[inwon];
	}
	
	public void input() {
		for(int i =0; i<inwon; i ++) {
			rec[i] = new Record();
			
			System.out.print((i+1) +"번째 이름은? ");
			rec[i].name = sc.next();
			for(int j =0; j<3; j++) {
				System.out.print(title[j] +"점수는? ");
				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];
			}	
			rec[i].ave = rec[i].tot/3;
			System.out.println();
		}
	}
	
	//수우미양가구하기.
	public void songjuck() {
		for(int i =0; i<inwon; i++) {
			for(int j=0; j<3; j++) {
				if(rec[i].score[j] >= 90) {
					pan = "수";
				}else if(rec[i].score[j] >= 80) {
					pan = "우";
				}else if(rec[i].score[j] >= 70) {
					pan = "미";
				}else if(rec[i].score[j] >= 60) {
					pan = "양";
				}else {
					pan = "가";
				}
				rec[i].pan[j] = pan;
			}
			
		}
	}
	
	//출력하기.
	public void print() {
		System.out.println("   이름   국어     영어     수학    총합    평균!");
		for(int i=0; i<inwon; i++) {
			System.out.printf("%5s", rec[i].name);
			for(int j=0; j<3; j++) {
				System.out.printf("%4d(%s)", rec[i].score[j],rec[i].pan[j]);
			}
			
			System.out.printf("%6d", rec[i].tot);
			System.out.printf("%6d\n", rec[i].ave);
			System.out.println();
		}
	}
}
