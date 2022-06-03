package com.pratice;

import java.util.Scanner;

public class Pp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
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
		
		for(i=0; i<num.length; i++) {
			System.out.printf("%3d",num[i]);
		}
	
	}
}
//정수를 입력받으면 각가 쪼개기...