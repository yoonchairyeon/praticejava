package com.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 : 더블클릭, 드래그,

//AWT(Abstract Window ToolKit) -> Swing -> FX

//Listener : 감시자(자주 나옴)

public class Test1 extends Frame implements WindowListener{

	private static final long serialVersionUID = 1L;
	
	//거의 모든 준비를 생성자에서 한다.
	public Test1() {
		
		setTitle("자바 윈도우");
		setSize(200,300);
		setBackground(new Color(225, 225, 0)); //노란색 
		//rgb color 각 자리에서 0 ~ 255
		
		addWindowListener(this);
		// 나를 감시.
		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new Test1();
	}


	@Override
	public void windowOpened(WindowEvent e) {
	}


	@Override
	public void windowClosing(WindowEvent e) {
		//종료될 때 
		System.exit(0);
	}


	@Override
	public void windowClosed(WindowEvent e) {
		//종료된 후에 
	}


	@Override
	public void windowIconified(WindowEvent e) {
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
	}


	@Override
	public void windowActivated(WindowEvent e) {
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
	}

}
