package prob2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prob2D {

    enum SortBy {TITLE, PRICE}

    public static void sort(List<Product> products, final SortBy sortBy) {
        Collections.sort(products, (e1, e2) -> {
            if (sortBy == SortBy.TITLE) {
                int sortTitle = e1.getTitle().compareTo(e2.getTitle());
                if (sortTitle == 0) {
                    //title is equals
                    return Integer.compare(e1.getModel(), e2.getModel());
                } else {
                    return sortTitle;
                }
            } else if (sortBy == SortBy.PRICE) {
                return Double.compare(e1.getPrice(), e2.getPrice());
            } else {
                return 0;//no sort cause by no sortBy
            }
        });
    }

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Laptop", 999.99, 2)
                , new Product("Laptop", 499.99, 7)
                , new Product("Laptop", 499.99, 1)
                , new Product("Laptop", 499.99, 3)
                , new Product("Laptop", 499.99, 5)
                , new Product("Tablet", 299.99, 3)
                , new Product("Monitor", 199.99, 4));

//        sort(productList, SortBy.TITLE);
        sort(productList, SortBy.PRICE);
        productList.forEach(System.out::println);
    }
}
