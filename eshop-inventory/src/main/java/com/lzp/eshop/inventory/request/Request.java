package com.lzp.eshop.inventory.request;

/**
 * 请求接口
 * @author lzp
 *
 */
public interface Request {

    void process();

    Integer getProductId();

    boolean isForceRefresh();
}
