package com.my.demo.spring.pooledObject;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
/**
 * 数据库连接池对象 
 * jedis使用的是默认的GenericObjectPoolConfig配置策略
 * @author yaokai
 *
 */
public class ConnPool extends GenericObjectPool<Conn> {
	public ConnPool(ConnFactory connFactory,GenericObjectPoolConfig genericObjectPoolConfig){
		super(connFactory,genericObjectPoolConfig);
	}
}
