package com.app.models;

import java.util.HashMap;
import java.util.Map;

/**
 * @author t0k02w6 on 11/09/22
 * @project inventory_mgmt_lld
 */
public class Order {
    private Map<Product, Integer> productCountMap = new HashMap<>();

    public Map<Product, Integer> getProductCountMap() {
        return productCountMap;
    }
}
