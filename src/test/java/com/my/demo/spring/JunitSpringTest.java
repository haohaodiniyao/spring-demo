package com.my.demo.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.demo.spring.test.HelloBean;
import com.my.demo.spring.util.AppUtil;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class JunitSpringTest{
	@Autowired
	private AppUtil appUtil;
	@Test
	public void test1(){
		HelloBean helloBean = (HelloBean)appUtil.getBean("helloBean");
		System.out.println(helloBean.getMsg("Hello World!"));
		System.out.println(helloBean.getMsg("Hello World!"));
		
		/**
		CacheManager cacheManager = (CacheManager)appUtil.getBean("cacheManagerFactory");
		Cache cache = cacheManager.getCache("test-cache");
		Element element = new Element("hello","world");
		cache.put(element);
		
		Element element2 = cache.get("hello");
		Object key = element2.getObjectKey();
		Object value = element2.getObjectValue();
		System.out.println("key:"+key+",value:"+value);
		*/
	}
}
