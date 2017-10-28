package com.test.demo3;

import java.io.File;

/**
 * 编码问题：
 *  utf-8 占用3字节
 *  gbk 占用2字节
 *  ISO-8859-1占用1字节
 *  
 * @author my
 *
 */
public class TestIODemo2 {

	public static void main(String[] args)throws Exception {
		IOUtil.copyFile(new File("E:\\资料\\王一超.txt"), new File("E:\\C\\better王一超.txt"));
		
	}

}
