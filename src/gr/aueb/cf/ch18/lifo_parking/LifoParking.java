package gr.aueb.cf.ch18.lifo_parking;

import java.time.LocalDateTime;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Υλοποιεί τη λογική ενός parking με λογική
 * Last-In-First-Out.
 */
public class LifoParking {
    private final Deque<String> parking = new LinkedList<>();

    public LifoParking() {

    }

    public List<String> getParking() {
        return List.copyOf(parking);
        //return Collections.unmodifiableList(parking);
    }

    // Delegation
    public void addCar(String carId) {
        parking.push(carId);
        System.out.println(LocalDateTime.now() + ", Είσοδος, Αρ. Πινακίδας: " + carId);
    }

    public String removeCar() {
        String carId = parking.pop();
        System.out.println(LocalDateTime.now() + ", Έξοδος, Αρ. Πινακίδας: " + carId);
        return carId;
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }
}

