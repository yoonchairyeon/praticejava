package com.pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력해라.");
		int T = sc.nextInt();
		int s1=0, s2=0;
		int k[] = new int[T];
		int n[] = new int[T];
		for(int i=0; i<T; i++) {
			k[i] = sc.nextInt();
			n[i] = sc.nextInt();
		}
		for(int i=1; i<=T; i++) {
			k[i]+=i;
			n[i]+=k[i];
			System.out.println(n[i]);
		}
		
		
		
	}
}

// 0층 1호에는 1명산다. 1층 3호살면 0층 1호부터 3호까지
// inwon = (1)+(1+2) +...+ (1+...+n)
/* 1층 1호는 1명 1층 2호는 3ㄴ명 
 * 1명 + 2명 + 3명 => 1층 3호는 6명
 * 2층 3호살면 1층 1호부터 3호까지 1명 3명 6명 총 10
 * while(n<10) {
			n++;
			s1+=n;
			s2+=s1;
		}
 * */
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
