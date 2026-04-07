import java.util.*;
import java.util.stream.*;

class Bogie2{
    String name;
    int capacity;

    Bogie2(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class UC9{

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 54));
        passengerBogies.add(new Bogie("First Class", 36));
        passengerBogies.add(new Bogie("Sleeper", 70));
        passengerBogies.add(new Bogie("AC Chair", 56));

        Map<String, List<Bogie>> groupedBogies = passengerBogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        System.out.println("Grouped passenger bogies:");
        groupedBogies.forEach((type, bogies) -> {
            System.out.println(type + ": " + bogies);
        });
    }
}