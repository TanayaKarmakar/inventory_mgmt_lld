package com.app.services;

import com.app.models.*;

import java.util.*;

/**
 * @author t0k02w6 on 11/09/22
 * @project inventory_mgmt_lld
 */
public class InventorySystem {
    private static Map<String, Product> productMap = new HashMap<>();
    //private static Map<LocationStatus, List<Location>> locationMap = new HashMap<>();
    private static Map<Location, Unit> locationUnitMap = new HashMap<>();

    public static void addProduct(Product product) {
        product.setId(UUID.randomUUID().toString());
        productMap.put(product.getId(), product);
    }

    public static void removeUnit(Unit unit) {
        Location location = null;
        for(Map.Entry<Location, Unit> entry: locationUnitMap.entrySet()) {
            if(entry.getValue().equals(unit)) {
                location = entry.getKey();
                break;
            }
        }

        if(Objects.isNull(location)) {
            //throw exception
        }
        unit.setLocationId(null);
        locationUnitMap.put(location, null);
    }

    //use algorithm to find locationId
    public static void placeUnit(Unit unit) {
        Location location = null;
        for(Map.Entry<Location, Unit> entry: locationUnitMap.entrySet()) {
            if(Objects.isNull(entry.getValue())) {
                location = entry.getKey();
                unit.setLocationId(entry.getKey().getId());
                break;
            }
        }
        locationUnitMap.put(location, unit);
//        String productId = unit.getProductId();
//        //get product to determine size
//        Product product = productMap.get(productId);
//        if(Objects.isNull(product)) {
//            // throw exception
//        }
//
//
//        Size productSize = product.getSize();
//        List<Location> availableLocations = locationMap.get(LocationStatus.AVAILABLE);
//        if(availableLocations.isEmpty()) {
//            // throw exception
//        }
//        List<Location> availableLocationBasedOnSize = availableLocations.stream()
//                .filter(location -> location.getType() == productSize)
//                .collect(Collectors.toList());
//        if(availableLocationBasedOnSize.isEmpty()) {
//            // throw exception
//        }
//        Location firstLocation = availableLocationBasedOnSize.get(0);
//        unit.setLocationId(firstLocation.getId());
//        firstLocation.setLocationStatus(LocationStatus.FILLED);
//        availableLocations.remove(firstLocation);
//        locationMap.get(LocationStatus.FILLED).add(firstLocation);
//        locationUnitMap.put(firstLocation, unit);
    }

    public static Map<Location, Unit> getShelvesStatus() {
        return locationUnitMap;
    }

    public static void updateStatus(Unit unit, UnitStatus status) {
        unit.setStatus(status);
    }
}
