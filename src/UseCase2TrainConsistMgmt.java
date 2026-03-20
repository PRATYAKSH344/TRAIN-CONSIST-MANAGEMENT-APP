import java.util.ArrayList;
import java.util.List;

/**
 * ====================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * ====================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 */

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=========================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // CREATE (Add bogies)
        passengerBogies.add("S1");
        passengerBogies.add("S2");
        passengerBogies.add("S3");

        System.out.println("Bogies after addition: " + passengerBogies);

        // READ (Display bogies)
        System.out.println("\nCurrent Train Consist:");
        for (String bogie : passengerBogies) {
            System.out.println("Bogie: " + bogie);
        }

        // CHECK (Check if a bogie exists)
        if (passengerBogies.contains("S2")) {
            System.out.println("\nBogie S2 is present in the train.");
        }

        // DELETE (Remove a bogie)
        passengerBogies.remove("S1");

        System.out.println("\nAfter removing S1:");

        // Display final consist
        System.out.println("Final Train Consist: " + passengerBogies);
    }
}