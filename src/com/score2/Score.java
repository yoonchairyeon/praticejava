package com.score2;

public interface Score {
	public void set();
	public void input();
	public void print();
	
	Score ob1 = new Score() {
		
		@Override
		public void set() {
		}
		
		@Override
		public void print() {
		}
		
		@Override
		public void input() {
		}
	};
}
