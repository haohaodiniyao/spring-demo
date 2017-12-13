package com.my.demo.spring.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
/**
 * 获取ApplicationContext中bean
 * @author yaokai
 *
 */
public class AppUtil implements ApplicationContextAware {
	private static ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		AppUtil.applicationContext = applicationContext;
	}
	public Object getBean(String name){
		if(applicationContext == null){
			return null;
		}else{
			return applicationContext.getBean(name);
		}
	}
}
