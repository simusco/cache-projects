package com.lzp.eshop.cache.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lzp.eshop.cache.model.ProductInfo;
import com.lzp.eshop.cache.service.CacheService;

/**
 * 缓存Controller
 * @author lzp
 *
 */
@Controller
public class CacheController {

	@Resource
	private CacheService cacheService;
	
	@RequestMapping("/testPutCache")
	@ResponseBody
	public String testPutCache(ProductInfo productInfo) {
		cacheService.saveLocalCache(productInfo);
		return "success";
	}
	
	@RequestMapping("/testGetCache")
	@ResponseBody
	public ProductInfo testGetCache(Long id) {
		return cacheService.getLocalCache(id);
	}
	
}
