package gr.aueb.cf.ch19.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        // Add
        cities.add("Athens");       // index 0
        cities.add("New York");     // index 1
        cities.add("London");       // index 2

        // Get
        String city = cities.get(0);    // Athens
        System.out.println("City: " + city);    // Athens

        // Set - Update
        int nyPosition = cities.indexOf("New York");
        if (nyPosition != -1) {
            cities.set(nyPosition, "NY");
        } else {
            System.out.println("New York does not exist");
        }

        // Remove
        if (cities.contains("Athens")) {
            cities.remove("Athens");
        } else {
            System.out.println("Athens not exists");
        }

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        for (String el : cities) {
            System.out.println(el);
        }

        Iterator<String> iter = cities.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

//        Iterator<String> it = cities.iterator();
//        while (it.hasNext()) {
//            if (it.next().equals("London")) {
//                it.remove();
//            }
//        }
        cities.removeIf(c -> c.startsWith("A"));
        cities.forEach(System.out::println);

    }
}
