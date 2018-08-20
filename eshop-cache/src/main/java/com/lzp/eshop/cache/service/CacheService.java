package com.lzp.eshop.cache.service;

import com.lzp.eshop.cache.model.ProductInfo;

/**
 * 缓存service接口
 * @author lzp
 *
 */
public interface CacheService {

	/** 
	 * 将商品信息保存到本地缓存中
	 * @param productInfo
	 * @return
	 */
	public ProductInfo saveLocalCache(ProductInfo productInfo);
	
	/**
	 * 从本地缓存中获取商品信息
	 * @param id 
	 * @return
	 */
	public ProductInfo getLocalCache(Long id);
	
}
