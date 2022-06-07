package com.day7;

class Abc{
	int n,sum1,sum2,sum3;
	
	public int cnt1() {
		// 100까지의 합.
		for(n=1; n<=100; n++) {
			sum1 += n;	
		}
		return sum1;
	}
	
	public int cnt2() {
		//홀수의 합.
		for(n=1; n<=100; n+=2) {
			sum2 += n;
		}
		return sum2;
	}
	
	public int cnt3() {
		//짝수의 합.
		for(n=2; n<=100; n+=2) {
			sum3 += n;
		}
		return sum3;
	}
	
	public void print(int sum1) {
		System.out.println("1부터 100까지 합: " + sum1);	
		System.out.println("1부터 100까지 홀수의 합: " + sum2);
		System.out.println("1부터 100까지 짝수의 합: " + sum3);	
	}
	
}


public class Pr1 {

	public static void main(String[] args) {
		Abc a = new Abc();
		
		int sum1 = a.cnt1();
		int sum2 = a.cnt2();
		int sum3 = a.cnt3();
		a.print(sum1);
		
		
	}
}

/*
*/