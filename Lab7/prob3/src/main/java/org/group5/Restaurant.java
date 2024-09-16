package org.group5;

public class Restaurant implements RestaurantInterface {
    private String name;
    private Double baseDeliveryCharge;
    private Double locationDistance;

    private Restaurant() {
    }

    public Restaurant(String name, Double baseDeliveryCharge, Double locationDistance) {
        this.name = name;
        this.baseDeliveryCharge = baseDeliveryCharge;
        this.locationDistance = locationDistance;
    }

    @Override
    public String getRestaurantName() {
        return this.name;
    }

    public Double getLocationDistance() {
        return locationDistance;
    }

    @Override
    public Double calculateDeliveryCharge() {
        return this.baseDeliveryCharge + (this.getLocationDistance() * 0.05);
    }
}
