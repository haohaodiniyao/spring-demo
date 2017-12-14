package com.my.demo.spring.pooledObject;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;
/**
 * 创建数据库连接工厂
 * @author yaokai
 *
 */
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
