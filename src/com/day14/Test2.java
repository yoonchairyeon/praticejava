package com.day14;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test2 {
	
	private static String city[] = {"seoul","busan","daegu",
			"incheon","gwangju","daejun","ulsan"};
	
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		System.out.println("초기 용량 : " + v.capacity());
		
		//vector는 오로지 string만 받음 
		
		for(String c : city) {
			v.add(c);
		}
		
		//v.add(10); string 아닌 데이터는 들어갈 수 없다.
		
		String str;
		
		//첫번째 메소드 가져온다.
		str = v.firstElement(); //0
		System.out.println(str);
		
		str = v.get(1);
		System.out.println(str);
		
		//마지막 메소드 가져온다.
		str = v.lastElement(); //6
		System.out.println(str);
		
		System.out.println(v.size() + "개");
		
		System.out.println("----------------------------------------------");
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		//collection의 자체 반복자 
		Iterator<String> it  = v.iterator(); 
		while(it.hasNext()) { //데이터가 있을 떄 까지 출력!
			str = it.next(); //다음 값으로 넘어가라!
			System.out.print(str + " ");
		}
		
		while(it.hasNext()) { 
			str = it.next(); //it의 있는 값이 str에 있기 때문에 출력되지 않는다.
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		//변경 
		v.set(0, "서울");
		v.set(1, "부산");
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		//삽입 
		v.insertElementAt("대한민국", 0);
		System.out.println(v.size()+"개");
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		//검색
		int idx = v.indexOf("daegu");
		if(idx != -1) { //인덱스가 있으면!
			System.out.println("검색 성공! \nindexnum : " + idx);
		}else {
			System.out.println("검색 실패! \nindexnum : " + idx);
		}
		System.out.println("----------------------------------------------");
		
		//오름차순 
		Collections.sort(v);
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		//내림차순
		Collections.sort(v, Collections.reverseOrder());
		//comparator
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		
		//삭제 
		v.remove("부산"); //remove(1)
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("공간 개수: " + v.capacity());
		System.out.println("데이터의 개수 : " + v.size());
		System.out.println("----------------------------------------------");
		
		//공간 증가
		for(int i=1; i<=20; i++) {
			v.add(Integer.toString(i));
		}
		
		for(String c : v) {
			System.out.print(c + " ");
			
		}
		System.out.println();
		System.out.println("공간 개수: " + v.capacity());
		//공간의 개수가 늘어날 때 크기를 두배씩 증가시킨다. 즉 20 *2 = 40이 출력!
		System.out.println("데이터의 개수 : " + v.size());
		//데이터의 개수는 20개 + 원래 있는 개수 7개 = 27
		System.out.println("----------------------------------------------");
		
		//범위 삭제
		for (int i=1; i<=10; i++) {
			v.remove(5);
		}
		
		for(String c : v) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("공간 개수: " + v.capacity());
		//공간 삭제시 자동으로 안되므로 수동으로 삭제해야한다.
		System.out.println("데이터의 개수 : " + v.size());
		System.out.println("----------------------------------------------");
		
		//빈 공간 삭제
		v.trimToSize();
		System.out.println("공간 개수: " + v.capacity());
		System.out.println("데이터의 개수 : " + v.size());
		System.out.println("----------------------------------------------");
		
		
		//모든 데이터 삭제
		v.clear();
		System.out.println("공간 개수: " + v.capacity());
		System.out.println("데이터의 개수 : " + v.size());
		System.out.println("----------------------------------------------");
	}

}
