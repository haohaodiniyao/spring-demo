package com.my.demo.spring.pooledObject;

import org.apache.commons.pool2.impl.BaseObjectPoolConfig;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

/**
 * 对象池配置策略
 * @author yaokai
 *
 */
public class ObjectPoolConfigStrategy {
	public ObjectPoolConfigStrategy(){}
	/**
	 * 获取对象方式
	 * 默认true，LIFO(last in first out)后进先出
	 * false FIFO先进先出
	 */
	private boolean lifo = false;
	/**
	 * 从池中获取对象和将对象返还是否使用公平锁
	 */
	private boolean fairness = BaseObjectPoolConfig.DEFAULT_FAIRNESS;
	/**
	 * 获取资源等待时间,单位毫秒，blockWhenExhausted=true有效
	 * -1 无限制 一直阻塞
	 */
	private long maxWaitMillis = 1000L;
	/**
	 * 对象最小空闲时间
	 * 小于等于0 ， 取Long最大值
	 * 大于0，空闲时间大于这个值，移除对象
	 */
	private long minEvictableIdleTimeMillis = -1;
	/**
	 * 对象最小空闲时间
	 * 小于等于0 ， 取Long最大值
	 * 大于0，空闲时间大于这个值，并且当前空闲对象数量大于minIdle，移除对象
	 */
	private long softMinEvictableIdleTimeMillis = 1000L*60L*30L;
	/**
	 * 检测空闲对象线程每次检测的空闲对象数量
	 */
	private int numTestsPerEvictionRun = -1;
	/**
	 * 对象移除策略类名
	 */
	private String evictionPolicyClassName = BaseObjectPoolConfig.DEFAULT_EVICTION_POLICY_CLASS_NAME;
	/**
	 * 创建时检测对象是否有效
	 */
	private boolean testOnCreate = true;
	/**
	 * 从对象池获取对象检测对象是否有效
	 */
	private boolean testOnBorrow = true;
	/**
	 * 向对象池归还对象时检测对象是否有效
	 */
	private boolean testOnReturn = true;
	/**
	 * 检测空闲对象线程,检测不需要移除的空闲对象的有效性
	 */
	private boolean testWhileIdle = true;
	/**
	 * 空闲对象检测执行周期，单位毫秒，小于等于0，不执行检测
	 */
	private long timeBetweenEvictionRunsMillis = 1000L*60L*30L;
	/**
	 * 没有空闲对象是，获取对象请求阻塞
	 */
	private boolean blockWhenExhausted = true;
	/**
	 * 每个key对象池中管理最大的对象个数
	 */
	private int maxTotalPerKey = 50;
	/**
	 * 每个key对象池中管理的最大空闲个数
	 */
	private int maxIdlePerKey = 50;
	/**
	 * 每个key对象池中管理的最小空闲个数
	 */
	private int minIdlePerKey = 10;	
	private int maxTotal = 50;
	private int maxIdle = 50;
	private int minIdle = 10;
	
	public GenericKeyedObjectPoolConfig toGenericKeyedObjectPoolConfig(){
		GenericKeyedObjectPoolConfig genericKeyedObjectPoolConfig = new GenericKeyedObjectPoolConfig();
		genericKeyedObjectPoolConfig.setLifo(this.lifo);
		genericKeyedObjectPoolConfig.setFairness(this.fairness);
		genericKeyedObjectPoolConfig.setMaxWaitMillis(this.maxWaitMillis);
		genericKeyedObjectPoolConfig.setMinEvictableIdleTimeMillis(this.minEvictableIdleTimeMillis);
		genericKeyedObjectPoolConfig.setSoftMinEvictableIdleTimeMillis(this.softMinEvictableIdleTimeMillis);
		genericKeyedObjectPoolConfig.setNumTestsPerEvictionRun(this.numTestsPerEvictionRun);
		genericKeyedObjectPoolConfig.setEvictionPolicyClassName(this.evictionPolicyClassName);
		genericKeyedObjectPoolConfig.setTestOnCreate(this.testOnCreate);
		genericKeyedObjectPoolConfig.setTestOnBorrow(this.testOnBorrow);
		genericKeyedObjectPoolConfig.setTestOnReturn(this.testOnReturn);
		genericKeyedObjectPoolConfig.setTestWhileIdle(this.testWhileIdle);
		genericKeyedObjectPoolConfig.setTimeBetweenEvictionRunsMillis(this.timeBetweenEvictionRunsMillis);
		genericKeyedObjectPoolConfig.setBlockWhenExhausted(this.blockWhenExhausted);
		genericKeyedObjectPoolConfig.setMinIdlePerKey(this.maxIdlePerKey);
		genericKeyedObjectPoolConfig.setMaxIdlePerKey(this.minIdlePerKey);
		genericKeyedObjectPoolConfig.setMaxTotal(this.maxTotal);
		genericKeyedObjectPoolConfig.setMaxTotalPerKey(this.maxTotalPerKey);
		return genericKeyedObjectPoolConfig;
	}
	
