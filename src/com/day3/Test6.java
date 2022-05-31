package com.day3;

import java.util.Scanner;

//Scanner : 단락문자의 패턴을 사용해 구분.
//기본 단락은 공백.

public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng,mat;
		// System.out.print("이름 국어 영어 수학? "); //suzy 50 70 80
		//BufferedReader은 이름 국어 영어 수학을 하나의 문자로 본다!
		//Scanner는 공백을 못 읽음.
		
		System.out.print("이름,국어,영어,수학? "); //suzy,50,70,80
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		name = sc.next();
		kor= sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		
		System.out.println(name + " : " + (kor+eng+mat) + "점!!");
		
		sc.close();
		
	}

}
