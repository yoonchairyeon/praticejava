package com.day20;


import java.awt.BorderLayout;
/*Client - Server
Clietet - Socket ( 자신 IP, 서버 IP(상대 IP에 접속), Port(정문 외 사이드 문), msg(메시지)
IP->아파트 / port(호 수)

네트워크로 넘어감

소켓은 인터넷을 통과할 수 있지만 넘어갈 순 없음
데이터만 넘어감
반대편에도(서버 쪽) Socket 필요 -> 받아야하기 때문

서버 -> 소켓 받아서 서버에 연결시키는 서버소켓 필요 (소켓 두개 필요)
=> Server Socket : 포트번호를 오픈시켜놓고 기다림

밖에서 port7777이 오면 서버에서 열어줌 
소켓 결합 -> accept -> 서버에 내용이 들어옴

서버쪽에서 글을 쓰고 있어도 상대의 메시지가 계속 뜸
작업 2개 -> 스레드 필요 -> 들어오는 메시지를 받아줌

서버에서도 글 넘김 . 클라이언트 도 스레드 필요

> run() 메소드 필요

상대에게 보냄 -> 엔터 (이벤트발생 -> 이벤트 처리 메서드:actionPerformed() 필요)

서버에서 엔터 -> Cliet로 보냄(actionPerformed이 보내면 상대편의 run이 받음)

메서드 받아내는 코드 -> run()에
메서드 보내는 코드 -> actionPerformed 에

*/
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClietTest extends Frame implements ActionListener,Runnable{ 

   private static final long serialVersionUID = 1L;
   
   private TextArea ta = new TextArea();
   private TextField tf = new TextField();
   
   private Socket sc = null;
   private int port = 7777;
   private String host = "192.168.16.0"; //localhost
   //172.20.10.13
   public ClietTest() {
      
      add(ta,BorderLayout.CENTER);
      add(tf,BorderLayout.SOUTH);
      
      tf.addActionListener(this); 
      
      addWindowListener(new WindowAdapter() { 
         
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      
      setTitle("채팅 클라이언트");
      setSize(300, 400);
      setVisible(true);
   }

   @Override
   public void run() {
      //메시지 받기
      
      String msg;
      
      try {
         
         if(sc == null) { 
            return;
         }
         
         InputStream is = sc.getInputStream();
         BufferedReader br = new BufferedReader(new InputStreamReader(is));
         
         
         while((msg = br.readLine())!= null) {
            ta.append("\r\n" + msg);
         }
         ///////////
         
      } catch (Exception e) { 
         ta.append("\r\n" + "서버 연결 종료...");
         sc = null; //소켓 청소 
      }      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      //메시지 보내기
      String msg = tf.getText(); 
      
      if(msg.trim().equals("")) { 
         return;
      }
      
      if(sc == null) {
         return;
      }
      
      try {
         OutputStream os = sc.getOutputStream(); 
         PrintWriter pw = new PrintWriter(os, true); //true: 자동 flush 
         //PrintWriter pw = new PrintWriter(sc.getOutputStream());
         
         pw.println("a]" + msg); //서버에 msg 전송
         ta.append("\r\n클라이언트] " + msg);//내 창에 msg 보임   
         
         tf.setText("");
         tf.requestFocus(); 
         
      } catch (Exception e2) {
         ta.append("\r\n 서버와 연결이 끊겼습니다...");
         sc = null;
      }
      
      
   }
   
   public void connect() {
      
      try {
         
         sc = new Socket(host, port);
         
         Thread th = new Thread(this);
         th.start(); 
         
      } catch (Exception e) {
         System.out.println(e.toString());
      }   
   }

   public static void main(String[] args) {
      new ClietTest().connect(); 
   }
}