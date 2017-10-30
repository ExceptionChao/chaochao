package com.demo;

import java.util.Random;

import com.sun.org.apache.bcel.internal.util.ClassLoader;
import com.sun.org.apache.bcel.internal.util.ClassSet;

public class Test {

	public static void main(String[] args) {
		char[] c = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890".toCharArray();
		StringBuffer sb = new StringBuffer();
		Random r = new Random();
		int len = c.length,index;
		for(int i = 0; i < 4; i++){
			
			String nextInt = r.nextInt(len) + "";
			sb.append(nextInt);
			System.out.println(nextInt);
			System.out.println(sb.toString());
		}
	}
}
