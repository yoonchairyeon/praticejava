package com.day14;

import java.util.Vector;

/* Collection
   배열 단점 : 크기가 정해지면 늘리거나 줄이거나 삽입이 불가능하다.
   리스트(List),맵(Map) 둘다 인터페이스(Interface)
   List - ArrayList(class), Vector(class) ...
   Map  - HashMap(class), HashTable(class) ...
*/
public class Test1 {
	
	public static void main(String[] args) {
		
		//<E> : Generic
		Vector v = new Vector<>(); //Object
		
		v.add("seoul"); //String - Upcast
		v.add(30); //integer
		v.add('A'); //character
		
		String str = (String) v.get(0); //downcast
		System.out.println(str);
		
		Integer i = (int) v.get(1); 
		//int 자리에 Integer여도 상관없다 
		//int는 stack, Integer는 class에 저장 
		System.out.println(i);
		
		Character c = (char) v.get(2);
		//char는 stack, Character는 class에 저장 
		System.out.println(c);
		
		for(int j=0; j<v.size(); j++) {
			Object ob = v.get(j);
			
			if(ob instanceof String) {
				str = (String)ob;
				System.out.println(str);
			}else if(ob instanceof Integer) {
				i = (int)ob;
				System.out.println(i);
			}else if (ob instanceof Character) {
				c = (char)ob;
				System.out.println(c);
			}
		}
	}

}
