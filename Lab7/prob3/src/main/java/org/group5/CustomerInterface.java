package org.group5;

public interface CustomerInterface {
    String getCustomerName();

    Integer getLoyaltyPoints();

    default boolean isLoyaltyCustomer(Integer loyaltyPoints) {
        return loyaltyPoints > 50;
    }

    default String getLoyalty() {
        return this.isLoyaltyCustomer(this.getLoyaltyPoints()) ? "Loyal Customer" : "New Customer";
    }

    static void printHeaderData(String restaurantName, String customerName, String customerLoyalty) {
        System.out.println("Processing order for Customer: " + customerName + " at Restaurant: " + restaurantName);
        System.out.println("Customer Loyalty Status: " + customerLoyalty);
    }
}
