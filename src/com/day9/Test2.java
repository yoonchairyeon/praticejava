package com.day9;

/*	생성자를 사용하면 좋은점 
 * 1. 메모리 할당 (객체생성)
 * 2. 변수 초기화 
 * 생성자의 특징들 
 * 생성자는 클래스의 이름과 동일하다. 
 * 리턴값이 없기때문에 property(void int)가 없다.
 * 중복정의가 가능하다.
 * 생성자에서 다른 생성자를 호출할 수 있다.
 * 단, 맨 선두에서 한번만 호출가능하다. */

public class Test2 {

	private int x;
	
	public Test2() { //기본생성자 
		
		//this(30);
		
		// System.out.println("기본생성자!");
		// x= 10;
		// System.out.println("x: " + x);
	}
	public Test2(int x) {  // 생성자 중복 정의 
		
		//this();
		
		//System.out.println("오버로딩된 생성자!");
		this.x = x;
		//System.out.println("x: " + x);
	}
	
	public void setData(int x) {
		this.x = x;
	}
	
	
	public static void main(String[] args) {
	
		Test2 ob1 = new Test2();
		
		System.out.println(ob1.x);
		ob1.setData(100);
		System.out.println(ob1.x);
		//--------------------------
		Test2 ob2 = new Test2(20);
		System.out.println(ob2.x);
		
		ob2.setData(4);
		System.out.println(ob2.x);
		
		Test2 ob3 = new Test2();
		Test2 ob4 = new Test2(60);
		
		//Scanner sc = new Scanner(System.in);
		
	}

}









