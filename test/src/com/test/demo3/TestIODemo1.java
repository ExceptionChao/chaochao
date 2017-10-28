package com.test.demo3;
/**
 * 编码问题：
 *  utf-8 占用3字节
 *  gbk 占用2字节
 *  ISO-8859-1占用1字节
 *  
 * @author my
 *
 */
public class TestIODemo1 {

	public static void main(String[] args)throws Exception {
		
		String a = "于晨abcABC";
		byte[] bytes = a.getBytes();
		for (byte b : bytes) {
			//以16进制方式打印到控制台
			System.out.print(Integer.toHexString(b & 0xff) + " ");
		}
		System.out.println("================");
//		String str1 = new String("utf-8");
		byte[] b2 = a.getBytes("gbk");
		for (byte b : b2) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
		System.out.println("==================");
//		String str2 = new String("gbk");
		byte[] b3 = a.getBytes("ISO-8859-1");
		for (byte b : b3) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
//		System.out.println("==================");
//		byte[] b4 = a.getBytes("utf-8");
//		for (byte b : b4) {
//			System.out.print(Integer.toHexString(b & 0xff)+" ");
//		}
	}

}
