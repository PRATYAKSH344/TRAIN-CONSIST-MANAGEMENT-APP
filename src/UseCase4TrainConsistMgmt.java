import java.util.LinkedList;

/**
 * ====================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * ====================================================
 *
 * UC4: Maintain Ordered Bogie IDs
 *
 * Description:
 * This program demonstrates how LinkedList can be used
 * to maintain the physical order of train bogies.
 *
 * Operations performed:
 * - Add bogies at front and end
 * - Insert bogie in the middle
 * - Remove bogies from head and tail
 * - Display final train consist
 */

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=========================================");
        System.out.println("UC4 - Maintain Ordered Bogie IDs");
        System.out.println("=========================================\n");

        // Create LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter inserting Pantry Car at position 2:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter removing first and last bogie:");

        // Display final ordered consist
        System.out.println("Final Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}

