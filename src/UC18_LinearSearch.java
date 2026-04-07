import java.util.*;

public class UC18_LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG450", "BG512"};

        // Step 2: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        // Step 3: Linear Search
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break; // Early termination
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID found!");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}
