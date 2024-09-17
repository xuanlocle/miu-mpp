package prob2;

import java.util.Arrays;
import java.util.List;

public class Prob2A {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Laptop", 999.99, 2)
                , new Product("Smartphone", 499.99, 5)
                , new Product("Tablet", 299.99, 3)
                , new Product("Monitor", 199.99, 4));


        productList.sort(new ProductPriceComparator());
        productList.forEach(System.out::println);
    }
}
