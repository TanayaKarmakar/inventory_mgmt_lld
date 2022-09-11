package com.app.models;

import java.util.Objects;

/**
 * @author t0k02w6 on 11/09/22
 * @project inventory_mgmt_lld
 */
public class Unit {
    private String id;
    private String productId;
    private String locationId;
    private UnitStatus status;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return getId().equals(unit.getId()) && getProductId().equals(unit.getProductId()) && getLocationId().equals(unit.getLocationId()) && getStatus() == unit.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getProductId(), getLocationId(), getStatus());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public UnitStatus getStatus() {
        return status;
    }

    public void setStatus(UnitStatus status) {
        this.status = status;
    }
}
