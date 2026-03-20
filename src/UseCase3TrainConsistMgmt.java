import java.util.HashSet;
import java.util.Set;

/**
 * ====================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * ====================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * This class ensures that duplicate bogie IDs are not
 * added into the train formation using HashSet.
 *
 * At this stage, the application:
 * - Stores bogie IDs
 * - Prevents duplicates automatically
 * - Displays unique bogie identifiers
 *
 * This maps uniqueness validation using Set.
 */

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("===========================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // Add IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101");
        bogies.add("BG102");

        // Display bogie IDs
        System.out.println("Unique Bogie IDs in Train Consist:");

        for (String bogie : bogies) {
            System.out.println("Bogie ID: " + bogie);
        }

        System.out.println("\nTotal Unique Bogies: " + bogies.size());
    }
}
