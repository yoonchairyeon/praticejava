package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test2() {
		
		setTitle("윈도우 ");
		setSize(200,300);
		
		addWindowListener(new MyWindowAdapter());
		//메서드 한개 있어서 사용 가능함 
		setVisible(true);
	
	}
	
	
	
	//내부클래스 
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		new Test2();
	}

}
