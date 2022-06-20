package com.day15pratice;

public interface Health {
	public void input(); //고객정보 입력 
	public boolean searchNum(String num);
	public void print(); //출력 
	public void printBmi(); //고객 번호 입력받고 bmi 출
	public void delete(); //고객 정보 삭제 
	public void update(); //고객 정보 업데이트 
	public void findName(); //고객 이름 찾기 
	public void findNum(); //고객 끝자리 번호 찾기 
}
