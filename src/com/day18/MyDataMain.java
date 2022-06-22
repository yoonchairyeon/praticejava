package com.day18;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyDataMain {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("/Users/yoonchairyeon/doc/out6.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new MyData("배수지",30));
		oos.writeObject(new MyData("유인나",40));
		oos.writeObject(new MyData("정인선",30));
		oos.writeObject(new MyData("정인아",32));
		
		oos.close();
		fos.close();
		
		//역직렬화 
		FileInputStream fis = new FileInputStream("/Users/yoonchairyeon/doc/out6.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		MyData ob = null;
		
		try {
			while(true) {
				ob = (MyData)ois.readObject();
				if(ob==null)
					break;
				System.out.println(ob.toString());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		ois.close();
		fis.close();
		
	}

}
