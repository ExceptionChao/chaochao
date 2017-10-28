package com.test.demo3;

import java.io.File;
import java.io.IOException;

/**
 * File的工具类
 * 	把file类的一些公用的方法提取出来，放到工具类中
 * @author my
 *
 */
public class FileUtils {
	/**
	 * 列出制定目录下（包括子目录）所有的文件
	 * @param dir
	 * @throws IOException
	 */
	public static void listDirectory(File dir)throws IOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录"+dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalArgumentException("不是目录");
		}
		//返回字符串数组，返回的是本级牡目录下的所有文件名，不包含子集目录
//		String[] dirName = dir.list();
//		for (String string : dirName) {
//			System.out.println(dir+"\\"+string);
//		}
		//如果要打印包含子目录在内的输出结果，用到递归
		File[] files = dir.listFiles();
		if(files!=null && files.length>0){
			for (File file : files) {
				if(file.isDirectory()){
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}
		}
		
	}
}
