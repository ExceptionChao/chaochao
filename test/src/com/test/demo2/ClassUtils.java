package com.test.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtils {
	
	//获取方法
	public static void getMethod(Object obj){
		Class c = obj.getClass();
		//获取方法所有方法的类类型
		Method[] m = c.getMethods();
		//遍历获取方法中的方法名、返回值类型、方法名
		for( int i = 0; i < m.length; i++){
			//获取返回值类型的类类型
			Class returnType = m[i].getReturnType();
			String name = returnType.getName();
			System.out.print(name);
			//获取方法名
			String name2 = m[i].getName();
			System.out.print(name2 + "(");
			//获取参数列表
			Class[] parameterTypes = m[i].getParameterTypes();
			for (Class class1 : parameterTypes) {
				System.out.print(class1.getName());
			}
			System.out.println(")" + ",");
		}
	}
	
	//获取构造函数
	public static void getConMethod(Object obj){
		Class c = obj.getClass();
		System.out.print(c.getCanonicalName());
		//获取所有自己的构造方法
		Constructor[] dc = c.getDeclaredConstructors();
		//遍历打印出所有的构造方法
		for (Constructor constructor : dc) {
			System.out.print(constructor.getName()+"(");
			//获取构造方法的参数
			Class[] pt = constructor.getParameterTypes();
			//遍历构造方法的参数
			for (Class class1 : pt) {
				System.out.print(class1.getName()+",");
			}
			System.out.println(")");
		}
	}
	
	//获取成员变量
	public static void sendMessage(Object obj){
		Class c = obj.getClass();
		System.out.println("类的名称是："+c.getName());
		//获取自己所有成员变量的类类型
		Field[] df = c.getDeclaredFields();
		//便利成员变量
		for (Field field : df) {
			//获取类的类类型
			Class type = field.getType();
			//获取成员变量类的名称
			String name = type.getName();
			String name2 = field.getName();
			System.out.println(name+" "+name2);
		}
		
		
		
		
		
//		Class c1 = int.class;
//		Class c2 = String.class;
//		
		/*
		 * Field类封装了关于成员变量的方法
		 * */
//		Field[] fs = c1.getFields();
//		for (Field field : fs) {
//			//获取成员变量类的类类型
//			Class type = field.getType();
//			//打印成员变量的名字
//			String name = type.getName();
//			
//			String name2 = field.getName();
//			
//			System.out.print(name+"  "+name2);
//		}
//		for(int i = 0;i < fs.length;i++){
//			
//			System.out.print(fs[i].getName());
//		}
//		
//		
//		Field[] fs1 = c1.getDeclaredFields();
//		
//		
		
	}
}
