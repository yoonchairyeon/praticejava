package com.day13;

import java.util.Scanner;

interface FruitA{
	
	String Won = "원";
	
	public int getPrice();
	public String getName();
	
}

interface ItemFruit extends FruitA{
	
	public String getItems();
	
}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
	
}

class Apple implements ItemFruit{

	@Override
	public int getPrice() {
		return 1500;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
	
}

public class Test3 {

	public void packing(ItemFruit ob1) {
		System.out.println("---------");
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + FruitA.Won);
		System.out.println("---------");

	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Test3 t = new Test3();
		
		System.out.print("1. orange 2. apple ? ");
		int n = sc.nextInt();
		
		if(n==1)
			t.packing(new Orange());
		else if(n==2)
			t.packing(new Apple());
		
		/*
		int ob1 = 10;
		System.out.println(ob1); //10
		
		int ob2 = 20;
		System.out.println(ob2); //20
		
		*/
	}

}
