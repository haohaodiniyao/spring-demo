package com.my.demo.spring.pooledObject;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConnDemo {

	public static void main(String[] args) throws Exception {
		ConnPool connPool = new ConnPool(new ConnFactory(),new ObjectPoolConfigStrategy().toGenericObjectPoolConfig());
		//监控对象池
        new ScheduledThreadPoolExecutor(5).scheduleAtFixedRate(new Runnable(){

			@Override
			public void run() {
				System.out.println("numActive:"+connPool.getNumActive()+",numIdle:"+connPool.getNumIdle());
			}
        	
        }, 1, 1, TimeUnit.SECONDS);
		//添加对象
        connPool.addObject();
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
        //获取对象
//        Conn conn1 = connPool.borrowObject();
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
//        Conn conn2 = connPool.borrowObject();
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
//        Conn conn3 = connPool.borrowObject();
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
//        Conn conn4 = connPool.borrowObject();
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
//        //返还对象
//        connPool.returnObject(conn1);
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
//        connPool.returnObject(conn2);
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
//        connPool.returnObject(conn3);
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());
//        connPool.returnObject(conn4);
//        System.out.println("活跃对象数(numActive):"+connPool.getNumActive()+",空闲对象数(numIdle):"+connPool.getNumIdle());        
        //对象放入对象池
//        new ScheduledThreadPoolExecutor(5).scheduleAtFixedRate(new Runnable(){
//
//			@Override
//			public void run() {
//				try {
//					connPool.addObject();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//        	
//        }, 1, 3, TimeUnit.SECONDS);	
        
        //从对象池获取对象
//        new ScheduledThreadPoolExecutor(5).scheduleAtFixedRate(new Runnable(){
//
//			@Override
//			public void run() {
//				try {
//					connPool.borrowObject();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//        	
//        }, 1, 5, TimeUnit.SECONDS);	
        
        
        TimeUnit.DAYS.sleep(1);
	}

}
