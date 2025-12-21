package gr.aueb.cf.ch18.streams;

import gr.aueb.cf.ch18.sorting.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<gr.aueb.cf.ch18.sorting.Product> products = new ArrayList<>(List.of(new Product("Apples", 12.5, 100),
                new Product("Oranges", 8.2, 110), new Product("Apples", 22.5, 120),
                new Product("Honey", 8.2, 15)));


        int totalSum = numbers.stream().reduce(0, (sum, n) -> sum + n);
        int totalSum2 = numbers.stream().reduce(0, Integer::sum);       // Integer has a static method sum()

        int sumOfQuantities = products.stream()
                .map(Product::getQuantity)
                .reduce(0, Integer::sum);

        int totalQuantities = products.stream()
                .mapToInt(Product::getQuantity)
                .sum();

        double totalPrices = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();     // works with primitive types

        Iterable<String> sortedProductDescriptions = products.stream()
                .filter(p -> p.getQuantity() >= 100)
                .sorted(Comparator.comparing(Product::getDescription))
                .map(Product::getDescription)
                .collect(Collectors.toCollection(ArrayList::new));

        sortedProductDescriptions.forEach(System.out::println);
    }
}
