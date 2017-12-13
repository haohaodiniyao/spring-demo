package com.my.demo.spring.pooledObject;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class ConnPool extends GenericObjectPool<Conn> {
	public ConnPool(ConnFactory connFactory,GenericObjectPoolConfig genericObjectPoolConfig){
		super(connFactory,genericObjectPoolConfig);
	}
}
