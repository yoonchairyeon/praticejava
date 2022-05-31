package com.day4;

public class Pr6 {

	public static void main(String[] args) {
		for(int i=2; i<=9; i+=4) {
			for(int j=1; j<=9; j++) {
				for(int k = i; k< i+4; k++) {
					System.out.printf("%d * %d = %d\t", k,j,(k*j));
				}
				
				System.out.println();
				
			}
			System.out.println();
			
		}
	}
}
/*
 * 				for(int k=1; k<=4; k++) {
					System.out.print(i + " * " + j +" = " + (i*j)+ "\t");
				}
 */
