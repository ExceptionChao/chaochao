package com.test.demo3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * File的工具类
 * 	把file类的一些公用的方法提取出来，放到工具类中
 * @author my
 *
 */
public class ReadAndWrite {
	/**
	 * 
	 * @param dir
	 * @throws IOException
	 */
	public static void fileInputStream(String fileName)throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(in,"gbk");
		//单个字节读取
//		int a ;
//		while((a = isr.read())!=-1){
//			System.out.print((char)a);
//		}
		
		char[] bytes = new char[10 * 1024]; 
		byte[] bytes1 = new byte[20 * 1024];
		int b ;
		while((b = isr.read(bytes, 0, bytes.length)) != -1){
			String str = new String(bytes,0,b);
			System.out.println(str);
		}
	}
}
