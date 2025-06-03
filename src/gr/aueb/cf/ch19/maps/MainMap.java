package gr.aueb.cf.ch19.maps;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();

        // Add
        countries.put("GR", "Greece");
        countries.put("US", "United States");
        countries.put("EN", "England");

        // Update
        countries.put("US", "U. States");

        // Get
        String value = countries.get("GR"); // Greece
        System.out.println(value);          // Greece

        // Remove
        countries.remove("GR");

        // Iterate
        for (Map.Entry<String, String> entry : countries.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "Value: " + entry.getValue());
        }

        countries.forEach((k, v) -> System.out.println("Key: " + k + "value: " + v));

    }
}
