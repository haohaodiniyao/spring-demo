package com.my.demo.spring.pooledObject;

import java.util.concurrent.TimeUnit;

public class Conn {
	private long createTime;
	public Conn(){
		try {
			Thread.sleep(500);
			createTime = System.currentTimeMillis();
			System.out.println("init conn suc..." + createTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void report(){
		System.out.println("this is a available conn " + createTime);
	}
	public long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
	
}
