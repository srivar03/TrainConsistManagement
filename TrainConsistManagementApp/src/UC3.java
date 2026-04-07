import java.util.*;

public class UC3{

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("Unique bogie IDs: " + bogieIDs);
    }
}