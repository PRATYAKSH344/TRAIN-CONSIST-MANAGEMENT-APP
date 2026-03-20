import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ====================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * ====================================================
 *
 * UC5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This program demonstrates how LinkedHashSet maintains
 * insertion order while preventing duplicate bogies
 * in the train formation.
 *
 * Concepts:
 * - LinkedHashSet
 * - Set interface
 * - Automatic duplicate prevention
 * - Ordered iteration
 */

public class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("===========================================\n");

        // Create LinkedHashSet to maintain order and uniqueness
        Set<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt duplicate insertion
        trainFormation.add("Sleeper"); // duplicate, ignored

        // Display final train formation
        System.out.println("Final Train Formation (Insertion Order Preserved):");

        for (String bogie : trainFormation) {
            System.out.println(bogie);
        }
    }
}