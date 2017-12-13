package com.my.demo.spring.util;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
/**
 * 监听spring容器初始化完成
 * @author yaokai
 *
 */
@Service
public class SpringInitListener implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		if(event.getApplicationContext().getParent() == null){
			System.out.println("spring容器初始化完成...");
		}
	}

}
