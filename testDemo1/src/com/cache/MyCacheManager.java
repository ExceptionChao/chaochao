package com.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCacheManager<T> {
	
	//创建的缓存
	private Map<String , T> cache = new ConcurrentHashMap<String , T>();
	
	public T getValue(Object key){
		return cache.get(key);
	}
	
	public void addOrUpdateCache(String key, T value){
		cache.put(key, value);
	}
	
	/**
	 * 清空缓存中的一条记录
	 * @param key
	 */
	public void evcitCache(String key){
		//判断是否包含
		if(cache.containsKey(key)){
			cache.remove(key);
		}
	}
	
	/**
	 * 清空缓存
	 */
	public void evcitCache(){
		cache.clear();
	}
	
}
