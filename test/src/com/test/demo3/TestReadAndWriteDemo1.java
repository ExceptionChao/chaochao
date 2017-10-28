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
public class TestReadAndWriteDemo1 {

	public static void main(String[] args)throws Exception {
		ReadAndWrite.fileInputStream("E:\\新建文件夹\\web变成java.txt");
	}

}
