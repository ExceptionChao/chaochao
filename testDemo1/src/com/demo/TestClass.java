package com.demo;

import java.lang.reflect.Method;

public class TestClass {

	public void testDemo(){
		Class c1 = int.class;
		Class c2 = String.class;
		Class c3 = double.class;
		Class<Double> c4 = Double.class;
		Class c5 = void.class;
		
		String a = "wertyu";
		
		ClassUtils.getMethod(a);
		
	}
}
