package com.day7;

import java.util.Scanner;

class Cc{
	String name;
	int kor;
	String pan;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름? "); //suzy
		name = sc.next();
		
		System.out.print("국어점수? ");//60
		kor = sc.nextInt();
	}
	
	public String cnt() {
		
		if(kor >= 90) {
			pan = "수";
		}else if(kor >= 80) {
			pan = "우";
		}else if(kor >= 70) {
			pan = "미";
		}else if(kor >= 60) {
			pan = "양";
		}else {
			pan = "가";
		}
		return pan;
	}
	public void print(String result) {
		System.out.println(name + "의 국어 점수는 " + kor + "점이고 " + "환산 점수는 [" + pan + "] 입니다.");
	}
}



public class Pr3 {

	public static void main(String[] args) {
		Cc c = new Cc();
		
		c.input();
		String result = c.cnt();
		c.print(result);
	}

}
