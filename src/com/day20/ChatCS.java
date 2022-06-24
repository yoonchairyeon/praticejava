package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

//그룹채팅 
//D class : 224.0.0.0 ~ 239.255.255.255

public class ChatCS extends Frame implements ActionListener, Runnable{

	
	private static final long serialVersionUID = 1L;
	private MulticastSocket ms = null;
	//내부 컴퓨터 구조에서 내가 한마디를 하게 되면 그 한마디를 여러 사람에게 보낼 수 있게 하는 소켓.
	//일종의 브로드캐스트 신호만 보낼 수 있게 하는 것!
	//(브로드 캐스트 : 1: 다)
	private InetAddress xGroup = null;
	
	private String host = "230.1.1.1";
	private int port = 7777;
	private String username = "c";
	
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	
	//DatagramSocket: UDP로 데이터로 전송하거나 수신하는 소켓 
	//DatagramPacket: UDP를 이용하여 전송될 수 있는 데이터 
	//MulticastSocket: 다수의 클라이언트한데 Datagrampacket을 전송함.
	
	public ChatCS() {
		
		ta.setEditable(false);
		add(ta,BorderLayout.CENTER);
		
		add(tf,BorderLayout.SOUTH);
		tf.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setTitle("그룹채팅 [" + host + "]");
		setSize(400,400);
		setVisible(true);
	
		tf.requestFocus();
	}
	
	public void setup() {
		try {
			
			xGroup = InetAddress.getByName(host);
			ms =  new MulticastSocket(port);
			
			ms.joinGroup(xGroup);
			
			Thread th = new Thread(this);
			th.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	

	public void disconnect() {
	//연결했던 것을 끊는다 
		try {
			ms.leaveGroup(xGroup);
			ms.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public void run() {
		
		try {
			while(true) {
				byte[] buffer = new byte[512];
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
				ms.receive(dp);
				
				String msg = new String(dp.getData()).trim();
				
				ta.append(msg + "\r\n");
				
			}
		} catch (Exception e) {
			System.out.println(e.toString());
			disconnect();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = tf.getText().trim();
		
		if(msg.equals("")) {
			return;
		}
		
		byte[] buffer = (username + "]" + msg).getBytes(); 
		//getBytes : string method 
		
		try {
			DatagramPacket dp = 
					new DatagramPacket(buffer, buffer.length, xGroup, port);
			
			ms.send(dp);
			
			tf.setText(" ");
			tf.requestFocus();
			
			
		} catch (Exception e1) {
			System.out.println(e1.toString());
		}
	}
	
	public static void main(String[] args) {
		new ChatCS().setup();;
	}

	

}
