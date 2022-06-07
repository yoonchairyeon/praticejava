package com.day7;

class Bu {
	int[] num = {28, 20, 15, 10, 8};
	
	int i,j, temp;
	
	public void input() {
		System.out.print("souce data : ");
		for(int su : num) {
			System.out.printf("%4d",su);
		}
		System.out.println();
	}
	
	public void cnt() {
		for(i=1; i<num.length; i++) {
			for(j=0; j<num.length-i; j++) {
				//System.out.println(j + " : " + (j+1));
				if(num[j]>num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
	}
	
	public void print() {
		System.out.print("sorted data : ");
		for(int su : num) {
			System.out.printf("%4d",su);
		}
		System.out.println();
	}
}

public class Pr5 {

	public static void main(String[] args) {
		Bu b = new Bu();
		
		b.input();
		b.cnt();
		b.print();
	}

}
