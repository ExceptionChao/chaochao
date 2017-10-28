package com.test.demo3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 编码问题：
 *  utf-8 占用3字节
 *  gbk 占用2字节
 *  ISO-8859-1占用1字节
 *  
 * @author my
 *
 */
public class TestOutoutDemo1 {

	public static void main(String[] args)throws Exception {
//		IOUtil.copyFile(new File("E:\\资料\\王一超.txt"), new File("E:\\C\\better王一超.txt"));
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("demo/data.dat"));
		dos.writeInt(10);
		dos.writeInt(-10);
		dos.writeLong(10l);
		dos.writeUTF("China");
		//才i用UTF-8写入
		dos.writeUTF("中国");
		//采用utf-16be写入
		dos.writeChars("国中");
		
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("demo/data.dat"));
		int i = dis.readInt();
		System.out.println(i);
		Long l = dis.readLong();
		System.out.println(l);
		String s = dis.readUTF();
		System.out.println(s);
		char s1 = dis.readChar();
		System.out.println();
		dis.close();
	}

}
