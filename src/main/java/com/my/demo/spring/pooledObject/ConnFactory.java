package com.my.demo.spring.pooledObject;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

public class ConnFactory extends BasePooledObjectFactory<Conn> {

	@Override
	public Conn create() throws Exception {
		return new Conn();
	}

	@Override
	public PooledObject<Conn> wrap(Conn obj) {
		return new DefaultPooledObject<Conn>(obj);
	}

}
