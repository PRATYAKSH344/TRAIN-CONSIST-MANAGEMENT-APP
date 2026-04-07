// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie class
class PassengerBogie {
    private String name;
    private int capacity;

    // Constructor with validation
    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than 0");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

// Main class
public class UC14_CustomException {
    public static void main(String[] args) {

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println(b1);

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("Invalid", 0);
            System.out.println(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}