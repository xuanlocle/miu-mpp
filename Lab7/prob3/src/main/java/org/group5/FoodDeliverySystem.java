package org.group5;

import java.util.ArrayList;
import java.util.Random;

public class FoodDeliverySystem {
    private static Random random = new Random();

    public static void main(String[] args) {
        // Create an ArrayList of Restaurants
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Sushi Palace", 5.0, 10.0));
        restaurants.add(new Restaurant("Pizza Corner", 3.5, 5.0));
        restaurants.add(new Restaurant("Burger World", 4.0, 7.5));

        // Create an ArrayList of Customers
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("John Doe", 60));
        customers.add(new Customer("Jane Smith", 40));
        customers.add(new Customer("Bob Johnson", 80));

        // Print welcome message
        System.out.println("Welcome to the Food Delivery System!");
        System.out.println();

        // Loop
        restaurants.forEach(restaurant -> customers.forEach(customer -> {
            CustomerInterface.printHeaderData(
                    restaurant.getRestaurantName(),
                    customer.getCustomerName(),
                    customer.getLoyalty());

            Double totalOrderAmount = (double) random
                    .ints(50, 200)
                    .findFirst()
                    .getAsInt();
            Double finalOrderAmount = restaurant.calculateDiscount(totalOrderAmount);
            RestaurantInterface.printFormattedData(
                    restaurant.getRestaurantName(),
                    customer.getCustomerName(),
                    totalOrderAmount,
                    restaurant.calculateDeliveryCharge(),
                    totalOrderAmount - finalOrderAmount,
                    finalOrderAmount
            );
            System.out.println();
        }));
    }
}