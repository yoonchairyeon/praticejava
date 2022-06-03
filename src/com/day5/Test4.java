package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		//selection sort(선택 정렬)
		/*
		      35 27 13 7 2 로 선택 정렬을 한다고 했을 때.
		 1회전 27 35 13 7 2 -> 13 35 27 7 2 -> 7 35 27 13 2 -> 2 35 27 13 7
		 2회전 2 27 35 13 7 -> 2 13 35 27 7 -> 2 7 35 27 13
		 3회전 2 7 27 35 13 -> 2 7 13 35 27
		 4회전 2 7 13 27 35 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 개수 입력! ");
		int n = sc.nextInt();
		int[] num = new int[n];
		
		System.out.print(n +"개의 데이터 입력! ");
		for(int i=0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		int i,j,temp;
		
		System.out.print("Source Data: ");
		for(i=0; i<num.length; i++) {
			System.out.printf("%3d",num[i]);
		}
		System.out.println();
		
		for(i =0; i < num.length -1; i++) {
			for(j=i+1; j<num.length; j++) {
				//System.out.println(i + ":" + j);
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.print("Source Data: ");
		/*
		 for(i=0; i<num.length; i++) {
			System.out.printf("%3d",num[i]);
		}
		 */
		for(int su : num) { 
			//확장 for문 : 알아서 배열의 크기만큼 꺼내줌! 배열일 때만 사용함!
			//(for each문 : 자바스크립트등 다른 언어(c언어, c#등 제외하고!)에서 each가 나오면 반복문!)!
			System.out.printf("%3d",su);
		}
		System.out.println();
		
	}
}
