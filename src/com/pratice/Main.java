package com.pratice;

import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Random rd = new Random();

		int num = rd.nextInt(10000)+1;
		
		System.out.println(num);
	}
}


/*Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0; i<N; i++) {
			a[i] = sc.nextInt();
		}
		
		float M = 0,avg=0;
		
		for(int value : a){
			if(value > M) {
				M = value;
			}
		}
		for(int i=0; i<a.length; i++){
			avg += (a[i]/M*100)/N;
		}	
		System.out.println(avg);*/
