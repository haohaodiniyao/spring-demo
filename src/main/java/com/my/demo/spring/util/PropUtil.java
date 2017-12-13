package com.my.demo.spring.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;
/**
 * 读取本地properties配置文件
 * hashtable线程安全
 * @author yaokai
 *
 */
public class PropUtil {
	private static final Properties prop = new Properties();
	static{
		try {
			prop.load(new InputStreamReader(PropUtil.class.getResourceAsStream("/config/config.properties"),"UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Object getProp(String key){
		return prop.get(key);
	}
	public static Object getProp(String key,String defaultValue){
		return prop.getProperty(key, defaultValue);
	}
	/**
	 * 直接修改hashtable值
	 * @param key
	 * @param value
	 * @return
	 */
	public static Object setProp(String key,String value){
		return prop.setProperty(key, value);
	}
	/**
	 * key列表
	 * @return
	 */
	public static Set<String> getStringPropertyNames(){
		return prop.stringPropertyNames();
	}
}
