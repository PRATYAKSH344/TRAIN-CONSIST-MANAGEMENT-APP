import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC11_ValidateInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter Train ID (format: TRN-1234): ");
        String trainId = sc.nextLine();

        System.out.print("Enter Cargo Code (format: PET-AB): ");
        String cargoCode = sc.nextLine();

        // Step 2: Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // Step 3: Compile patterns
        Pattern trainPattern = Pattern.compile(trainRegex);
        Pattern cargoPattern = Pattern.compile(cargoRegex);

        // Step 4: Match inputs
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // Step 5: Validate
        if (trainMatcher.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}