import java.util.HashMap;
import java.util.Map;

/**
 * ====================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * ====================================================
 *
 * UC6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This program demonstrates how bogies can be mapped
 * to their seating or load capacity using HashMap.
 *
 * Concepts:
 * - HashMap
 * - Map interface
 * - Key–Value association
 * - entrySet() iteration
 */

public class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println("UC6 - Map Bogie to Capacity");
        System.out.println("===========================================\n");

        // Create HashMap to store bogie and capacity
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Iterate through the map and display details
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {

            String bogie = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println("Bogie: " + bogie + " | Capacity: " + capacity);
        }

        System.out.println("\nTotal Bogie Types: " + bogieCapacity.size());
    }
}

