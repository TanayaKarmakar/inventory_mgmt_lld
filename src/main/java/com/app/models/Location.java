package com.app.models;

import java.util.Objects;

/**
 * @author t0k02w6 on 11/09/22
 * @project inventory_mgmt_lld
 */
public class Location {
    private String id;
    private Size type;
    private LocationStatus locationStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(getId(), location.getId()) && getType() == location.getType() && getLocationStatus() == location.getLocationStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getType(), getLocationStatus());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Size getType() {
        return type;
    }

    public void setType(Size type) {
        this.type = type;
    }

    public LocationStatus getLocationStatus() {
        return locationStatus;
    }

    public void setLocationStatus(LocationStatus locationStatus) {
        this.locationStatus = locationStatus;
    }
}
