package com.day15pratice;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HealthImpl implements Health{

	private Map<String, HealthData> hMap = new TreeMap<>();
	
	Scanner sc = new Scanner(System.in);
	String num;
	
	@Override
	public void input() {
		System.out.print("끝자리 번호는? ");
		num = sc.next();
		
		if(searchNum(num)) {
			System.out.println("존재합니다. 추가 실패!");
			return ;
		}
		
		System.out.println("추가 성공~");
		
		HealthData hd = new HealthData();
		
		System.out.print("이름? ");
		hd.setName(sc.next());
		
		System.out.print("키는? ");
		hd.setCm(sc.nextInt());
		
		System.out.print("몸무게는? ");
		hd.setKg(sc.nextInt());
		
		hMap.put(num, hd);
		System.out.println("추가 성공~");
		
	}
	
	@Override
	public boolean searchNum(String num) {
		return hMap.containsKey(num);
	}

	@Override
	public void print() {
		Iterator<String> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			
			String num = it.next();
			HealthData hd = hMap.get(num);
			
			System.out.println(num + " " + hd.toString());
		}
	}
	
	@Override
	public void printBmi() {
	
		System.out.print("bmi구하고 싶은 번호는? ");
		String num = sc.next();
		if(!searchNum(num)) {
			System.out.println("없는 번호!");
			return;
		}
		else {
		HealthData hd = hMap.get(num);
		
		if ( hd.getTot() >= 30) {
			System.out.println("비만!");
		} else if ( hd.getTot() < 30 &&  hd.getTot() >= 24) {
			System.out.println("과체중!");
		}else if ( hd.getTot() < 24 &&  hd.getTot()>= 20) {
			System.out.println("정상!");
		} else if ( hd.getTot() < 20 &&  hd.getTot()>= 15) {
			System.out.println("저체중!");
		} else if ( hd.getTot() < 15 &&  hd.getTot() >= 13) {
			System.out.println("저저체중!");
		} else {
			System.out.println("영양 실조!");
		} 
		}
	}
	
	@Override
	public void delete() {//고객 정보 삭제 
		System.out.println("삭제할 번호는? ");
		String num = sc.next();
		
		  if(searchNum(num)) {
		         hMap.remove(num);
		         System.out.println("삭제 성공");
		  }
		  else {
		         System.out.println("삭제 실패");
		  }
	}

	@Override
	public void update() {//고객 정보 업데이트 
		System.out.print("수정할 번호는? "); 
		String num = sc.next();
		
		HealthData hd = hMap.get(num);
		System.out.print("키는? ");
		hd.setKg(sc.nextInt());
		
		System.out.print("몸무게는? ");
		hd.setCm(sc.nextInt());
		
		
		hMap.put(num, hd);
		System.out.println("수정 성공!!");
	}

	@Override
	public void findNum() {//고객 끝자리 번호 찾기
		System.out.print("검색할 번호는? ");
		String num = sc.next();
		 if(!searchNum(num)) {
	         System.out.println("검색 실패");
		 }
		HealthData hd = hMap.get(num);
		System.out.println(num + " " + hd.toString());	
	}

	@Override
	public void findName() {//고객 이름 찾기 
		System.out.print("검색할 이름? "); 
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		boolean flag = false;
		while(it.hasNext()) {
			String num = it.next();
			HealthData hd = hMap.get(num);
			
			if(name.equals(hd.getName())) {
				System.out.println(hd.toString());
				flag = true;
			}
		}
		if(flag) {
			System.out.println("검색 성공!");
		}
		else {
			System.out.println("이름 존재안함 실패.");
		}
	}

	

	

	

}
