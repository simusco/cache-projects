package com.lzp.eshop.inventory.model;

import lombok.Data;

@Data
public class ProductInventory {

    /**
     * 商品id
     */
    private Integer productId;
    /**
     * 库存数量
     */
    private Long inventoryCnt;

}
