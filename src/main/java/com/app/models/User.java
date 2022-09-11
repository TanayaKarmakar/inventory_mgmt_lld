package com.app.models;

import com.app.services.InventorySystem;

/**
 * @author t0k02w6 on 11/09/22
 * @project inventory_mgmt_lld
 */
public class User {
    public void addProduct(Product product) {
        InventorySystem.addProduct(product);
    }

    public void executeOrder() {

    }
}
