package com.day4;

public class Test3 {

	public static void main(String[] args) {
		
		int n,sum;
		sum=0;
		
		// 100까지의 합.
		for(n=1; n<=100; n++) {
			sum += n;	//sum = sum + n
		}
		
		sum=0;
		//홀수의 합.
		for(n=1; n<=100; n+=2) {
			sum += n;
		}
		
		sum=0;
		//짝수의 합.
		for(n=2; n<=100; n+=2) {
			sum += n;
		}
		
		int cnt1=0;
		int cnt2=0;
		for(n=1; n<=100; n++) {
			//홀수의 개수
			if(n % 2 != 0) {
				cnt1++;
			}
			else { //짝수의 개수.
				cnt2++;
			}
			
		}
		System.out.println("홀수의 개수: " + cnt1);
		System.out.println("짝수의 개수: " + cnt2);
		System.out.println("결과 : " + sum);
	}

}
