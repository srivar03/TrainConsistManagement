import java.util.*;
import java.util.stream.*;

class Bogie3 {
    String name;
    int capacity;

    Bogie3(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class UC10{

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Create a list of passenger bogies
        List<Bogie> passengerBogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 54),
                new Bogie("First Class", 36),
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 56)
        );

        // Display all bogies
        System.out.println("Passenger bogies:");
        passengerBogies.forEach(System.out::println);

        // Compute total seating capacity using map + reduce
        int totalSeats = passengerBogies.stream()
                .map(b -> b.capacity)        // extract capacity
                .reduce(0, Integer::sum);    // sum all capacities

        System.out.println("Total seating capacity in train: " + totalSeats + " seats");
    }
}