package com.demo;

import java.lang.reflect.Method;

/**
 * 反射
 * @author chaochao
 *
 */
public class ClassUtils {
	
	/**
	 * 获取方法
	 */
	public static void getMethod(Object obj){
		Class c = obj.getClass();
		
		Method[] mth = c.getDeclaredMethods();
		
		for (Method method : mth) {
			
			System.out.println(method.getName());
			
		}
	}

}
