package com.score4;

public class ScoreVO { 
	private String name;
	private int kor,eng,mat;
	private int tot;
	//tot는 setter 필요 없다!, tot를 꼭 선언할 필요가 없다.
	//값을 입력받는게 아니므로! 
	
	
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
	
	@Override
	public String toString() {
		
		String str = String.format("%6s %4d %4d %4d %4d %4.1f",
				name,kor,eng,mat,getTot(),getTot()/3.0);
		
		return str;
	}
	
}