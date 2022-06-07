package com.day6;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// 45까지의 수중 6개의 난수를 발생시켜 크기순으로 정렬!
		
		Random rd = new Random();
		
		int[] num = new int[6];
		int i,j,temp,n;
		
		n = 0;
		
		
		while(n<6) {
			num[n] = rd.nextInt(45)+1; //1을 더해주는 이유 = 45는 0~44라서 로또에 0이 존재하지 않고 45가 출력이 안되서 +1하면 된다.
			for(i=0; i<n; i++) {	
				if(num[i] == num[n]) {
					n--;	// 0번째 1번째 2번째에서 0번째와 2번째 숫자가 같다면 다시 1번째로 돌아감!
					break;
				}
			}
			n++;
		}
		
		for(i =0; i < num.length -1; i++) {
			for(j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		
		for(int su : num) {
			System.out.printf("%4d",su);
		}

	}

}
