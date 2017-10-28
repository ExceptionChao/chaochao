package com.test.demo3;

import java.io.File;

/**
 * File类的操作
 *  
 * @author my
 *
 */
public class TestFileDemo2 {

	public static void main(String[] args)throws Exception {
		FileUtils.listDirectory(new File("E:\\batch01"));
	}
 
}
