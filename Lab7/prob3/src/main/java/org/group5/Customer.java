package org.group5;

public class Customer implements CustomerInterface {
    private String name;
    private Integer loyaltyPoints;

    private Customer() {
    }

    public Customer(String name, Integer loyaltyPoints) {
        this.name = name;
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public String getCustomerName() {
        return this.name;
    }

    @Override
    public Integer getLoyaltyPoints() {
        return this.loyaltyPoints;
    }
}
