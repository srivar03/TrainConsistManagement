import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UC11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Train Consist Validation App ===");

        // Input Train ID
        System.out.print("Enter Train ID (format TRN-1234): ");
        String trainId = scanner.nextLine();

        // Input Cargo Code
        System.out.print("Enter Cargo Code (format PET-AB): ");
        String cargoCode = scanner.nextLine();

        // Regex patterns
        String trainIdPattern = "TRN-\\d{4}";
        String cargoCodePattern = "PET-[A-Z]{2}";

        // Compile patterns
        Pattern tPattern = Pattern.compile(trainIdPattern);
        Pattern cPattern = Pattern.compile(cargoCodePattern);

        // Match input
        Matcher tMatcher = tPattern.matcher(trainId);
        Matcher cMatcher = cPattern.matcher(cargoCode);

        // Validate Train ID
        if (tMatcher.matches()) {
            System.out.println("Train ID is valid: " + trainId);
        } else {
            System.out.println("Invalid Train ID format!");
        }

        // Validate Cargo Code
        if (cMatcher.matches()) {
            System.out.println("Cargo Code is valid: " + cargoCode);
        } else {
            System.out.println("Invalid Cargo Code format!");
        }

        scanner.close();
    }
}