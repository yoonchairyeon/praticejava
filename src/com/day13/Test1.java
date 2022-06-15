package com.day13;

//Interface

interface Fruit{
	
	String Won = "원"; //public, static, final 생략되어 있다.
	
	int getPrice(); //public,abstract 생략 
	public String getName(); //abstract 생략되어있다.
	
}

class FruitImpl implements Fruit{ 
	//무조건 오버라이드해주기!
	//인터페이스1개일시 클래스 이름 뒤에 impl 붙인다.

	@Override
	public int getPrice() {
		
		return 1000;
	}

	@Override
	public String getName() {
		
		return "사과";
	}
	
	public String getItems() {
		return "과일";
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		
		Fruit ob = new FruitImpl(); //인터페이스에서만 사용 가능(getItems는 자식것이므로 사용 불가능)
		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; //Fruit도 내부적으로 class
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems()); 
		//부모가 없고 자식만 갖고 있는 것이므로 사용할 수 없다.
		
		
	}

}
