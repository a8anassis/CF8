package gr.aueb.cf.ch18.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Filter even numbers
        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evens); // [2, 4, 6]


        List<String> cities = List.of("Athens", "Toronto", "Tunis", "Athens", "London");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("T"))   // Predicate = boolean function
                .toList();  // immutable list

        Iterable<String > filteredCities2 = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList());  // mutable list

        filteredCities.forEach(System.out::println);
        filteredCities2.forEach(System.out::println);

        int[] arr = {1, 2, 3, 4, 5, 6};

        int[] arrayEvens = Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();

        System.out.println(Arrays.toString(arrayEvens)); // [2, 4, 6]

    }
}
