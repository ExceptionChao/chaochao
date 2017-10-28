package com.test.demo3;

import java.util.HashMap;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

/**
 * File类的操作
 *  
 * @author my
 *
 */
public class Mytest{

	public static void main(String[] args)throws Exception {
		Map<String, Object> map = new HashMap<>();
		
		map.put("范冰冰", "王一超1");
		map.put("李李冰", "王一超2");
		map.put("王冰冰", "王一超3");
		map.put("张冰冰", "王一超4");
		map.put("赵冰冰", "王一超5");
		map.put("高冰冰", "王一超6");
		map.put("花冰冰", "王一超7");
		
		for (Map.Entry<String, Object> entry: map.entrySet()) {
			System.out.println(entry.getKey()+ "===" +entry.getValue());
		}
		
	}

}
