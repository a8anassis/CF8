package gr.aueb.cf.ch18.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Other {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(new Product("Apples", 12.5, 10),
                new Product("Oranges", 8.2, 35), new Product("Apples", 22.5, 100),
                new Product("Honey", 8.2, 35)));


        List<Product> sortedByQuantity = products.stream()
                .sorted(Comparator.comparingInt(Product::getQuantity).reversed())
                .toList();

        System.out.println(sortedByQuantity);

        double totalHighValue = products.stream()
                .filter(p -> p.getPrice() > 100)
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();
        System.out.println("Total high-value inventory: $" + totalHighValue);

        List<String> cheapProductNames = products.stream()
                .filter(p -> p.getPrice() < 500)
                .map(Product::getDescription)
                .map(String::toUpperCase)
                .toList();
        System.out.println(cheapProductNames);


        double avgPrice = products.stream()
                .filter(p -> p.getQuantity() >= 5)
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);


        List<String> top3Expensive = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .limit(3)
                .map(Product::getDescription)
                .toList();
        System.out.println(top3Expensive);


        Optional<Product> firstProduct = products.stream()
                .filter(p -> p.getPrice() > 300)
                .findFirst();

        firstProduct.ifPresent(System.out::println);

        Product firstProduct2 = products.stream()
                .filter(p -> p.getPrice() > 1500) // no product matches
                .findFirst()
                .orElse(new Product("Default", 0, 0));

        System.out.println(firstProduct);

        Optional<Product> anyProduct = products.parallelStream()
                .filter(p -> p.getPrice() > 300)
                .findAny();

        anyProduct.ifPresent(System.out::println);


        Product anyProduct2 = products.parallelStream()
                .filter(p -> p.getPrice() > 1500) // no match
                .findAny()
                .orElse(new Product("Default", 0, 0));
    }
}
