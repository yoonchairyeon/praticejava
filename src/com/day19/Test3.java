package com.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

///내부 클래스 -> 무명의 클래스로 이용하기 

public class Test3 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test3() {
		
		setTitle("윈도우 ");
		setSize(200,300);
		setBackground(new Color(0, 225, 225)); 
		
		addWindowListener(new WindowAdapter() {
			//무명의 클래스 
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		//메서드 한개 있어서 사용 가능함 
		setVisible(true);
	
	}
	
	
	public static void main(String[] args) {
		new Test3();
	}

}

