package com.day20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//replaceAll


public class Test2 {

	public static String replaceAll(String str, String oldStr, String newStr) {
		
		if(str==null) {
			return null;
		}
		
		Pattern p = Pattern.compile(oldStr);
		
		Matcher m = p.matcher(str);
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()) {
			m.appendReplacement(sb, newStr);
		}
		
		m.appendTail(sb);
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "우리나라 대한민국 대한독립 대한의 건아...";
		String s = Test2.replaceAll(str, "대한", "daehan");
		
		System.out.println(s);
	}

}
