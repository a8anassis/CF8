package gr.aueb.cf.ch18.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMain {

    public static void main(String[] args) {
        List<String> cities = List.of("Athens", "Toronto", "Tunis", "Athens", "London");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("T"))   // Predicate = boolean function
                .toList();  // immutable list

        Iterable<String > filteredCities2 = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toList());  // mutable list

        filteredCities.forEach(System.out::println);
        filteredCities2.forEach(System.out::println);
    }
}
