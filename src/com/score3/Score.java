package com.score3;

import java.io.IOException;

public interface Score {

	public int input() throws IOException; //입력 
	public void print();//출력 
	public void deleteHak(); //학생정보삭제 
	public void searchHak(); //학번검색 
	public void searchName();//이름검색 
	public void descSortTot();//총번 내림차순 정렬
	public void ascSortHak();//학번 오름차순 정렬
	
	
}
