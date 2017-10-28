package com.test.demo2;

import javax.sound.midi.Synthesizer;

/**
 * 反射Demo
 * @author my
 *
 */
public class ClassDemo1 {

	public String name;
	public int a=1;
	
	public static void main(String[] args) {
		Foo foo1 = new Foo();
		String a = foo1.print();
		System.out.println("1:" + a);
		
		//第一种
		Class c1 = Foo.class;
		System.out.println("2:"+c1);
		System.out.println("比较1："+foo1.equals(c1));
		//第二种
		Class c2 = foo1.getClass();
		System.out.println(c1==c2);
		System.out.println("3:"+c2);
//		System.out.println(foo1.equals(c2));
		System.out.println("比较2："+foo1.equals(c2));
		//第三种
		Class c3 = null;
		try {
			c3 = Class.forName("com.test.demo.Foo");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//创建实例对象
		try {
			Foo foo = (Foo)c1.newInstance();
			System.out.println("last==="+foo.print());
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
class Foo{
	String print(){
		String a = "我是foo类";
		return a;
	}
}
