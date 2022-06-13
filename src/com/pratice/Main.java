package com.pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		int N = sc.nextInt();
		
		while(3<= N ||N<=5000){
			if((N%5 == 0)) {
				result += (N / 5);
				System.out.println(result);	
				break;
			}else {
				N -= 3;
				result++;
			}
			if(N<0){
				System.out.println(-1);
				break;
			}
		}		
	}
}

