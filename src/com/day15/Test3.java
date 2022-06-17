package com.day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
		//set : 중복값 허용 안함
		Set<String> s = new HashSet<>();
		s.add("seoul");
		s.add("busan");
		s.add("daegu");
		
		System.out.println(s);
		
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		s.add("seoul");
		System.out.println(s);
		
		//stack
		Stack<String> st = new Stack<>();
		
		st.push("서울");
		st.push("부산");
		st.add("광주");
		
		while(!st.empty()) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();
		
		//Queue
		Queue<String> q = new LinkedList<>();
		q.offer("부산");
		q.offer("대구");
		q.add("울산");
		
		while(q.peek()!=null) {
			System.out.print(q.poll() + " ");
		}
		
		List<String> list1 = new LinkedList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		list1.add("f");
		list1.add("g");
		list1.add("h");
		list1.add("i");
		
		List<String> list2 = new LinkedList<>();
		list2.add("seoul");
		list2.add("busan");
		list2.add("daegu");
		
		list2.addAll(list1);
		System.out.println();
		
		System.out.println("list1...");
		for(String ss : list1) {
			System.out.print(ss + " ");
		}
		System.out.println();
		
		System.out.println("list2...");
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println();
		
		list2.subList(2, 5).clear(); //2~4까지! 
		for(String ss : list2) {
			System.out.print(ss + " ");
		}
		System.out.println();
		
		//배열 
		String[] str = {"마 ","나 ", "바 ", "라 ", "가 ", "다 "};
		
		for(String sss : str)
			System.out.print(sss+ " ");
		System.out.println();
		
		Arrays.sort(str);
		for(String sss : str)
			System.out.print(sss+ " ");
		System.out.println();
		
	}
}