	public GenericObjectPoolConfig toGenericObjectPoolConfig(){
		GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
		genericObjectPoolConfig.setLifo(this.lifo);
		genericObjectPoolConfig.setFairness(this.fairness);
		genericObjectPoolConfig.setMaxWaitMillis(this.maxWaitMillis);
		genericObjectPoolConfig.setMinEvictableIdleTimeMillis(this.minEvictableIdleTimeMillis);
		genericObjectPoolConfig.setSoftMinEvictableIdleTimeMillis(this.softMinEvictableIdleTimeMillis);
		genericObjectPoolConfig.setNumTestsPerEvictionRun(this.numTestsPerEvictionRun);
		genericObjectPoolConfig.setEvictionPolicyClassName(this.evictionPolicyClassName);
		genericObjectPoolConfig.setTestOnCreate(this.testOnCreate);
		genericObjectPoolConfig.setTestOnBorrow(this.testOnBorrow);
		genericObjectPoolConfig.setTestOnReturn(this.testOnReturn);
		genericObjectPoolConfig.setTestWhileIdle(this.testWhileIdle);
		genericObjectPoolConfig.setTimeBetweenEvictionRunsMillis(this.timeBetweenEvictionRunsMillis);
		genericObjectPoolConfig.setBlockWhenExhausted(this.blockWhenExhausted);
		genericObjectPoolConfig.setMaxTotal(this.maxTotal);
		genericObjectPoolConfig.setMaxIdle(this.maxIdle);
		genericObjectPoolConfig.setMinIdle(this.minIdle);
		return genericObjectPoolConfig;
	}
	public boolean isLifo() {
		return lifo;
	}
	public void setLifo(boolean lifo) {
		this.lifo = lifo;
	}
	public boolean isFairness() {
		return fairness;
	}
	public void setFairness(boolean fairness) {
		this.fairness = fairness;
	}
	public long getMaxWaitMillis() {
		return maxWaitMillis;
	}
	public void setMaxWaitMillis(long maxWaitMillis) {
		this.maxWaitMillis = maxWaitMillis;
	}
	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}
	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}
	public long getSoftMinEvictableIdleTimeMillis() {
		return softMinEvictableIdleTimeMillis;
	}
	public void setSoftMinEvictableIdleTimeMillis(long softMinEvictableIdleTimeMillis) {
		this.softMinEvictableIdleTimeMillis = softMinEvictableIdleTimeMillis;
	}
	public int getNumTestsPerEvictionRun() {
		return numTestsPerEvictionRun;
	}
	public void setNumTestsPerEvictionRun(int numTestsPerEvictionRun) {
		this.numTestsPerEvictionRun = numTestsPerEvictionRun;
	}
	public String getEvictionPolicyClassName() {
		return evictionPolicyClassName;
	}
	public void setEvictionPolicyClassName(String evictionPolicyClassName) {
		this.evictionPolicyClassName = evictionPolicyClassName;
	}
	public boolean isTestOnCreate() {
		return testOnCreate;
	}
	public void setTestOnCreate(boolean testOnCreate) {
		this.testOnCreate = testOnCreate;
	}
	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}
	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}
	public boolean isTestOnReturn() {
		return testOnReturn;
	}
	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}
	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}
	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}
	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}
	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}
	public boolean isBlockWhenExhausted() {
		return blockWhenExhausted;
	}
	public void setBlockWhenExhausted(boolean blockWhenExhausted) {
		this.blockWhenExhausted = blockWhenExhausted;
	}
	public int getMaxTotalPerKey() {
		return maxTotalPerKey;
	}
	public void setMaxTotalPerKey(int maxTotalPerKey) {
		this.maxTotalPerKey = maxTotalPerKey;
	}
	public int getMaxIdlePerKey() {
		return maxIdlePerKey;
	}
	public void setMaxIdlePerKey(int maxIdlePerKey) {
		this.maxIdlePerKey = maxIdlePerKey;
	}
	public int getMinIdlePerKey() {
		return minIdlePerKey;
	}
	public void setMinIdlePerKey(int minIdlePerKey) {
		this.minIdlePerKey = minIdlePerKey;
	}
	public int getMaxTotal() {
		return maxTotal;
	}
	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	
}
