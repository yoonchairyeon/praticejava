package com.day11;

public class Test5 {

	public static void main(String[] args) {
		String s1 = "서울,부산,대구";
		String ss[] = s1.split(","); //split : ,를 기준으로 나눔, String의 메소드.
		for(String s : ss) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		String s2 = "seoul";
		String s3 = "Seoul";
		
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3)); //대소문자 구별해서 비교함.
		System.out.println(s2.equalsIgnoreCase(s3)); //대소문자 구별 안하고 비교함.
		
		
		String s4 = "abc.def.hij";
		//index : 	 01234567890
		//인덱스 위치 찾는 것.
		
		System.out.println(s4.indexOf(".")); //첫번째 .이 있는 곳을 찾아라.
		System.out.println(s4.lastIndexOf(".")); //마지막 .이 있는 곳 출력.
		System.out.println(s4.indexOf("def")); // def 시작 지점.
		System.out.println(s4.indexOf("x")); //-1 : s4에 존재하지 않는것.
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한", "大韓");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim()); // 양쪽 공백 없어짐.
		System.out.println(s7.replaceAll(" ", "")); //abc사이의 공백까지 다 없어짐.
		System.out.println(s7.replaceAll("\\s", "")); //정규화 표현식. "\" = 공백!
		
		//String str = "abcedfg";
		char ch = "abcedfg".charAt(2); //c
		System.out.println(ch);
		
		System.out.println("abcedfg".startsWith("abc"));
		System.out.println("자바프로그램.".startsWith("자바"));
		
		System.out.println("abcdefg".length()); //7
		
		
		String s8 = "abcdefg";
		String s9 = "abcdffg";
		
		//사전식 정렬(ASCII 코드 값의 차이) 
		System.out.println(s8.compareTo(s9)); 
		System.out.println(s9.compareTo(s8));
	}

}
