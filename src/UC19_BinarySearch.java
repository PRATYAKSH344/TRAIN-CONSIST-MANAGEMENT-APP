import java.util.*;

public class UC19_BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Sorted array of bogie IDs (IMPORTANT)
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG450", "BG512"};

        // Step 2: Input search key
        System.out.print("Enter Bogie ID to search: ");
        String key = sc.nextLine();

        // Step 3: Initialize low and high
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        // Step 4: Binary Search
        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                high = mid - 1; // search left
            } else {
                low = mid + 1;  // search right
            }
        }

        // Step 5: Display result
        if (found) {
            System.out.println("Bogie ID found!");
        } else {
            System.out.println("Bogie ID not found.");
        }

        sc.close();
    }
}