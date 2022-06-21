package com.day16;

import java.util.ArrayList;
import java.util.List;

//자바 람다 문법 

public class Test5 {

	public static void main(String[] args) {
		List<String> lists = new ArrayList<String>();
		
		lists.add("seoul");
		lists.add("busan");
		lists.add("daegu");
		lists.add("incheon");
		
		for(String str : lists) {
			System.out.print(str + " ");
		}
		System.out.println("\n--------------------------------");
		
		lists.stream()
		.forEach(x -> System.out.print(x + " "));
		System.out.println("\n--------------------------------");
		
		lists.stream()
		.filter(x -> x.startsWith("busan"))
		.forEach(x -> System.out.print(x + " "));
		System.out.println("\n--------------------------------");
		
		lists.stream()
		.map(x -> x + " hi,")
		.forEach(x -> System.out.print(x + " "));
		System.out.println("\n--------------------------------");
		
		//------------------------------------------------------
		List<Integer> lists1 = new ArrayList<>();
		
		lists1.add(10);
		lists1.add(20);
		lists1.add(30);
		lists1.add(40);
		
		for(int i =0; i<lists1.size(); i++) {
			int x = lists1.get(i);
			
			if(x%20 !=0)
				System.out.print(x + " ");
		}
		System.out.println("\n--------------------------------");
		
		lists1.stream()
		.filter(x -> x % 20 !=0)
		.forEach(x -> System.out.print(x + " "));
		
		System.out.println("\n--------------------------------");
		
		int sum = 0;
		sum = lists1.stream()
				.filter(x -> x %20 != 0)
				.mapToInt(x -> x * 2)
				.sum();
		System.out.print(sum);
	}
}
