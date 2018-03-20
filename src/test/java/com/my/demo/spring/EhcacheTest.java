package com.my.demo.spring;

import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhcacheTest {
	private static CacheManager cacheManager;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cacheManager = CacheManager.create();
	}

	@Test
	public void test() {
		Cache cache = cacheManager.getCache("test-cache");
		cache.put(new Element("hello","world"));
		Element element = cache.get("hello");
		System.out.println("key:"+element.getObjectKey()+",value:"+element.getObjectValue());
		cache.remove("hello");
		element = cache.get("hello");
		System.out.println("key:"+element.getObjectKey()+",value:"+element.getObjectValue());

	}

}
