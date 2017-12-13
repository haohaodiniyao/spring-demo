package com.my.demo.spring;

import java.util.Set;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.my.demo.spring.util.PropUtil;

public class JunitJavaTest {

	@Test
	public void test() {
//		new ScheduledThreadPoolExecutor(5).scheduleAtFixedRate(new Runnable(){
//
//			@Override
//			public void run() {
//				System.out.println("get key=hello:"+PropUtil.getProp("hello"));
//			}
//			
//		}, 1, 3, TimeUnit.SECONDS);
		
		
		new ScheduledThreadPoolExecutor(5).scheduleAtFixedRate(new Runnable(){

			@Override
			public void run() {
//				System.out.println("set key=hello,value=world123"+PropUtil.setProp("hello", "world123"));
				Set<String> sets = PropUtil.getStringPropertyNames();
				sets.stream().forEach(s->System.out.println(s));
			}
			
		}, 1, 4, TimeUnit.SECONDS);
		
		
		try {
			TimeUnit.DAYS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
