package com.day5;

import java.util.Scanner;

public class Pr1 {

	public static void main(String[] args) {
		//1. 5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
		//   가장 큰수와 적은수를 출력
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		
		System.out.print("5개의 데이터 입력! ");
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
		}
		int i,j,temp;
		
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
		System.out.println("가장 큰 수: "+num[4]+"\n가장 작은 수: "+num[0]);
		
		
		
	}

}
