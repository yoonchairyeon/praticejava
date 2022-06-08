package com.day7;

import java.util.Random;

class Star{
	Random rd = new Random();
	
	int[] num = new int[6];
	int i,j,temp,n;
	
	public void input() {
		while(n<6) {
			num[n] = rd.nextInt(45)+1;
			for(i=0; i<n; i++) {	
				if(num[i] == num[n]) {
					n--;	
					break;
				}
			}
			n++;
		}
	}

	
	public void cnt() {
		for(i =0; i < num.length -1; i++) {
			for(j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
	}
	
	public void print() {
		for(int su : num) {
			System.out.printf("%4d",su);
		}

	}
	
}

public class Pr6 {

	public static void main(String[] args) {
		Star s = new Star();
		
		s.input();
		s.cnt();
		s.print();

	}

}
