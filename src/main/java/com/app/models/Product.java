package com.app.models;

import java.math.BigDecimal;

/**
 * @author t0k02w6 on 11/09/22
 * @project inventory_mgmt_lld
 */
public class Product {
    private String id;
    private BigDecimal price;
    private String description;
    private BigDecimal weight;
    private Size size;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
