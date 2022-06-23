package com.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {
	
	private List<ScoreVO> lists = null;
	// new를 생성하면 안되는 이유 :
	//new를 생성할 때마다 새로이 파일이 저장되므로 이전에 저장된것들을 볼 수 없기 때문.
	
	private String path = System.getProperty("user.dir");
	private File f = new File(path, "/data/score.txt");
	
	public Score() {
		try {
			
			if(!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			
			if(f.exists()) {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				lists = (List<ScoreVO>) ois.readObject();
				
				fis.close();
				ois.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//입력 
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름? ");
		vo.setName(sc.next());
		
		System.out.print("생일? ");
		vo.setBirth(sc.next());
		
		System.out.print("점수는? ");
		vo.setScore(sc.nextInt());
		
		//처음 실행 후 데이터 입력시 객체를 생성 
		if(lists == null) {
			lists = new ArrayList<>();
		}
		lists.add(vo);
	}
	
	//파일 출력 
	public void print() {
		Iterator<ScoreVO> it = lists.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();

			System.out.println(vo.toString());
		}
	}
	
	
	//파일 저장 
	public void saveFile() {
		try {
			if(lists != null) {
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				
				oos.writeObject(lists);
				
				fos.close();
				oos.close();
				
				System.out.println("파일 저장 성공!");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
