import java.util.*;

public class UC20_EmptyCheck {

    public static void main(String[] args) {

        List<String> bogieIds = new ArrayList<>(); // Empty list

        try {
            searchBogie(bogieIds, "BG101");
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }

    // Search method with defensive check
    public static void searchBogie(List<String> bogieIds, String key) {

        // Step 1: Defensive check
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: No bogies available in the train.");
        }

        // Step 2: Search logic (Linear Search)
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Step 3: Display result
        if (found) {
            System.out.println("Bogie ID found!");
        } else {
            System.out.println("Bogie ID not found.");
        }
    }
}