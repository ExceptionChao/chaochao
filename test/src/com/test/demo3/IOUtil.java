package com.test.demo3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * File的工具类
 * 	把file类的一些公用的方法提取出来，放到工具类中
 * @author my
 *
 */
public class IOUtil {
	/**
	 * 列出制定目录下（包括子目录）所有的文件
	 * @param dir
	 * @throws IOException
	 */
	public static void fileInputStream(String fileName)throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		//设置一个byte数组用来存储读取到的字节码数据
		byte[] bytes = new byte[20 * 1024];
		/**
		 * in.read(bytes, 0, bytes.length);
		 * 		bytes表示读到的内容存储的位置，
		 * 		0表示从第一个位置开始读取
		 *		bytes.length表示读取的长度 
		 */
		int i = 1;
		in.read(bytes, 0, bytes.length);
		for (int j = 0; j < bytes.length; j++) {
			//判断打印的数据是否是只有一位
			if(bytes[j] <= 0xf){
				//如果只有一位，拼接0
				System.out.print("0");
			}
			System.out.println(Integer.toHexString(bytes[j])+" ");
			if(i++%10 == 0){
				System.out.println();
			}
		}
	}
	/**
	 * 文件的复制    一个一个字节的复制，对于较大文件很浪费i时间
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFile(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件"+ srcFile+"不存在");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"不是文件");
		}
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		byte[] bytes = new byte[10 * 1024];
		int b;
		//判断是否是最后一个   把数据全部存储到bytes[]当中
		while((b = in.read(bytes, 0, bytes.length)) != -1){
			out.write(bytes, 0, b);
			out.flush();
		}
		in.close();
		out.close();
	}
	/**
	 * 文件的复制    对于较大文件的操作
	 * @param srcFile
	 * @param destFile
	 * @throws IOException
	 */
	public static void copyFileByBuffer(File srcFile,File destFile)throws IOException{
		if(!srcFile.exists()){
			throw new IllegalArgumentException("文件"+ srcFile+"不存在");
		}
		if(!srcFile.isFile()){
			throw new IllegalArgumentException(srcFile+"不是文件");
		}
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
		
		int a;
		while((a = bis.read()) != -1){
			bos.write(a);
			bos.close();
		}
		bis.close();
		bos.close();
		
	}
}
