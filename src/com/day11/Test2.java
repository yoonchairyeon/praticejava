package com.day11;

//String : 자료형이 아니라 class이다.
//저장할 데이터는 크고 사용빈도는 높기 때문에 자료형처럼 쓰인다.
//stack영역에 저장 x heap영역에 저장.
//String은 불변의 법칙을 가지고있다.
		
public class Test2 {

	public static void main(String[] args) {
		
		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		System.out.println("ob1 == ob2: " +(ob1==ob2));
		//call by reference : String은 문자가 같으면(100%) 새로 만들지 않고 주소를 공유한다.
		
		System.out.println("ob1 == ob3: " + (ob1==ob3));
		// new가 들어가는 순간 새롭게 만들어져서 주소가 다르다.
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));
		// true가 출력된다. equals는 ob1과 ob3의 데이터를 비교함.
		// override = object가 equals를 갖고 있으므로 String에서 equals 사용하는 것을 뜻함(4. 내꺼는 내꺼)
		
		ob2 = "korea";
		System.out.println("ob1 == ob2: " +(ob1==ob2)); //false
		
		ob2 = "usa";
		System.out.println("ob1 == ob2: " +(ob1==ob2)); //false
		
		ob2 = "china";
		System.out.println("ob1 == ob2: " +(ob1==ob2)); //false
		
		ob2 = "Seoul";
		System.out.println("ob1 == ob2: " +(ob1==ob2)); //true
		
		System.out.println(ob2);
		System.out.println(ob2.toString());
	}

}
