package org.group5;

public interface RestaurantInterface {
    String getRestaurantName();

    Double calculateDeliveryCharge();

    default Double calculateDiscount(Double totalOrderAmount) {
        if (totalOrderAmount > 100) {
            return totalOrderAmount - (totalOrderAmount * 0.05);
        }
        return totalOrderAmount;
    }

    static void printFormattedData(
            String restaurantName,
            String customerName,
            Double orderAmount,
            Double deliveryCharge,
            Double discount,
            Double totalAfterDiscount
    ) {
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Customer: " + customerName);
        System.out.printf("Order Amount: $%.2f", orderAmount);
        System.out.println();
        System.out.printf("Delivery Charge: $%.2f", deliveryCharge);
        System.out.println();
        System.out.printf("Discount Applied: $%.2f", discount);
        System.out.println();
        System.out.printf("Total after Discount: $%.2f", totalAfterDiscount);
        System.out.println();
    }
}
