package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score{

	private List<ScoreVO> lists = new ArrayList<>(); //UPCAST 부모 = 자식 
	//ArrayList<ScoreVO> lists = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int input() {
		
		int result = 0;
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("학번? "); //111
		vo.setHak(sc.next());
		
		System.out.print("이름? "); //suzi
		vo.setName(sc.next());
		
		System.out.print("국어점수는? "); //99
		vo.setKor(sc.nextInt());
		
		System.out.print("영어점수는? "); //55
		vo.setEng(sc.nextInt());
		
		System.out.print("수학점수는? "); //88
		vo.setMat(sc.nextInt());
		
		lists.add(vo);
		
		
		return result;
	}

	@Override
	public void print() {
		
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();

			System.out.println(vo.toString());
			
//			System.out.printf("%5s %6s %4d %4d %4d %4d %4.1f\n",
//					vo.getHak(),vo.getName(),
//					vo.getKor(),vo.getEng(),vo.getMat(),
//					(vo.getKor()+vo.getEng()+vo.getMat()), 
//					(vo.getKor()+vo.getEng()+vo.getMat())/3.0);
		}
	}
	@Override
	public void deleteHak() {
		System.out.print("삭제할 학번? "); //111
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			
			if(hak.equals(vo.getHak())) {
				it.remove();
				//lists.remove(vo);
				//System.out.println(vo.toString());
				break;
			}
		}
	}
	
	@Override
	public void searchHak() {
		System.out.print("검색할 학번? "); //111
		String hak = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			
			if(hak.equals(vo.getHak())) {
				System.out.println(vo.toString());
				break;
			}
		}
	}

	@Override
	public void searchName() {
		System.out.print("검색할 이름? "); 
		String name = sc.next();
		
		Iterator<ScoreVO> it = lists.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			
			if(name.equals(vo.getName())) {
				System.out.println(vo.toString());
			}
		}
	}

	@Override
	public void descSortTot() {
		//익명의 인터페이스 
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot()<vo2.getTot()? 1:-1;
			}
		};
		
		Collections.sort(lists, comp);
		
		print();
	}

	@Override
	public void ascSortHak() {
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		
		Collections.sort(lists, comp);
		
		print();
		
		
	}

	
}
