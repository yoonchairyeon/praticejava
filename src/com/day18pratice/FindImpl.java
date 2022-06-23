package com.day18pratice;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class FindImpl implements Find{
	
	private List<FindVO> lists; 
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int input() {
		
		int result = 0;
		
		FindVO vo = new FindVO();
		
		System.out.print("이름? ");
		vo.setName(sc.next());
		
		System.out.print("생일? ");
		vo.setBirth(sc.next());
		
		System.out.print("점수는? ");
		vo.setScore(sc.nextInt());
		
		lists.add(vo);
		
		return result;
	}

	@Override
	public void print() {
		Iterator<FindVO> it = lists.iterator();
		
		while(it.hasNext()) {
			FindVO vo = it.next();

			System.out.println(vo.toString());
		}
	}
}
