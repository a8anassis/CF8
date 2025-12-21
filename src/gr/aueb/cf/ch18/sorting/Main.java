package gr.aueb.cf.ch18.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(new Product("Apples", 12.5, 10),
                new Product("Oranges", 8.2, 35), new Product("Apples", 22.5, 100),
                new Product("Honey", 8.2, 35)));


//        products.sort(Comparator.naturalOrder());       // interface Comparable ascending
//        products.sort(Comparator.reverseOrder());       // interface Comparable descending

//        products.sort(Comparator.comparing(Product::getPrice));
//        products.sort(Comparator.comparing(Product::getDescription)
//                .thenComparing(Product::getQuantity, Comparator.reverseOrder()));

//        products.forEach(System.out::println);

        products.sort(
                Comparator.comparing(Product::getDescription)
                        .thenComparing(Product::getQuantity, Comparator.reverseOrder())
                        .thenComparing(Product::getPrice)
//                        .reversed()
        );

        products.forEach(System.out::println);


    }
}
