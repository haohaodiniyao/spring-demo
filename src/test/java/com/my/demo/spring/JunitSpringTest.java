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
	}
}
