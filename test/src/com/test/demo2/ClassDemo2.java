package com.test.demo2;

public class ClassDemo2 {
	
	public static void main(String[] args) {
		String b = "hello";
		ClassUtils.getMethod(b);
		System.out.println("==========bbbbbbbbbbbbb=============");
		String a = "word";
		ClassUtils.sendMessage(a);
		System.out.println("=======================");
		int i = 10;
		ClassUtils.sendMessage(i);
		System.out.println("===========111111111111111111============");
		ClassUtils.getConMethod("hello");
		System.out.println("=======================");
		ClassUtils.getConMethod(new Integer(1));
		
	}

}

