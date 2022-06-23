package com.day18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test14 {

	public static void main(String[] args) throws Exception {

		//역직렬화 
		FileInputStream fis = new FileInputStream("/Users/yoonchairyeon/doc/out5.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Hashtable<String, String> h =
		(Hashtable<String, String>) ois.readObject();
		
		Iterator<String> it = h.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + " : " + value);
		}
		
		
	}

}
