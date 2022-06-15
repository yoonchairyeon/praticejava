package com.day13;

//1. 내부클래스(Inner class) : 클래스 안에 클래스를 만든다. (Nested class)

class Outer1{
	static int a=10; //instance 변수 
	int b=20; //class 변수 
	
	public class Inner1{
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		 System.out.println("print()...");
		 Inner1 ob = new Inner1();
		 ob.write();
	}
}


public class Test4 {
	
	public static void main(String[] args) {
		//메소드 안에 클래스를 만들 수 있다.
		//outer = 외부 클래스, 외부클래스가 객체 생성이 되어야
		//내부클래스의 객체를 생성할 수 있고
		//외부클래스가 객체 생성이 됐다고해서
		//자동으로 내부클래스의 객체가 생성되는 것은 아니다.
		
		Outer1 out = new Outer1();
		out.print();
		System.out.println();
		Outer1.Inner1 inner = out.new Inner1();
		inner.write();
	}

}
