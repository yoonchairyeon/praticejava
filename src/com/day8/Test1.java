package com.day8;

import java.util.Scanner;

class Circle{
	
	private int r; //정보의 은닉화(캡슐화), r 자리에는 메소드랑 변수밖에 못들어옴.
	
	public void setData(int r) { //메소드로 프라이빗에 값 초기화하기.
		//setData(int r, Circle this)
		this.r = r; //this : 자기자신!
	}
	
	public double area() {	//area(Circle this)
		return this.r*this.r*3.14;
	}
	
	public void write(double a) {	//write(double a, Circle this)
		System.out.println("반지름: " + this.r);
		System.out.println("넓이: " + a);
	}
	
	
}



public class Test1 {

	public static void main(String[] args) {
		
		Circle ob = new Circle();
		//ob = null;
		
		Scanner sc = new Scanner(System.in); 
		//ob.r = 20; 주소 지우는 것.
		
		System.out.print("원하는반지름? : ");
		// int r = sc.nextInt();
		
		ob.setData(sc.nextInt()); //setData(r,ob);
		double a = ob.area();	//area(ob);
		ob.write(a);			//write(a,ob);
	}

}
