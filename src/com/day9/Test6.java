package com.day9;

/*Call By Value
 * stack영역의 value가 heap영역으로 넘어감.
 * 
 * Call By Reference
 * heap영역의 주소가 stack영역으로 넘어감.*/

class Test{
	public int x = 10;
	public void sub(int a) {
		x+=a; //x = x+a;
	}
}


public class Test6 {

	public static void main(String[] args) {
	
		Test ob = new Test();
		
		//call by value
		int a = 20;
		System.out.println("sub()메소드 실행전 x: " + ob.x);
		ob.sub(a);
		System.out.println("sub()메소드 실행전 x: " + ob.x);
		
		//call by reference
		Test ob1;
		ob1 = ob;
		System.out.println("ob.x: " + ob.x);
		System.out.println("ob1.x: " + ob.x);
		
		ob1.x = 100;
		System.out.println("ob.x: " + ob.x);
		System.out.println("ob1.x: " + ob.x);
		
	}

}
