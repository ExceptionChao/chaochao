package com.test.demo2;

import java.lang.reflect.Method;

/**
 * 方法的反射
 * @author my
 *
 */
public class ClassMethodDemo {
	
	public static void main(String[] args) {
		A a = new A();
		//获取字节码对象
		Class c = a.getClass(); 
		
		//获得自己声明 的方法
		try {
			Method dm = c.getMethod("print", int.class,int.class);
			
			dm.invoke(a, 10,20);
			
			Method m1 = c.getMethod("print", String.class,String.class);
			
			m1.invoke(a, "hello","WORLD");
			
			Method m2 = c.getMethod("print");
			
			m2.invoke(a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
class A{
	public static void print(){
		System.out.println("======================");
	}
	public static void print(int a, int b){
		System.out.println(a+b);
	}
	public static void print(String a, String b){
		System.out.println(a.toUpperCase()+""+b.toLowerCase());
	}
}

