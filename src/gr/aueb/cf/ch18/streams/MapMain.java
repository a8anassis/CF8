package gr.aueb.cf.ch18.streams;

import gr.aueb.cf.ch18.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .toList();

        squares.forEach(System.out::println);

        List<Product> products = new ArrayList<>(List.of(new Product("Apples", 12.5, 10),
                new Product("Oranges", 8.2, 35), new Product("Apples", 22.5, 100),
                new Product("Honey", 8.2, 35)));

        var listOfProductDescriptions = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.toCollection(ArrayList::new));
        listOfProductDescriptions.forEach(System.out::println);

        String listOfProductDescriptions2 = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(listOfProductDescriptions);
        System.out.println(listOfProductDescriptions2);


    }
}
