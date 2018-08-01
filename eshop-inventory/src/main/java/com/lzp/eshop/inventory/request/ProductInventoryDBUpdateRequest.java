package com.lzp.eshop.inventory.request;

import com.lzp.eshop.inventory.model.ProductInventory;
import com.lzp.eshop.inventory.service.ProductInventoryService;

/**
 * 商品库存 更新请求
 *      删除缓存
 *      更新数据库
 */
public class ProductInventoryDBUpdateRequest implements Request  {

    /**
     * 商品库存
     */
    private ProductInventory productInventory;
    /**
     * 商品库存Service
     */
    private ProductInventoryService productInventoryService;

    public ProductInventoryDBUpdateRequest(ProductInventory productInventory,
                                           ProductInventoryService productInventoryService) {
        this.productInventory = productInventory;
        this.productInventoryService = productInventoryService;
    }

    @Override
    public void process() {
        // 删除redis中的缓存
        productInventoryService.removeProductInventoryCache(productInventory);
        // 修改数据库中的库存
        productInventoryService.updateProductInventory(productInventory);
    }
}
