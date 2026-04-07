// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    private String shape;  // Cylindrical / Rectangular
    private String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Method to assign cargo with validation
    public void assignCargo(String cargo) {
        try {
            // Rule: Petroleum NOT allowed in Rectangular bogie
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Assignment attempt completed.");
        }
    }

    @Override
    public String toString() {
        return shape + " Bogie carrying " + (cargo != null ? cargo : "No Cargo");
    }
}

// Main class
public class UC15_ExceptionHandling {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");  // Valid

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");  // Invalid → Exception handled

        System.out.println("Program continues safely...");
    }
}