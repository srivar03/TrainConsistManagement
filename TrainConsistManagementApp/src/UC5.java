import java.util.*;

public class UC5{

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");
        trainFormation.add("Sleeper"); // duplicate

        System.out.println("Final train formation (insertion order preserved): " + trainFormation);
    }
}