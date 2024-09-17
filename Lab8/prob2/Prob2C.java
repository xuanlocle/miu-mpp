package prob2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prob2C {

    enum SortBy {TITLE, PRICE}

    public static void sort(List<Product> products, final SortBy sortBy) {
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product e1, Product e2) {
                if (sortBy == SortBy.TITLE) {
                    return new ProductTitleComparator().compare(e1, e2);
                } else if (sortBy == SortBy.PRICE) {
                    return new ProductPriceComparator().compare(e1, e2);
                } else return 0; //not sort if not set the sortBy
            }
        }
        products.sort(new ProductComparator());
    }

    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
                new Product("Laptop", 999.99, 2)
                , new Product("Smartphone", 499.99, 5)
                , new Product("Tablet", 299.99, 3)
                , new Product("Monitor", 199.99, 4));


        sort(productList, SortBy.PRICE);
//        sort(productList, SortBy.TITLE);
        productList.forEach(System.out::println);
    }
}
