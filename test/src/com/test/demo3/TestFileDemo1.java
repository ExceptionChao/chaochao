package com.test.demo3;

import java.io.File;

/**
 * File类的操作
 *  
 * @author my
 *
 */
public class TestFileDemo1 {

	public static void main(String[] args)throws Exception {
		//双斜杠表示目录转译
//		File file = new File("E:\\test");
		File file = new File("E:" + File.separator + "test");
		//判断是否是一个目录
		System.out.println(file.isDirectory());
		//判断目录是否存在
		if(!file.exists()){
			//不存在，创建目录
			file.mkdirs();
		}else{
			//如果存在，删除
			file.delete();
			System.out.println("haha");
			//判断是否是一个目录
			System.out.println(file.isFile());
		}
//		System.out.println(file.exists());
		
		System.out.println("=======================");
		
		File file2 = new File("E:\\test\\log.txt");
//		File file2 = new File("E:"+file.);
		//判断文件是否存在
		if(!file2.exists()){
			//不存在，创建文件
			file2.createNewFile(); 
		}else {
			//存在，删除文件
			file2.delete();
		}
		//判断是否是一个文件
		System.out.println(file2.isFile());
	}

}
