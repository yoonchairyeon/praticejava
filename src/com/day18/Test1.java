package com.day18;

//stream
//데이터 입출력시 모든 데이터의 형태와는 관계없이
//단방향 흐름으로 데이터를 전송하는 클래스이다.

//in.read, out.print(오로지 1바이트의 문장만 읽는다)

// in : 기본 입력 스트림(바이트 스트림)

public class Test1 {

	public static void main(String[] args) throws Exception {
		
		int data;
		System.out.print("문자열?"); //ab		
		
		while((data=System.in.read())!=-1) {
			
			char ch = (char) data;
			System.out.print(ch);
		}		
	}
}
