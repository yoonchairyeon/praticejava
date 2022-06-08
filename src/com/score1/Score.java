package com.score1;

import java.util.Scanner;

public class Score {
	
	//(protected)
	int inwon;

	Record[] rec; //= new Record()
	//Record형태의 데이터, 배열안에 클래스를 넣을 수 있다.
	//(총 7개 : name, score3개, tot,ave,rank)
	
	Scanner sc = new Scanner(System.in);
	
	//인원수 입력받기.
	public void set() {
		
		do {
			System.out.print("인원수? "); //3
			inwon = sc.nextInt();
		}while(inwon<1 || inwon>10);
		
		rec = new Record[inwon];
	}
	
	//이름과 국영수 입력받기. 총합, 평균 구하기.
	public void input() {
		String[] title = {"국어", "영어", "수학"};
		
		for(int i =0; i<inwon; i ++) {
			rec[i] = new Record();
			
			System.out.print("이름은? ");
			rec[i].name = sc.next();
			for(int j =0; j<3; j++) {
				System.out.print(title[j] +"점수는? ");
				rec[i].score[j] = sc.nextInt();
				rec[i].tot += rec[i].score[j];
			}	
			rec[i].ave = rec[i].tot/3;
		}
	}
	
	//랭크 입력받기.
	private void ranking() {
		int i,j;
		
		//rank 초기화!
		for(i=0; i<inwon; i++) {
			rec[i].rank = 1;
		}
		
		//selection sort
		for(i=0; i<inwon-1; i++) {
			for(j=i+1; j<inwon; j++) {
				if(rec[i].tot> rec[j].tot)
					rec[j].rank++;
				else if(rec[i].tot < rec[j].tot)
					rec[i].rank++;
			}
		}
	}
	
	//출력하기.
	public void print() {
		ranking(); //private void ranking()으로 해놨기 때문에 print에서 ranking을 불러온다.
		for(int i=0; i<inwon; i++) {
			System.out.printf("%6s", rec[i].name);
			for(int j=0; j<3; j++) {
				System.out.printf("%4d", rec[i].score[j]);
			}
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].ave);
			System.out.printf("%4d", rec[i].rank);
			System.out.println();
		}
	}
}
