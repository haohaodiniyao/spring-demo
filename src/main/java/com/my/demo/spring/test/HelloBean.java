package com.my.demo.spring.test;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.cache.annotation.Cacheable;
/**
 * 实现InitializingBean接口，初始化bean 
 * 先调用afterPropertiesSet方法 
 * 再调用init-method
 * @author yaokai
 *
 */
public class HelloBean implements InitializingBean{
	
	public void initHelloBean(){
//		try {
//			TimeUnit.SECONDS.sleep(5);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		System.out.println("2) init method ...");
	}
	@Cacheable(value="test-cache",key="#msg")
	public String getMsg(String msg){
		System.out.println("msg:"+msg);
		return msg;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("1) afterPropertiesSet ...");
	}
	
}
