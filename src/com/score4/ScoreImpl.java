package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class ScoreImpl implements Score{

	private Map<String, ScoreVO> hMap = new TreeMap<>();
	
	Scanner sc = new Scanner(System.in);
	String hak;
	
	@Override
	public void input() {
		System.out.print("학번은? ");
		hak = sc.next();
		
		if(searchHak(hak)) {
			System.out.println("학번이 존재합니다. 추가 실패!");
			return ;
		}
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름? ");
		vo.setName(sc.next());
		
		System.out.print("국어? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학? ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		System.out.println("추가 성공~");
		
	}

	@Override
	public boolean searchHak(String hak) {
		
		//if(hMap.containsKey(hak)) {
		//	return true;
		//}
		
		//return false;
		return hMap.containsKey(hak); 
	}

	@Override
	public void print() {
		Iterator<String> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak + " " + vo.toString());
		}
	}

	@Override
	public void delete() {
		System.out.println("삭제할 학번은? ");
		String hak = sc.next();
		
		  if(searchHak(hak)) {
		         hMap.remove(hak);
		         System.out.println("삭제 성공");
		  }
		  else {
		         System.out.println("삭제 실패");
		  }
	}
		
	

	@Override
	public void update() {
		System.out.print("수정할 학번? "); 
		String hak = sc.next();
		//방법 1 
		/* if(!searchHak(hak)) {
			 System.out.println("수정 실패");	
			 return;
		 }
		 else {        
			 	ScoreVO pVO = hMap.get(hak);
			 	
	         	ScoreVO vo = new ScoreVO();
	         	
	         	vo.setName(pVO.getName());
	         	
			 	System.out.print("국어? ");
				vo.setKor(sc.nextInt());
				
				System.out.print("영어? ");
				vo.setEng(sc.nextInt());
				
				System.out.print("수학? ");
				vo.setMat(sc.nextInt());
				
				hMap.put(hak, vo);
				
				System.out.println(hak + " " +vo.toString());
		}*/
		
		//방법2
		ScoreVO vo = hMap.get(hak);
		System.out.print("국어? ");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어? ");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학? ");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);
		System.out.println("수정 성공!!");
	}

	@Override
	public void findHak() {
		System.out.print("검색할 학번? ");
		String hak = sc.next();
		 if(!searchHak(hak)) {
	         System.out.println("검색 실패");
		 }
		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo.toString());		
	}

	@Override
	public void findName() {
		System.out.print("검색할 이름? "); 
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		boolean flag = false;
		while(it.hasNext()) {
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			if(name.equals(vo.getName())) {
				System.out.println(vo.toString());
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
