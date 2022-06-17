package com.day15;

import java.util.Hashtable;
import java.util.Iterator;

//Map<key,value> //set : interface
//HashTable (class) - vecotr와 동일(속도가 느리다)
//HashMap (class) - ArrayList(연동성)

//key는 중복 값을 가질 수 없다.(key는 set)
//키가 중복값을 같게되면 수정이다.(마지막값을 가진다)
//map은 iterator가 없다 
//데이터를 집어넣을 때는 put, 데이터를 가져올 때 get

public class Test2 {
	
	//key
	public static final String tel[] =
		{"111-111","222-222","333-333", "111-111", "444-444"};
	
	//value
	public static final String name[] =
		{"suzi","inna","insun","arang","iu"};
	
	public static void main(String[] args) {
		
		Hashtable<String,String> h = new Hashtable<>();
		
		for (int i=0; i<name.length; i++) {
			h.put(tel[i],name[i]);
		}
		
		System.out.println(h);
		
		String str;
		str = h.get("111-111");
		if(str == null) {
			System.out.println("자료없음!");
		}else {
			System.out.println(str);
		}
		
		//사용함!
		if(h.containsKey("222-222")) {
			System.out.println("222-222 있다! ");
		}else {
			System.out.println("0");
		}
		
		//잘 사용 안함!
		if(h.containsValue("arang")) {
			System.out.println("arang's here");
		}else {
			System.out.println("arang's not here");
		}
		
		//map에서 iterator 쓰는 방법 keyset의 iterator
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next(); //key
			String value = h.get(key); //value
			
			System.out.println(key +":"+value);
		}
		
		
	}
}
