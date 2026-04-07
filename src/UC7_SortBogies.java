import java.util.*;

// Bogie class
class Bogie {
    private String name;
    private int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // toString method for display
    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

// Main class
public class UC7_SortBogies {
    public static void main(String[] args) {

        // Step 1: Create list
        List<Bogie> bogies = new ArrayList<>();

        // Step 2: Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 50));
        bogies.add(new Bogie("General", 90));

        // Step 3: Sort using Comparator + Lambda
        bogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Step 4: Display sorted bogies
        System.out.println("Bogies sorted by capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}
