package com.day9;

public class Test4 {

	int a = 5;
	
	//초기화 블럭
	{
		System.out.println("초기화 블럭a : " + a);
		a = 10;
		System.out.println("초기화 블럭a : " + a);
	}
	
	//System.out.println("초기화 블럭a : " + a);
	
	static int b;
	static {//static 블럭 
		b=10;
		System.out.println("초기화 블럭b : " + b);
	}
	final int C; //상수변수 : 대부분 대문자로 쓴다.
	
	public Test4() {
		System.out.println("생성자..");
		C = 100;
		System.out.println("C : " + C);
		
	}

	public static void main(String[] args) {
		Test4 ob1 = new Test4();
		//우선 static 출력되서 초기화블럭 b나오고
		//그 다음에 new Test4해서 초기화블럭 a=5, a = 10출력되고 
		//final 생성자, c : 100 출력!
		
		Test4 ob2 = new Test4();
		//static이미 출력되서 패스.
		//그 다음에 new Test4해서 초기화블럭 a=5, a = 10출력되고 
		//final 생성자, c : 100 출력!
		
		//static -> new(instace 변수, 메소드) -> 생성자 순으로 실행된다.
	}

}
