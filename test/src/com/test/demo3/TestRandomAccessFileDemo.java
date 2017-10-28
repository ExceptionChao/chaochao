package com.test.demo3;

import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * RandomAccessFile
 * 文件访问
 * 	java提供的可以对文件内容的访问，既可以读、也可以写
 * 	可以随机的访问文件的内容
 *  
 * @author my
 *
 */
public class TestRandomAccessFileDemo {

	public static void main(String[] args)throws Exception {
		File file = new File("demo");
		if(!file.exists())
			file.mkdir();
		File file1 = new File(file,"raf.dat");
		if(!file1.exists())
			file1.createNewFile();
		//rw   读写权限
		//r    只读权限    
		//只对文件进行操作，不能操作目录
		RandomAccessFile raf = new RandomAccessFile(file1, "rw");
		//打印指针位置
		System.out.println(raf.getFilePointer());
		//write每次只能写一个字节
		raf.write('A');
		
		System.out.println(raf.getFilePointer());
		
		raf.write('中');
		
		System.out.println(raf.getFilePointer());
		
		int i = 0x7fffffff;
		
		raf.writeInt(i);
		
		System.out.println(raf.getFilePointer());
		
		String s = "王";
		//设置好编码格式，防止乱码
		byte[] bytes = s.getBytes("utf-8");
		
		raf.write(bytes);
		
		System.out.println("===============================");
		
		//读文件
		//因为文件内容比较多，一次全部读取后用一个字节数组来接收
		//本身java保存数据到硬盘上都是以多字节存储的
		//首先读的时候先把指针放到起始位置
		raf.seek(0);
		byte[] bytes1 = new byte[(int)raf.length()];
		raf.read(bytes1);
		System.out.println(Arrays.toString(bytes1));
		
		raf.close();
	}

}
