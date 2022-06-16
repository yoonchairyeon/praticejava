package com.score3;

public class ScoreVO { //Value Object
	//DTO : 계층 간 데이터 교환을 하기 위해 사용하는 객체로
	//DTO는 로직을 가지지 않는 순수한 데이터 객체.
	
	private String hak; //처음엔 무조건 private으로 변수 선언하기 
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	//우회도로 만들었다.
	//getter/setter
	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getTot() {
		return kor+eng+mat;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	@Override
		public String toString() {
		if(hak==null||hak.equals("")) {
			return null;
		}
		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f", 
				hak, name,kor,eng,mat,getTot(), getTot()/3.0);
		return str;
		}
}