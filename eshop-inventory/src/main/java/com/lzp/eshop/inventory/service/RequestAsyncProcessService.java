package com.lzp.eshop.inventory.service;

import com.lzp.eshop.inventory.request.Request;

/**
 * 请求异步执行的service(路由)
 * @author lzp
 *
 */
public interface RequestAsyncProcessService {

	void process(Request request);
	
}
