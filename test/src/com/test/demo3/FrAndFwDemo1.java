package com.test.demo3;

import java.io.FileReader;
import java.io.FileWriter;

public class FrAndFwDemo1 {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("E:\\新建文件夹\\web变成java.txt");
		FileWriter fw = new FileWriter("E:\\C\\web变成java1.txt");
//		String encoding = fr.getEncoding();
//		System.out.println(encoding+"=====");
//		int b;
//		while((b = fr.read()) != -1){
//			System.out.print((char)b);
//		}
		
		char[] bytes = new char[10 * 1024];
		int a ;
		while((a = fr.read(bytes, 0, bytes.length)) != -1 ){
			fw.write(a);
			fw.flush();
			System.out.println((char)a);
		}
		fr.close();
		fw.close();
		
	}
}
